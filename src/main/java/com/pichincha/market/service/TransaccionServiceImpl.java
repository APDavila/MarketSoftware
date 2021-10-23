package com.pichincha.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Producto;
import com.pichincha.market.entity.Transaccion;
import com.pichincha.market.repository.PersonaRepository;
import com.pichincha.market.repository.ProductoRepository;
import com.pichincha.market.repository.TransaccionRepository;

@Service
public class TransaccionServiceImpl implements TransaccionService {

	@Autowired
	TransaccionRepository repository;
	
	@Override
	public Iterable<Transaccion> getAllTransacts() {
		return repository.findAll();
	}

}