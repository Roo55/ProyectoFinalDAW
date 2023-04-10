package com.rlopez.proyectofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rlopez.proyectofinal.entities.models.User;

@Entity
@Table(name = "compras")
public class ComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer id;

    @Column(name = "fecha_compra")
    private String fechaCompra;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private User cliente;

    @ManyToOne
    @JoinColumn(name = "id_suscripcion", referencedColumnName = "id_suscripcion")
    private SuscripcionesEntity subscripcion;

	public ComprasEntity() {
		super();
	}

	public ComprasEntity(Integer id, String fechaCompra, User cliente, SuscripcionesEntity subscripcion) {
		super();
		this.id = id;
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
		this.subscripcion = subscripcion;
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

	public User getCliente() {
		return cliente;
	}

	public void setCliente(User cliente) {
		this.cliente = cliente;
	}

	public SuscripcionesEntity getSubscripcion() {
		return subscripcion;
	}

	public void setSubscripcion(SuscripcionesEntity subscripcion) {
		this.subscripcion = subscripcion;
	}

    
    
    
}



