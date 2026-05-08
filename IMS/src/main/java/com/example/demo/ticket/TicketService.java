package com.example.demo.ticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRepo db;
	
	public List<Ticket> findAllTicket() {
		return db.findAll();
	}
	
	public void addTicket(Ticket ticket) {
		db.save(ticket);
	}
	
	// updateTicket
	
	
	// deleteTicket 
	
}
