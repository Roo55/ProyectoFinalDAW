package com.rlopez.proyectofinal.dtos;

public class SuscripcionesDTO {

    private Integer id;
    private String tipoSuscripcion;
    private Double precio;
    private Integer duracion;

    public SuscripcionesDTO() {}

    public SuscripcionesDTO(Integer id, String tipoSuscripcion, Double precio, Integer duracion) {
        this.id = id;
        this.tipoSuscripcion = tipoSuscripcion;
        this.precio = precio;
        this.duracion = duracion;
    }
    
    

    public SuscripcionesDTO(String tipoSuscripcion, Double precio, Integer duracion) {
		super();
		this.tipoSuscripcion = tipoSuscripcion;
		this.precio = precio;
		this.duracion = duracion;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
	
}
