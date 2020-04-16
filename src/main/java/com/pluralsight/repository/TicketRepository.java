package com.pluralsight.repository;

import com.pluralsight.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
