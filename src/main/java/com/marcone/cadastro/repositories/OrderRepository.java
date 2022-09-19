package com.marcone.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcone.cadastro.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
