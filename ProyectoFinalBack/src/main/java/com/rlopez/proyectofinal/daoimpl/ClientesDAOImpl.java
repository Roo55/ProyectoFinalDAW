package com.rlopez.proyectofinal.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rlopez.proyectofinal.daos.ClientesDAO;
import com.rlopez.proyectofinal.dtos.ClientesDTO;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;
@Component
public class ClientesDAOImpl implements ClientesDAO{

	@Autowired
	ClientesRepository clientesRepository;

	@Override
	public List<ClientesDTO> buscarClientePorIdNombreApellido(Integer id, String nombre, String apellido,
			String fechaNacimiento, String direccion, String correoElectronico, String numeroTelefono,
			String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarCliente(Integer id,String nombre, String apellido, String fechaNacimiento, String direccion,
			String correoElectronico, String numeroTelefono, String contrasena) {
		
		ClientesEntity cliente = new ClientesEntity(id,nombre,apellido,fechaNacimiento,direccion,correoElectronico,numeroTelefono,contrasena);
		
		clientesRepository.save(cliente);
		
		return cliente.getId();
	}

}
