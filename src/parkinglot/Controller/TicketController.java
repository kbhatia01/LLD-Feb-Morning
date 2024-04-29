package parkinglot.Controller;

import parkinglot.DTO.IssueTicketRequest;
import parkinglot.DTO.IssueTicketResponse;
import parkinglot.Services.TokenService;
import parkinglot.models.Gate;
import parkinglot.models.Ticket;

public class TicketController {

    private TokenService tokenService;
    public TicketController(TokenService tokenService){
        this.tokenService = tokenService;
    }


    public IssueTicketResponse IssueTicket(IssueTicketRequest request){

        IssueTicketResponse response = new IssueTicketResponse();
        try {
            Ticket t = tokenService.IssueTicket(request.getVehicleNo(),request.getOwnerName(),
                    request.getGateId(), request.getVehicleType());
            response.setSlot(t.getParkingSlots());
            response.setStatusCode("Success");
            response.setEntryTime(t.getEntryTime());
            response.setVehicle(t.getVehicle());
            response.setTicketNumber(t.getNumber());
        } catch (Exception e){

            response.setStatusCode("FAILURE");
            response.setFailureString(e.toString());

        }

        return response;

    }


}

// 1. need to interact with client
// 2. client send request -> validate that..
// 3. call service for business logic..
// 4. response from service send back to client..

//classController{
    //DTO: auth token, class_id
//    AuthService
//   classService..
//}
