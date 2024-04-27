package org.example.parkinglotsst.Dtos;
import lombok.Getter;
import lombok.Setter;
import org.example.parkinglotsst.Models.Ticket;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}