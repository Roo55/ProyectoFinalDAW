package com.rlopez.proyectofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.rlopez.proyectofinal.daos","com.rlopez.proyectofinal.seguridad","com.rlopez.proyectofinal.controllers","com.rlopez.proyectofinal.daoimpl","com.rlopez.proyectofinal.daos","com.rlopez.proyectofinal.dtos"})

public class ProyectoFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
