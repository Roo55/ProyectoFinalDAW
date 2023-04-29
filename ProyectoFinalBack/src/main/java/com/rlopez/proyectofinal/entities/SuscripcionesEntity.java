package com.rlopez.proyectofinal.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suscripciones")
public class SuscripcionesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_suscripcion")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClientesEntity cliente;

	@Column(name = "tipo_suscripcion")
	private String tipo_suscripcion;

	@Column(name = "precio")
	private String precio;

	@Column(name = "duracion")
	private String duracion;

	@OneToMany(mappedBy = "subscripcion", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ComprasEntity> compras;

	public SuscripcionesEntity() {
		super();
	}

	public SuscripcionesEntity(Integer id, ClientesEntity cliente, String tipoSuscripcion, String precio, String duracion,
			List<ComprasEntity> compras) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.tipo_suscripcion = tipoSuscripcion;
		this.precio = precio;
		this.duracion = duracion;
		this.compras = compras;
	}
	public SuscripcionesEntity( ClientesEntity cliente, String tipoSuscripcion, String precio, String duracion) {
		super();
		this.cliente = cliente;
		this.tipo_suscripcion = tipoSuscripcion;
		this.precio = precio;
		this.duracion = duracion;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public ClientesEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClientesEntity cliente) {
		this.cliente = cliente;
	}

	public String getTipoSuscripcion() {
		return tipo_suscripcion;
	}

	public void setTipoSuscripcion(String tipoSuscripcion) {
		this.tipo_suscripcion = tipoSuscripcion;
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

	public List<ComprasEntity> getCompras() {
		return compras;
	}

	public void setCompras(List<ComprasEntity> compras) {
		this.compras = compras;
	}

}
