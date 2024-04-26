package parkinglot.models;

import java.util.List;

public class Floor extends BaseModel{
    private List<Slot> parkingSlotsList;
    int floorNumber;

    FloorStatus floorStatus;

    List<VehicleType> allowedVehicles;

    public List<Slot> getParkingSlotsList() {
        return parkingSlotsList;
    }

    public void setParkingSlotsList(List<Slot> parkingSlotsList) {
        this.parkingSlotsList = parkingSlotsList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
