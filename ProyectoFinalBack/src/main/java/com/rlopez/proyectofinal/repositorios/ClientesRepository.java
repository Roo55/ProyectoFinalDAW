package com.rlopez.proyectofinal.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rlopez.proyectofinal.entities.ClientesEntity;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesEntity, Integer> {
    
}
