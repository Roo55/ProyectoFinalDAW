package com.rlopez.proyectofinal.servicioimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlopez.proyectofinal.daos.SuscripcionesDAO;
import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;
import com.rlopez.proyectofinal.servicios.ISuscripcionesService;

@Service
public class SuscripcionesServiceImpl implements ISuscripcionesService{

	@Autowired
	SuscripcionesDAO suscripciones;
	
	@Override
	public List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipoSuscripcion, Double precio,
			Integer duracion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarSuscripcion(String idCliente,String tipo_suscripcion, String precio, String duracion) {
		// TODO Auto-generated method stub
		return suscripciones.insertarSuscripcion(idCliente, tipo_suscripcion, precio, duracion);
	}

}
