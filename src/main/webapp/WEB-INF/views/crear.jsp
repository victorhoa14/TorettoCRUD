<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<head>
	<title>Home</title>
</head>
<body>
<h1>
	RAPIDOS Y FURIOSOS  
	
</h1>
<a href="/toretto"> <input class="button" type="button" value="REGRESAR"> </a>
<form:form method="POST" action="${pageContext.request.contextPath}/agregar.html" commandName="alu">
<table>
<tbody>
<tr>
		

		<tr>
		<td>NO. de pelicula:</td>
		<td><form:input path="No_pelicula" /></td>
	</tr>
	<tr>
		<td>Nombre:</td>
		<td><form:input path="nombre" /></td>
	</tr>
		<tr>
		<td>Parte de la historia:</td>
		<td><form:input path="parte_historia" /></td>
		
	<tr>
	</tr>
		<tr>
		<td>A�o:</td>
		<td><form:input path="a�o" /></td>
		
	<tr>
		<td><input type="submit" value="Adicionar" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>
        
</body>
</html>
