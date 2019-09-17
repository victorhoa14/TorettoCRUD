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
<h3>Peliculas</h3>
 <c:if test="${!empty peli}">
<table border="1" > 
   
<tr>        
<th width="80">No. pelicula</th>
<th width="120">Nombre</th>        
<th width="120">Historia</th>        
<th width="60">Año</th>    
</tr>    
<c:forEach items="${peli}" var="pelis">       
 <tr>           
 <td>${pelis.no_pelicula}</td>            
 <td>${pelis.nombre}</td>            
 <td>${pelis.parte_historia}</td> 
 <td>${pelis.año}</td>            
 <td>
 <a href="<c:url value='/up/${pelis.no_pelicula}' />"  class="button"> Editar </a>  
 <br>          
 <a href="<c:url value='/eliminar/${pelis.no_pelicula}' />"  class="button"> Eliminar </a>
 </td>        
 </tr>    
 </c:forEach>    
 </table>
</c:if>
</body>
</html>
