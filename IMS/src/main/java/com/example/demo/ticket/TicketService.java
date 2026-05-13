package com.example.demo.ticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRepo ticrepo;
	
	public List<Ticket> findAllTicket() {
		return ticrepo.findAll();
	}
	
	public void addTicket(Ticket ticket) {
		ticrepo.save(ticket);
	}
	
	public Ticket findTicket(long ticket_id) {
		return ticrepo.findById(ticket_id);
	}
	
	public void changeStatus(long ticket_id,String status) {
		
		Ticket oldTicket=ticrepo.findById(ticket_id);
		
		if(oldTicket != null) {
			
			oldTicket.setStatus(status);
			
			ticrepo.save(oldTicket);
		}
	}
	
	public List<Ticket> showStatus(String status){
		return ticrepo.findByStatus(status);
	}
	
	
	 public void delTicket(long ticket_id) {
		  ticrepo.deleteById(ticket_id);
		  }
	
	
	
}
