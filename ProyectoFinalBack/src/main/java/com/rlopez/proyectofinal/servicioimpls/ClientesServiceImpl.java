package com.rlopez.proyectofinal.servicioimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;
import com.rlopez.proyectofinal.servicios.IClientesService;
@Service
public class ClientesServiceImpl implements IClientesService{

	@Autowired
	ClientesDAO clientes;
	@Autowired
	ClientesRepository clientesRepository;
	
	@Override
	public Integer insertarCliente(String nombre, String apellido, String fechaNacimiento, String direccion, String email,
			String numeroTelefono, String password, String username) {
		// TODO Auto-generated method stub
		return clientes.insertarCliente(nombre, apellido, fechaNacimiento, direccion, email,
				numeroTelefono, password, username);
	}

}
