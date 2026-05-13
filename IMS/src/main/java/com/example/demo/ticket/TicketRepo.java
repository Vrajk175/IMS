package com.example.demo.ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {

	Ticket findById(long ticket_id);
	List<Ticket> findByStatus(String status);
}