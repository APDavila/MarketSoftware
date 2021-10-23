package com.pichincha.market.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.NonNull;
@Entity
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	private int id;
	
	@Column	
	@NonNull
	private String nombre;
	
	@Column
	@NonNull
	private String apellido;
	
	@Column
	@NonNull
	private String email;
	
	@Column
	@NonNull
	private boolean esta_activo;
	
	@OneToMany(mappedBy="persona",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Cuenta> cuentas;

	
	
	public Persona() {
		super();
	}

	public Persona(int id, String nombre, String apellido, String pais, boolean esta_activo, Set<Cuenta> cuentas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.esta_activo = esta_activo;
		this.cuentas = cuentas;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEsta_activo() {
		return esta_activo;
	}

	public void setEsta_activo(boolean esta_activo) {
		this.esta_activo = esta_activo;
	}

	public Set<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
}
