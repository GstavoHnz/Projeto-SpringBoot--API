package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.userRepository;



@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired // Injeção de dependencia.
	private userRepository repository;
	
	@GetMapping //Identifica qual Verbo Web. GET or POST
 	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
 	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping //Metodo para inserir um novo usuario no Banco.
 	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
 
}
