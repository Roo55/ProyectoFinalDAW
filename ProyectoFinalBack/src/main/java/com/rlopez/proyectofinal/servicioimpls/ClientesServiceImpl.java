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
	public Integer insertarCliente(Integer id, String nombre, String apellido, String fechaNacimiento, String direccion,
			String correoElectronico, String numeroTelefono, String contrasena) {
		// TODO Auto-generated method stub
		return clientes.insertarCliente(id, nombre, apellido, fechaNacimiento, direccion, correoElectronico, numeroTelefono, contrasena);
	}

}
