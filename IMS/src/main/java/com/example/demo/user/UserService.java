package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		@Autowired 
		private UserRepo userrepo;

	public List<User> findAllUser(){
		return userrepo.findAll();
	
}
	
		public void addUser(User user) {
			userrepo.save(user);
		}
		
		public User findByUsername(String username) {
			return userrepo.findByUsername(username);
		}
		
		public List<User> findByRole(String role) {
		    return userrepo.findByRole(role);
		}
		
}
