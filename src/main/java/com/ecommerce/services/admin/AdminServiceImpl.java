package com.ecommerce.services.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.entities.Admin;
import com.ecommerce.entities.Users;
import com.ecommerce.enums.UserRole;
import com.ecommerce.repository.AdminRepository;
import com.ecommerce.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private UserRepository userRepository;
	
//	@PostConstruct
	public void createAdmin() {
		Admin admin = new Admin();
		admin.setAddress("AdminAddress");
		admin.setEmail("admin@test.com");
		admin.setFirstName("Admin");
		admin.setPassword(new BCryptPasswordEncoder().encode("admin"));
		adminRepository.save(admin);
		
		Users user= new Users();
		user.setEmail("admin@test.com");
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		user.setRole(UserRole.ADMIN);
		userRepository.save(user);
	}
}
