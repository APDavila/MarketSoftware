package com.pichincha.market.service;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Producto;

public interface ProductoService {

	public Iterable<Producto> getAllProducts();
}