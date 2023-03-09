package com.rlopez.proyectofinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;

@RestController
@RequestMapping("/gym")
public class ClientesRestController {

	@Autowired
	private ClientesRepository clientesRepository;
	@Autowired
	ClientesDAO clientesDAO;
	
	@PostMapping("/clientesinsert")
	public ResponseEntity<String> insertarCliente(@RequestBody ClientesEntity cliente){
		
		clientesRepository.save(cliente);
		
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
	}
	
}
