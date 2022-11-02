package com.example.ParaCasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String descripcion;
	private Integer kcal;
	
	
	public Producto() {
		super();
	}


	public Producto(Long id, String nombre, String descripcion, Integer kcal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.kcal = kcal;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getKcal() {
		return kcal;
	}


	public void setKcal(Integer kcal) {
		this.kcal = kcal;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", kcal=" + kcal + "]";
	}
	
	
}
