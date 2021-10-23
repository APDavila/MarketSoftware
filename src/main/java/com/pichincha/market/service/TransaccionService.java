package com.pichincha.market.service;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Producto;
import com.pichincha.market.entity.Transaccion;

public interface TransaccionService {

	public Iterable<Transaccion> getAllTransacts();
}