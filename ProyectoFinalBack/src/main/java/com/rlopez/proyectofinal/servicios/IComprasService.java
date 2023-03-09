package com.rlopez.proyectofinal.servicios;

import java.util.List;

import com.rlopez.proyectofinal.dtos.ComprasDTO;

public interface IComprasService {

	List<ComprasDTO> buscarCompraPorIdFecha(Integer id, String fechaCompra, Integer idCliente, Integer idSuscripcion);
	Integer insertarCompra(String fechaCompra, Integer idCliente, Integer idSuscripcion);
	
}
