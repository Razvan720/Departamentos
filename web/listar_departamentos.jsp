<%-- 
    Document   : index
    Created on : 28-feb-2020, 17:24:21
    Author     : DAW209
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Departamentos</h1>
		
		<c:forEach items="${departamentos}" var= "departamento">
			
			<p>	<a href="ver_departamento?id=${departamento.id}">${departamento.nombre}</a> </p>
			
			<p>	<a href="borrar_departamento?id=${departamento.id}">Borrar</a> </p>
			
			
		</c:forEach>
    </body>
</html>
