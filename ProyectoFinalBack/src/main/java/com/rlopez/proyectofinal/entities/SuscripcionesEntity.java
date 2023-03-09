package com.rlopez.proyectofinal.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suscripciones")
public class SuscripcionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suscripcion")
    private Integer id;

    @Column(name = "tipo_suscripcion")
    private String tipoSuscripcion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "duracion")
    private Integer duracion;

    @OneToMany(mappedBy = "subscripcion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComprasEntity> compras;


	public SuscripcionesEntity() {
		super();
	}

	public SuscripcionesEntity(Integer id, String tipoSuscripcion, Double precio, Integer duracion,
			List<ComprasEntity> compras) {
		super();
		this.id = id;
		this.tipoSuscripcion = tipoSuscripcion;
		this.precio = precio;
		this.duracion = duracion;
		this.compras = compras;
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

	public List<ComprasEntity> getCompras() {
		return compras;
	}

	public void setCompras(List<ComprasEntity> compras) {
		this.compras = compras;
	}

   
    
}



