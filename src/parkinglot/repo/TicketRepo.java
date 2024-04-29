package parkinglot.repo;

import parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TicketRepo {
    int PreviousId = -1;

    private Map<Integer, Ticket> ticketMap = new HashMap<>();

    public Ticket saveTicket(Ticket t){
        int newNumber = PreviousId+1;
        t.setId(newNumber);
        t.setNumber(newNumber+"");

        ticketMap.put(newNumber, t);
        PreviousId+=1;
        return t;


    }
}
