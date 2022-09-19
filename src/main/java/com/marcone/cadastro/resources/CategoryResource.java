package com.marcone.cadastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcone.cadastro.entities.Category;
import com.marcone.cadastro.services.CategoryService;

@RestController
@RequestMapping(value= "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService cs;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = cs.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = cs.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
