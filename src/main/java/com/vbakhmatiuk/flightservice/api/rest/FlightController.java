package com.vbakhmatiuk.flightservice.api.rest;

import com.vbakhmatiuk.flightservice.domain.Ticket;
import com.vbakhmatiuk.flightservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/flightservice")
public class FlightController extends AbstractRequestHandler {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/tickets/{id}",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Ticket getTicketById(
            @PathVariable("id") Long id,
            HttpServletRequest request,
            HttpServletResponse response) {
        Ticket ticket = this.ticketService.getTicket(id);
        checkResourceFound(ticket);
        return ticket;
    }
}