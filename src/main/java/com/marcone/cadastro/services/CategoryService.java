package com.marcone.cadastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcone.cadastro.entities.Category;
import com.marcone.cadastro.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository up;

	public List<Category> findAll(){
		return up.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> obj = up.findById(id);
		return obj.get();
	}
}
