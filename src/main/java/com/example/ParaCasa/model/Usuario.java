package com.example.ParaCasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String nombre;
	private String DNI;
	private String usuario;
	private String password;
	private String correo;
	
	
	public Usuario() {
		super();
	}


	public Usuario(Long id, String nombre, String dNI, String usuario, String password, String correo) {
		super();
		Id = id;
		this.nombre = nombre;
		DNI = dNI;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", nombre=" + nombre + ", DNI=" + DNI + ", usuario=" + usuario + ", password="
				+ password + ", correo=" + correo + "]";
	}
	
	
	
}
