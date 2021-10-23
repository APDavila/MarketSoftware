package com.pichincha.market.service;

import com.pichincha.market.entity.Persona;

public interface PersonaService {

	public Iterable<Persona> getAllPeople();

	Persona createPersona(Persona user);
}