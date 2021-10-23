package com.pichincha.market.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Transaccion;

@Repository
public interface TransaccionRepository extends CrudRepository<Transaccion, Integer>{
	
}
