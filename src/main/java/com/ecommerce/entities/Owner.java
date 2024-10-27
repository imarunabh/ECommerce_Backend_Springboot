package com.ecommerce.entities;

import com.ecommerce.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
@Entity
@Table(name = "owner")
@Data
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String firstName;

	private String middleName;
	
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private String address;
	
	private UserRole role = UserRole.OWNER;
	
	private String phoneNumber;
	


}
