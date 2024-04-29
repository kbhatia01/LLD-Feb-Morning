package parkinglot.DTO;

import parkinglot.models.Gate;
import parkinglot.models.Slot;
import parkinglot.models.Vehicle;

import java.util.Date;

public class IssueTicketResponse {

    private String ticketNumber;

    private Date entryTime;

    private Slot slot;

    private Vehicle vehicle;

    private String FailureString;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getFailureString() {
        return FailureString;
    }

    public void setFailureString(String failureString) {
        FailureString = failureString;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    private String StatusCode;

}
