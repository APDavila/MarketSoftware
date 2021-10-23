package com.pichincha.market.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.pichincha.market.entity.*;

import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cuenta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	private int id;
	
	@Column
	private String detalle;
	
	@Column
	private int numero;
	
	@Column 
	private String esta_activo;
	
	@ManyToOne
	private Persona persona;

	
	public Cuenta() {
		super();
	}

	public Cuenta(int id, String detalle, int numero, String esta_activo, Persona persona) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.numero = numero;
		this.esta_activo = esta_activo;
		this.persona = persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEsta_activo() {
		return esta_activo;
	}

	public void setEsta_activo(String esta_activo) {
		this.esta_activo = esta_activo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
