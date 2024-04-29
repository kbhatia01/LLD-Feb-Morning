package parkinglot.Services;

import parkinglot.models.*;
import parkinglot.repo.*;
import parkinglot.stratergy.SlotAssignmentStratergy;
import parkinglot.stratergy.getSlotFactory;

import java.util.Date;
import java.util.InvalidPropertiesFormatException;
import java.util.Optional;

public class TokenService {

    private GateRepo gr;
    private VehicleRepo vehicleRepo;

    private SlotRepo slotRepo;

    private ParkingLotRepo parkingLotRepo;

    private TicketRepo ticketRepo;
    public TokenService(GateRepo gr, VehicleRepo vehicleRepo,
                        SlotRepo slotRepo,
                        ParkingLotRepo parkingLotRepo,
                        TicketRepo ticketRepo){
        this.gr = gr;
        this.vehicleRepo = vehicleRepo;
        this.slotRepo = slotRepo;

        this.parkingLotRepo = parkingLotRepo;
        this.ticketRepo = ticketRepo;
    }

    public Ticket IssueTicket(String vehicleNumber,
                              String vehicleOwner,
                              int gateId,
                              VehicleType vehicleType) {

        // create a ticket
        Ticket t = new Ticket();
        // store entry time and other info..
        t.setEntryTime(new Date());
        Optional<Gate> gateOptional = gr.findGateById(gateId);
        if(gateOptional.isEmpty()){
            System.out.println("Gate is empty..");
            return null;
        }
        Gate g = gateOptional.get();
        t.setGenratedGate(g);

        Vehicle v;
        Optional<Vehicle> vehicleOptional = vehicleRepo.findVehicleByNumber(vehicleNumber);

        if(vehicleOptional.isEmpty()){
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleName(vehicleNumber);
            newVehicle.setVehicleType(vehicleType);
            newVehicle.setOwnerName(vehicleOwner);

            v = vehicleRepo.saveVehicle(newVehicle);

        } else {
            v=  vehicleOptional.get();
        }
        t.setVehicle(v);

        // find a slot and change the slot status

        SlotAssignmentStratergy stratergy = getSlotFactory.getSlotStrategy(g.getParkingLot().getSlotAssignmentStrategy());

        if(stratergy == null){
            throw new RuntimeException("Stratergy implementation missing..");
        }
        Optional<Slot> slotOptional = stratergy.getSlot(vehicleType, g);

        if(slotOptional.isEmpty()){
            throw new RuntimeException("No empty slot available");
        }

        Slot s = slotOptional.get();

        t.setParkingSlots(s);
//        s.setParkingSLotStatus(slotStatus.FILLED);
        slotRepo.updateSlot(s, slotStatus.FILLED);


        parkingLotRepo.updateCountById(g.getParkingLot());



        // save ticket to db;

        Ticket finalTicketWithId = ticketRepo.saveTicket(t);

        System.out.println("Final ticket is" + finalTicketWithId.getId());

        // return the token

        return finalTicketWithId;

    }
}
