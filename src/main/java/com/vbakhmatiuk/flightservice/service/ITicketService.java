package com.vbakhmatiuk.flightservice.service;

import com.vbakhmatiuk.flightservice.domain.Ticket;

public interface ITicketService {

    Ticket getTicket(Long id);
}
