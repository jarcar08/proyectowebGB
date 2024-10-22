package com.unu.proyectoWebGB.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class Conexion {
	private String url = "jdbc:mysql://localhost:3306/bibliotecapoo2";
	private String usuario = "root";
	private String contrasenia = "123456";
	protected java.sql.Connection conexion;

	public void abrirConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuario, contrasenia);
			System.out.println("Conexion exitosa a la  base de datos.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void cerrarConexion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
				System.out.println("Conexion cerrada");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
