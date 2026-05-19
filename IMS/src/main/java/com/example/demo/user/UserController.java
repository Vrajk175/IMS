package com.example.demo.user;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("/staff")
	public String staff(Model model,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("sessionUser");
		 if(user == null ) {
	    		return "redirect:/login";
	    	}
		
		List<User> users = userservice.findAllUser();
		
		model.addAttribute("users", users);
		return "staff";
		
	}
	@PostMapping("/add-staff")
	public String addstaff(HttpServletRequest request) {
		User users = (User) request.getSession().getAttribute("sessionUser");
		 if(users == null ) {
	    		return "redirect:/login";
	    	}
		String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        String inputRole = request.getParameter("role");
        String inputName = request.getParameter("name");
        String inputAvatar = request.getParameter("avatar");
        
        User user = new User();
        
        user.setUsername(inputUsername);
        user.setName(inputName);
        user.setPassword(inputPassword);
        user.setAvatar(inputAvatar);
        user.setRole(inputRole);
        
        userservice.addUser(user);
        
        return "redirect:/staff";
        
	}
	@GetMapping("/profile")
	public String profile(Model model,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("sessionUser");
		 if(user == null ) {
	    		return "redirect:/login";
	    	}
		User users = userservice.findByUsername("superadmin"); 
		model.addAttribute("users", users);
		return "profile";
	}

}
