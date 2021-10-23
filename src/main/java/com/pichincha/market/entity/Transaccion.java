package com.pichincha.market.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Transaccion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	private int id;
	
	@Column
	private double valor;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_transaccion;
	
	@Column
	private boolean esta_activo;
		
	
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="transaccion_detalle",
		joinColumns=@JoinColumn(name="transaccion_id"),
		inverseJoinColumns=@JoinColumn(name="producto_id"))
	private Set<Producto> producto;

	public Transaccion() {
		super();
	}

	public Transaccion(int id, double valor, Date fecha_transaccion, boolean esta_activo, Set<Cuenta> cuentas,
			Set<Producto> producto) {
		super();
		this.id = id;
		this.valor = valor;
		this.fecha_transaccion = fecha_transaccion;
		this.esta_activo = esta_activo;
		
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getFecha_transaccion() {
		return fecha_transaccion;
	}

	public void setFecha_transaccion(Date fecha_transaccion) {
		this.fecha_transaccion = fecha_transaccion;
	}

	public boolean isEsta_activo() {
		return esta_activo;
	}

	public void setEsta_activo(boolean esta_activo) {
		this.esta_activo = esta_activo;
	}



	public Set<Producto> getProducto() {
		return producto;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

	
}
