package com.vbakhmatiuk.flightservice.api.rest;

import com.vbakhmatiuk.flightservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.internal.Ticket;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/flightservice/tickets")
public class FlightController extends AbstractRequestHandler {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Ticket getTicketById(
            @PathVariable("id") Long id,
            HttpServletRequest request,
            HttpServletResponse response) {
//        Ticket ticket = this.ticketService.getTicket(id);
return null;
    }
}