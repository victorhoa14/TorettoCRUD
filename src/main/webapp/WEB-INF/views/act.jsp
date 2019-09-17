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


<form:form method="POST" action="${pageContext.request.contextPath}/actualizar.html" commandName="peli">
<table>
<tbody>
<tr>
		

		<tr>
		<td><form:input path="No_pelicula" type="hidden" value="${peli.no_pelicula}" /></td>
	</tr>
	<tr>
		<td>Nombre:</td>
		<td><form:input path="nombre" value="${peli.nombre}" /></td>
		           
   
	</tr>
		<tr>
		<td>Parte de la historia:</td>
		<td><form:input path="parte_historia" value="${peli.parte_historia}" /></td>
		

		
	<tr>
	</tr>
		<tr>
		<td>Año:</td>
		<td><form:input path="año" value="${peli.año}" /></td>
		 
		
	<tr>
		<td><input type="submit" value="Actualizar" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

</body>
</html>
