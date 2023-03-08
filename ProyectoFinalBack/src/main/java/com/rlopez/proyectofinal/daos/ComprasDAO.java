package com.rlopez.proyectofinal.daos;

import java.util.List;

import com.rlopez.proyectofinal.dtos.ComprasDTO;

public interface ComprasDAO {

	
	List<ComprasDTO> buscarCompraPorIdFecha(Integer id, String fechaCompra, Integer idCliente, Integer idSuscripcion);
	Integer insertarCompra(String fechaCompra, Integer idCliente, Integer idSuscripcion);
}
