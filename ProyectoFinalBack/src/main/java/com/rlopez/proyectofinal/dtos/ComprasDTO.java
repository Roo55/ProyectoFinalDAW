package com.rlopez.proyectofinal.dtos;

public class ComprasDTO {

	 private Integer id;
	    private String fechaCompra;
	    private Integer idCliente;
	    private Integer idSuscripcion;

	    public ComprasDTO() {
	    }

	    public ComprasDTO(Integer id, String fechaCompra, Integer idCliente, Integer idSuscripcion) {
	        this.id = id;
	        this.fechaCompra = fechaCompra;
	        this.idCliente = idCliente;
	        this.idSuscripcion = idSuscripcion;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getFechaCompra() {
	        return fechaCompra;
	    }

	    public void setFechaCompra(String fechaCompra) {
	        this.fechaCompra = fechaCompra;
	    }

	    public Integer getIdCliente() {
	        return idCliente;
	    }

	    public void setIdCliente(Integer idCliente) {
	        this.idCliente = idCliente;
	    }

	    public Integer getIdSuscripcion() {
	        return idSuscripcion;
	    }

	    public void setIdSuscripcion(Integer idSuscripcion) {
	        this.idSuscripcion = idSuscripcion;
	    }
	
}
