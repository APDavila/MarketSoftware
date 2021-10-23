package com.pichincha.market.service;

import com.pichincha.market.entity.Cuenta;
import com.pichincha.market.entity.Persona;

public interface CuentaService {

	public Iterable<Cuenta> getAllAccounts();
}