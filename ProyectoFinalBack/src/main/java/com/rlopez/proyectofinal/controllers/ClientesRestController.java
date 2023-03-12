package com.rlopez.proyectofinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/gymc")
public class ClientesRestController {

	@Autowired
	private ClientesRepository clientesRepository;
	@Autowired
	ClientesDAO clientesDAO;
	
	@PostMapping("/clientesinsert")
	public ResponseEntity<String> insertarCliente(@RequestBody ClientesEntity cliente){
		
		clientesRepository.save(new ClientesEntity(cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.getFechaNacimiento(),cliente.getDireccion(),cliente.getCorreoElectronico(),cliente.getNumeroTelefono(),cliente.getContrasena()));
		
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.CREATED);
	}
	
}
