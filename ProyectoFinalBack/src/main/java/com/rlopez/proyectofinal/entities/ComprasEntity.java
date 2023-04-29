package com.rlopez.proyectofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class ComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compras")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private ClientesEntity cliente;

    @ManyToOne
    @JoinColumn(name = "id_suscripcion", referencedColumnName = "id_suscripcion")
    private SuscripcionesEntity subscripcion;
    
    @Column(name = "fecha_compra")
    private String fechaCompra;



	public ComprasEntity() {
		super();
	}

	

	public ComprasEntity(Integer id, ClientesEntity cliente, SuscripcionesEntity subscripcion, String fechaCompra) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.subscripcion = subscripcion;
		this.fechaCompra = fechaCompra;
	}



	public ComprasEntity(ClientesEntity cliente, SuscripcionesEntity subscripcion, String fechaCompra) {
		super();
		this.cliente = cliente;
		this.subscripcion = subscripcion;
		this.fechaCompra = fechaCompra;
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

	public ClientesEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClientesEntity cliente) {
		this.cliente = cliente;
	}

	public SuscripcionesEntity getSubscripcion() {
		return subscripcion;
	}

	public void setSubscripcion(SuscripcionesEntity subscripcion) {
		this.subscripcion = subscripcion;
	}

    
    
    
}



