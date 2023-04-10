package com.rlopez.proyectofinal.daos;

import java.util.List;

import com.rlopez.proyectofinal.dtos.ClientesDTO;

public interface ClientesDAO {

	
	List<ClientesDTO> buscarClientePorIdNombreApellido(Integer id,String nombre,String apellido,String fechaNacimiento,String direccion,String correoElectronico,String numeroTelefono,String contrasena);
	Integer insertarCliente(String nombre, String apellido, String fechaNacimiento, String direccion, String email,
			String numeroTelefono, String password, String username);


}
