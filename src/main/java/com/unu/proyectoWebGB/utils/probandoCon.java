package com.unu.proyectoWebGB.utils;

import com.unu.proyectoWebGB.models.Conexion;

public class probandoCon {

	public static void main(String[] args) {
		Conexion con = new Conexion();
		con.abrirConexion();
		con.cerrarConexion();
	}

}
