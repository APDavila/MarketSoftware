package com.pichincha.market.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Producto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String  detalle;
	
	@Column
	private String esta_activo;	

	public Producto() {
		super();
	}


	
	public Producto(int id, String nombre, String detalle, String esta_activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.esta_activo = esta_activo;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEsta_activo() {
		return esta_activo;
	}

	public void setEsta_activo(String esta_activo) {
		this.esta_activo = esta_activo;
	}
	
}
