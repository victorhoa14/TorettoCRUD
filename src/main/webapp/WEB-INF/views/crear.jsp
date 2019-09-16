<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<head>
	<title>Home</title>
</head>
<body>
<h1>
	RAPIDOS Y FURIOSOS :)!  
	
</h1>
<P>  CRUD </P>



<form:form method="POST" action="${pageContext.request.contextPath}/agregar.html" commandName="alu">
<table>
<tbody>
<tr>
		

		<tr>
		<td>Nombre:</td>
				<td><form:input path="nombre" /></td>
	</tr>
	<tr>
		<td>Apellido:</td>
		<td><form:input path="apellido" /></td>
	</tr>
		<tr>
		<td>Matricula:</td>
		<td><form:input path="matricula" /></td>
		
	<tr>
		<td><input type="submit" value="Adicionar" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>
        
</body>
</html>
