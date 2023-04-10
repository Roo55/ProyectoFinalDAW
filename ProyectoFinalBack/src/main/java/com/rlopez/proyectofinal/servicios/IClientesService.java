package com.rlopez.proyectofinal.servicios;

public interface IClientesService {

	Integer insertarCliente(String nombre, String apellido, String fechaNacimiento, String direccion, String email,
			String numeroTelefono, String password, String username);
	
}
