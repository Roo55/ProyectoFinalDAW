package com.rlopez.proyectofinal.dtos;

public class SuscripcionCompraDTO {
	
	private Integer id_suscripcion;
	private Integer id_cliente;
	private String tipo_suscripcion;
	private String precio;
	private String duracion;
	
	public SuscripcionCompraDTO(Integer id_cliente, String tipo_suscripcion, String precio, String duracion) {
		super();
		this.id_cliente = id_cliente;
		this.tipo_suscripcion = tipo_suscripcion;
		this.precio = precio;
		this.duracion = duracion;
	}

	public Integer getId_suscripcion() {
		return id_suscripcion;
	}

	public void setId_suscripcion(Integer id_suscripcion) {
		this.id_suscripcion = id_suscripcion;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getTipo_suscripcion() {
		return tipo_suscripcion;
	}

	public void setTipo_suscripcion(String tipo_suscripcion) {
		this.tipo_suscripcion = tipo_suscripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	

}
