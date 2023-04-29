package com.rlopez.proyectofinal.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlopez.proyectofinal.entities.ComprasEntity;
import com.rlopez.proyectofinal.entities.SuscripcionesEntity;
import com.rlopez.proyectofinal.repositorios.ComprasRepository;
import com.rlopez.proyectofinal.repositorios.SuscripcionesRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/pay")
public class SuscripcionesRestController {

	@Autowired
	private SuscripcionesRepository suscripcionRepository;
	@Autowired
	private ComprasRepository compraRepository;
	
	
	  @PostMapping("/insertarpago")
	  public ResponseEntity<String> createSuscripcionCompra(@RequestBody SuscripcionesEntity suscripcion, ComprasEntity compra) {

	   suscripcionRepository.save(suscripcion);
	   compraRepository.save(compra);

		return new ResponseEntity<>("Inserción correcta", HttpStatus.OK);

	  }
	
}
