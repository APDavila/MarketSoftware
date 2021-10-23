package com.pichincha.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository repository;
	
	@Override
	public Iterable<Persona> getAllPeople() {
		return repository.findAll();
	}
	
	@Override
	public Persona createPersona(Persona persona) {
		return repository.save(persona);
		
	}

}