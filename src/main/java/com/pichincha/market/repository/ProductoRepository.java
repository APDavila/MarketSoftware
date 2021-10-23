package com.pichincha.market.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.market.entity.Cuenta;
import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{

	public Set<Producto> findByNombre(String nombre);
}
