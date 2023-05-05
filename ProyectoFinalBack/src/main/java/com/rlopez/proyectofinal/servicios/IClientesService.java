package com.rlopez.proyectofinal.servicios;

public interface IClientesService {

	Integer insertarCliente(Integer id,String nombre,String apellido,String fechaNacimiento,String direccion,String correoElectronico,String numeroTelefono,String contrasena);
	
}
