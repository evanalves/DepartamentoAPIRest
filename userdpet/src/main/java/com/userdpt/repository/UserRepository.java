package com.userdpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userdpt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
