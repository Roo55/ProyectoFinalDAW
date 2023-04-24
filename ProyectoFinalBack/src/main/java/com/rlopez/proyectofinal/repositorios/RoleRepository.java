package com.rlopez.proyectofinal.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rlopez.proyectofinal.entities.models.ERole;
import com.rlopez.proyectofinal.entities.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	@Query("SELECT r FROM Role r WHERE r.name = :name")
  Optional<Role> findByName(ERole name);
}