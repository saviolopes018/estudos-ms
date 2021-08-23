package com.hruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hruser.model.User;
import com.hruser.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired private UserRepository repository;

	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		
		return ResponseEntity.ok(repository.findById(id).get());
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		
		return ResponseEntity.ok(repository.findByEmail(email));
	}
	
}
