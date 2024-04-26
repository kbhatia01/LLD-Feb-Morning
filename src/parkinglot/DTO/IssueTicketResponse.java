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

}
