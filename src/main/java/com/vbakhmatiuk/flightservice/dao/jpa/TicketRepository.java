package com.vbakhmatiuk.flightservice.dao.jpa;

import com.vbakhmatiuk.flightservice.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}