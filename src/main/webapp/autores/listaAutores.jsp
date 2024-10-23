<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.unu.proyectoWebGB.beans.Autor"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MI PRIMERA TABLA</title>

</head>
<body>

	<%
	String url = "http://localhost:8080/WebApp1/";
	%>

	<a type="button" href="<%=url%>AutoresController?op=nuevo">Nuevo
		Autor</a>

	<table id="tabla" border="1">
		<thead>
			<tr>
				<th>Codigo del autor</th>
				<th>Nombre del autor</th>
				<th>Nacionalidad</th>
				<th>Operaciones</th>
			</tr>
		</thead>
		<tbody>
			<%
			@SuppressWarnings("unchecked")
			List<Autor> listaAutores = (List<Autor>) request.getAttribute("listaAutores");
			if (listaAutores != null) {
				for (Autor autor : listaAutores) {
			%>
			<tr>
				<td><%=autor.getIdAutor()%></td>
				<td><%=autor.getNombre()%></td>
				<td><%=autor.getNacionalidad()%></td>
				<td></td>
			</tr>
			<%
			}
			} else {
			%>
			<tr>

				<td>No hay Datos</td>
				<td>No hay Datos</td>
				<td>No hay Datos</td>


				<td></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>