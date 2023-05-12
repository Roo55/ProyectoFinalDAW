package com.rlopez.proyectofinal.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlopez.proyectofinal.entities.ClientesEntity;
import com.rlopez.proyectofinal.entities.SuscripcionesEntity;

@Repository
public interface SuscripcionesRepository extends JpaRepository<SuscripcionesEntity, Integer> {
 

	
}
