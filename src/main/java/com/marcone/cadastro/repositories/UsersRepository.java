package com.marcone.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcone.cadastro.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	

}
