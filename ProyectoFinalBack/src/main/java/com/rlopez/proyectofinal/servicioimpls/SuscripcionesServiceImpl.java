package com.rlopez.proyectofinal.servicioimpls;

import java.util.List;

import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;
import com.rlopez.proyectofinal.servicios.ISuscripcionesService;

public class SuscripcionesServiceImpl implements ISuscripcionesService{

	@Override
	public List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipoSuscripcion, Double precio,
			Integer duracion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarSuscripcion(String tipoSuscripcion, Double precio, Integer duracion) {
		// TODO Auto-generated method stub
		return null;
	}

}
