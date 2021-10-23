package com.pichincha.market.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.market.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer>{

	public Set<Persona> findByNombre(String nombre);
}
