package com.rlopez.proyectofinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
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
	
	  @GetMapping("/all")
	  public String allAccess() {
	    return "Public Content.";
	  }

	  @GetMapping("/user")
	  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	  public String userAccess() {
	    return "User Content.";
	  }

	  @GetMapping("/mod")
	  @PreAuthorize("hasRole('MODERATOR')")
	  public String moderatorAccess() {
	    return "Moderator Board.";
	  }

	  @GetMapping("/admin")
	  @PreAuthorize("hasRole('ADMIN')")
	  public String adminAccess() {
	    return "Admin Board.";
	  }
	
}
