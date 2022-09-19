package com.marcone.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcone.cadastro.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
