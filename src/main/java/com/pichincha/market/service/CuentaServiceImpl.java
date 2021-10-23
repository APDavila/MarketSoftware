package com.pichincha.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.market.entity.Cuenta;
import com.pichincha.market.entity.Persona;
import com.pichincha.market.repository.CuentaRepository;
import com.pichincha.market.repository.PersonaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	CuentaRepository repository;
	
	@Override
	public Iterable<Cuenta> getAllAccounts() {
		return repository.findAll();
	}

}