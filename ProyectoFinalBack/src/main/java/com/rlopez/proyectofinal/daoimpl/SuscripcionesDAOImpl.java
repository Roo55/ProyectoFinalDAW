package com.rlopez.proyectofinal.daoimpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rlopez.proyectofinal.daos.SuscripcionesDAO;
import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;
import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.entities.ComprasEntity;
import com.rlopez.proyectofinal.entities.SuscripcionesEntity;
import com.rlopez.proyectofinal.repositorios.ClientesRepository;
import com.rlopez.proyectofinal.repositorios.ComprasRepository;
import com.rlopez.proyectofinal.repositorios.SuscripcionesRepository;

public class SuscripcionesDAOImpl implements SuscripcionesDAO{

	@Autowired
	ComprasRepository comprasRepository;
	@Autowired
	SuscripcionesRepository suscripcionRepository;
	@Autowired
	ClientesRepository clienteRepository;
	
	@Override
	public Integer insertarSuscripcion(String idCliente,String tipo_suscripcion, String precio, String duracion) {
		ClientesEntity cliente = clienteRepository.findById(Integer.parseInt(idCliente)).get();
		
		SuscripcionesEntity s = new SuscripcionesEntity(cliente,tipo_suscripcion,precio,duracion);
		
		suscripcionRepository.save(s);
		
		 LocalDate currentDate = LocalDate.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String fechaHoy = currentDate.format(formatter);
	        
		ComprasEntity c = new ComprasEntity(cliente,s,fechaHoy);
		
		Integer idPk = comprasRepository.save(c).getId();
		
		return idPk;
	}

	@Override
	public List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipo_suscripcion, Double precio,
			Integer duracion) {
		// TODO Auto-generated method stub
		return null;
	}

}
