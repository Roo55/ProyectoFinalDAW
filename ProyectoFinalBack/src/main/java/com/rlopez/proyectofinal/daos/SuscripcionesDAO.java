package com.rlopez.proyectofinal.daos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rlopez.proyectofinal.dtos.SuscripcionesDTO;

public interface SuscripcionesDAO {

	List<SuscripcionesDTO> buscarSuscripcionPorId(Integer id, String tipo_suscripcion, Double precio, Integer duracion);
	Integer insertarSuscripcion(String idCliente,String tipo_suscripcion, String precio, String duracion);

}
