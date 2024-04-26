package parkinglot.models;

import java.util.Date;

public class Ticket {
    String number;

    Date entryTime;

    Vehicle vehicle;

    Slot parkingSlots;

    Gate genratedGate;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Slot getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(Slot parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Gate getGenratedGate() {
        return genratedGate;
    }

    public void setGenratedGate(Gate genratedGate) {
        this.genratedGate = genratedGate;
    }
}
