package com.pichincha.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.entity.Producto;
import com.pichincha.market.repository.PersonaRepository;
import com.pichincha.market.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository repository;
	
	@Override
	public Iterable<Producto> getAllProducts() {
		return repository.findAll();
	}

}