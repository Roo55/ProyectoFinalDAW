package com.rlopez.proyectofinal.daos;

import java.util.List;

import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;

public interface SuscripcionesDAO {

	List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipoSuscripcion, Double precio, Integer duracion);
	Integer insertarSuscripcion(String tipoSuscripcion, Double precio, Integer duracion);

}
