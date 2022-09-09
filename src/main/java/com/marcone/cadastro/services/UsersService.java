package com.marcone.cadastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcone.cadastro.entities.Users;
import com.marcone.cadastro.repositories.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository up;

	public List<Users> findAll(){
		return up.findAll();
	}
	
	public Users findById(Long id){
		Optional<Users> obj = up.findById(id);
		return obj.get();
	}
}
