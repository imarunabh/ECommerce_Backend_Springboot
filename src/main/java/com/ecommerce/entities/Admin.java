package com.ecommerce.entities;

import com.ecommerce.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "admin")
@Data
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
    private String address;
	
	private UserRole role = UserRole.CUSTOMER;
	
	private String phoneNumber;
	

}
