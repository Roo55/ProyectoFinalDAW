package com.rlopez.proyectofinal.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rlopez.proyectofinal.entities.ComprasEntity;

@Repository
public interface ComprasRepository extends JpaRepository<ComprasEntity, Integer> {
    
}
