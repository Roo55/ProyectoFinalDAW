package com.rlopez.proyectofinal.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rlopez.proyectofinal.entities.SuscripcionesEntity;

@Repository
public interface SuscripcionesRepository extends JpaRepository<SuscripcionesEntity, Integer> {
 
	
	
}
