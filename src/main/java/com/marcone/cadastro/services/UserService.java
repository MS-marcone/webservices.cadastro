package com.marcone.cadastro.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.marcone.cadastro.entities.User;
import com.marcone.cadastro.repositories.UserRepository;
import com.marcone.cadastro.services.exceptions.DatabaseException;
import com.marcone.cadastro.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	public List<User> findAll() {
		return ur.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = ur.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return ur.save(obj);
	}

	public void delete(Long id) {
		try {
			ur.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());

		}
	}

	// metodo getone ele
	public User atualizar(Long id, User obj) {
		try {
		User entity = ur.getReferenceById(id);
		updateData(entity, obj);
		return ur.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}
}
