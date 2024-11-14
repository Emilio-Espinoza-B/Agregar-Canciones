<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lista</title>
</head>
<body>
	<h1>Lista de Canciones</h1>
		<table> 
			<tr> 
				<th>Título</th> 
				<th>Artista</th> 
				<th>Detalle</th> 
			</tr> 
			<c:forEach var="cancion" items="${canciones}"> 
			<tr> 
				<td>${cancion.titulo}</td> 
				<td>${cancion.artista}</td> 
				<td><a href="/canciones/detalle/${cancion.id}">Detalle</a></td> 
			</tr>
			</c:forEach>
		</table> 
		<a href="/canciones/formulario/agregar/{idCancion}">Agregar nueva canción</a>
		<a href="/">Volver</a>
</body>
</html>