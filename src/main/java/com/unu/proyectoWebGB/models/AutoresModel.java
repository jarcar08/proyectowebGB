package com.unu.proyectoWebGB.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.mysql.cj.jdbc.CallableStatement;
import com.unu.proyectoWebGB.beans.Autor;

public class AutoresModel extends Conexion {
	java.sql.CallableStatement cs;
	ResultSet rs;

	/*
	 * public List<Autor> listarAutores() { ArrayList<Autor> autores = new
	 * ArrayList<>(); autores.add(new Autor(1, "Garcia Marquez", "Colombia"));
	 * autores.add(new Autor(2, "Borges", "Argentina")); autores.add(new Autor(3,
	 * "Allende", "Chilena")); autores.add(new Autor(4,"Jara", "Peru")); return
	 * autores; }
	 */

	public List<Autor> listarAutores() throws SQLException {
		try {
			List<Autor> lista = new ArrayList<>();
			String sql = "CALL sp_listarAutor()";
			this.abrirConexion();
			cs = conexion.prepareCall(sql);
			rs = cs.executeQuery();
			while (rs.next()) {
				Autor autor = new Autor();
				autor.setIdAutor(rs.getInt("idautor"));
				// autor.setCodigoAutor(rs.getString("codigo"));
				autor.setNombre(rs.getString("nombre"));
				autor.setNacionalidad(rs.getString("nacionalidad"));
				lista.add(autor);
			}
			this.cerrarConexion();
			return lista;
		} catch (SQLException ex) {
			Logger.getLogger(AutoresModel.class.getName()).log(Level.SEVERE, null, ex);
			this.cerrarConexion();
			;
			return null;
		}
	}

}
