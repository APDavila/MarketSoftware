package com.pichincha.market.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.market.entity.Cuenta;
import com.pichincha.market.entity.Persona;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta, Integer>{

	public Set<Cuenta> findByNumero(int numero);
}
