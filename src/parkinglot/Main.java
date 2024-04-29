package parkinglot;

import parkinglot.Controller.TicketController;
import parkinglot.DTO.IssueTicketRequest;
import parkinglot.DTO.IssueTicketResponse;
import parkinglot.Services.TokenService;
import parkinglot.models.VehicleType;
import parkinglot.repo.*;

public class Main {
    public static void main(String[] args) {

        GateRepo gr = new GateRepo();
        // TODO: populate data..
        VehicleRepo vr = new VehicleRepo();
        // TODO: populate data..
        SlotRepo sr = new SlotRepo();
        // TODO: populate data..

        ParkingLotRepo parkingLotRepo =new ParkingLotRepo();
        // TODO: populate data..

        TicketRepo ticketRepo = new TicketRepo();
        TokenService tokenService =new TokenService(gr,
                vr,sr,parkingLotRepo,ticketRepo);

        TicketController ticketController = new TicketController(tokenService);


        IssueTicketRequest request = new IssueTicketRequest();

        request.setGateId(1);
        request.setOwnerName("abc");
        request.setVehicleNo("124");
        request.setVehicleType(VehicleType.CAR);

        // RESPONSE DTO..
        IssueTicketResponse response = ticketController.IssueTicket(request);


        // BILL GENERATE..


    }
}
