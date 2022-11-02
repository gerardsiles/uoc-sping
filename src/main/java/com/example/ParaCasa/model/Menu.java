package com.example.ParaCasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Menu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private Double precio;
	
	public Menu() {
		
	}
	
	public Menu(Long id, Double precio) {
		this.Id = id;
		this.precio = precio;
	}
	
	public Long getId() {
		return Id;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setId(Long id) {
		this.Id = id;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override 
	public String toString() {
		return"Menu{" + "id= " + Id + ", precio= " + precio + "}";
	}
	
}
