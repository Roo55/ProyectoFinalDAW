package com.rlopez.proyectofinal.servicios;

import java.util.List;

import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;

public interface ISuscripcionesService {

	List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipoSuscripcion, Double precio, Integer duracion);
	Integer insertarSuscripcion(String idCliente,String tipo_suscripcion, String precio, String duracion);
	
}
