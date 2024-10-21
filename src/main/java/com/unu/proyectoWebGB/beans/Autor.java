package com.unu.proyectoWebGB.beans;

public class Autor {
	private int idAutor;
	private String nombre;
	private String nacionalidad;
	

	public Autor() {
		this(0, "", "");
	}

	public Autor(int idAutor, String nombre,  String nacionalidad) {
		super();
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
