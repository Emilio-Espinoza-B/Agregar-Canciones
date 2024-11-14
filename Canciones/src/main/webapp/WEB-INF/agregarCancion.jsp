<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>agregar</title>
</head>
<body>
	<h1>Agregar Canción</h1> 
	
	<form:form modelAttribute="cancion" action="/canciones/procesa/agregar" method="post"> 
	<form:label path="titulo">Título:</form:label> <form:input path="titulo"/> 
	<form:errors path="titulo" cssClass="error"/> 
	
	<br/> 
	
	<form:label path="artista">Artista:</form:label> 
	<form:input path="artista"/> 
	<form:errors path="artista" cssClass="error"/> 
	
	<br/> 
	
	<form:label path="album">Álbum:</form:label> 
	<form:input path="album"/> 
	<form:errors path="album" cssClass="error"/> 
	
	<br/> 
	
	<form:label path="genero">Género:</form:label> 
	<form:input path="genero"/> 
	<form:errors path="genero" cssClass="error"/> 
	
	<br/> 
	
	<form:label path="idioma">Idioma:</form:label> 
	<form:input path="idioma"/> 
	<form:errors path="idioma" cssClass="error"/>
	 
	<br/> 
	
	<button type="submit">Agregar</button> 
	</form:form> 
	<a href="/canciones">Volver a lista de canciones</a>
</body>
</html>