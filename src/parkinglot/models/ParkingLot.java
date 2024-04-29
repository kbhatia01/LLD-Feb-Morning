package parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<Floor> parkingFloor;

    private List<Gate> gates;

    private String name;

    private String address;

    List<VehicleType> allowedVehicles;

    int capacity;

    private ParkingLotStatus status;

    private SlotAssignmentStrategyEnum slotAssignmentStrategy;

    public SlotAssignmentStrategyEnum getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategyEnum slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }

    public List<Floor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<Floor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
