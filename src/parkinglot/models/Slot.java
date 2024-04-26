package parkinglot.models;

public class Slot extends BaseModel{
    private int slotNumber;
    VehicleType vehicleType;

    slotStatus parkingSLotStatus;
    Floor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public slotStatus getParkingSLotStatus() {
        return parkingSLotStatus;
    }

    public void setParkingSLotStatus(slotStatus parkingSLotStatus) {
        this.parkingSLotStatus = parkingSLotStatus;
    }

    public Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
