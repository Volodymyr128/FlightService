package com.vbakhmatiuk.flightservice.service;

import com.vbakhmatiuk.flightservice.dao.jpa.TicketRepository;
import com.vbakhmatiuk.flightservice.domain.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService implements ITicketService {

    private static final Logger log = LoggerFactory.getLogger(TicketService.class);

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket getTicket(Long id) {
        log.debug("Trying to get ticket by id");
        return ticketRepository.findOne(id);
    }

}
