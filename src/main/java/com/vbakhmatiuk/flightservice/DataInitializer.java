package com.vbakhmatiuk.flightservice;

import com.vbakhmatiuk.flightservice.dao.jpa.TicketRepository;
import com.vbakhmatiuk.flightservice.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        ticketRepository.save(new Ticket("Ingvar Johanson", "One way ticket!"));
        ticketRepository.save(new Ticket("Ragnar Ragnarson", "One way ticket!"));
        ticketRepository.save(new Ticket("Utred Ivarson", "One way ticket!"));
    }
}

