package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findFirstByEmail(String email);

}
