package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	Optional<Users> findFirstByEmail(String email);
}
