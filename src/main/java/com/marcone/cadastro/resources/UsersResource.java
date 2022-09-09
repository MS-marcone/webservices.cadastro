package com.marcone.cadastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcone.cadastro.entities.Users;
import com.marcone.cadastro.services.UsersService;

@RestController
@RequestMapping(value= "/users")
public class UsersResource {
	
	@Autowired
	private UsersService us;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		List<Users> list = us.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id){
		Users obj = us.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
