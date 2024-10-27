package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{
	
	Optional<Owner> findFirstByEmail(String email);

}
