package com.rlopez.proyectofinal.controllers;


import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlopez.proyectofinal.dtos.SuscripcionCompraDTO;
import com.rlopez.proyectofinal.dtos.response.MessageResponse;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.entities.ComprasEntity;
import com.rlopez.proyectofinal.entities.SuscripcionesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;
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
	@Autowired
	private ClientesRepository clienteRepository;
	
	  @PostMapping("/insertarpago")
	  public ResponseEntity<?> createSuscripcionCompra(@RequestBody SuscripcionCompraDTO suscripcion, ComprasEntity compra) {

		  ClientesEntity cliente = clienteRepository.findById(suscripcion.getId_cliente()).orElseThrow(() -> new EntityNotFoundException("Cliente no encontrado"));
		  
		  SuscripcionesEntity suscripcionNueva = new SuscripcionesEntity(cliente,suscripcion.getTipo_suscripcion(),suscripcion.getPrecio(),suscripcion.getDuracion());
		  suscripcionRepository.save(suscripcionNueva);
		  
			 LocalDate currentDate = LocalDate.now();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        String fechaHoy = currentDate.format(formatter);
		  
		  ComprasEntity compraNueva = new ComprasEntity(cliente,suscripcionNueva,fechaHoy);
		  compraRepository.save(compraNueva);

		return ResponseEntity.ok(new MessageResponse("Pago exitoso!"));

	   
	  }
	
}
