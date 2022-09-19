package com.marcone.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcone.cadastro.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
