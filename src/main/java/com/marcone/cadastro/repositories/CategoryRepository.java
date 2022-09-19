package com.marcone.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcone.cadastro.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
