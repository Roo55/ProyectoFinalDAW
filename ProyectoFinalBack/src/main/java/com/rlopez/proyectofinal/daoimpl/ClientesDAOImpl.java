package com.rlopez.proyectofinal.daoimpl;

import java.util.List;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.dtos.ClientesDTO;

public class ClientesDAOImpl implements ClientesDAO{


	@Override
	public List<ClientesDTO> buscarClientePorIdNombreApellido(Integer id, String nombre, String apellido,
			String fechaNacimiento, String direccion, String correoElectronico, String numeroTelefono,
			String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarCliente(String nombre, String apellido, String fechaNacimiento, String direccion,
			String correoElectronico, String numeroTelefono, String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}

}
