package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findByUsernameAndPassword(String username, String password);
	
	User findByIdAndUsername(Long id, String username);
	
	User findByUsernameOrEmailOrPhone(String username, String email, String phone);
}
