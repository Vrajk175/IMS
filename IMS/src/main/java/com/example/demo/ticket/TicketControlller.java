package com.example.demo.ticket;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketControlller {
	
	@Autowired
	public TicketService service;


	@RequestMapping("/test")
	public String home() {
		
		Ticket ticket = new Ticket();
		ticket.setStatus(Status.NEW);
		ticket.setTitle("New Test Ticket 3");
		
		service.addTicket(ticket);
		
		return "success";
	}
	
	@RequestMapping("/list")
	public String list() {
		
		
		List<Ticket> list = service.findAllTicket();
		
		System.out.println("LIST:: "+ list);
		return "success";
	}
	
	/*GET - > DB -> controller -> view (Model)
	 * request.getParamenter("name") -> ticket.setName();
	 * 
	 * form Binding
	 * View Ticket -> controller -> Service -> db
	 * 
	 * 
	 * 
	 */
}
