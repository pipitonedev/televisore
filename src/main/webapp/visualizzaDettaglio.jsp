<%@page import="it.prova.model.Televisore" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizza Dettaglio</title>
</head>
<body>
	<% Televisore televisoreItem = (Televisore)request.getAttribute("televisoreDaInviare");
						
				%>
		<label for="marcaInputId">Marca: <%=televisoreItem.getMarca()%> </label><br>

		<br>
		<label for="modelloInputId">Modello: <%=televisoreItem.getModello()%></label><br>
		<br>
		<label for="prezzoInputId">Prezzo: <%=televisoreItem.getPrezzo()%></label><br>
		<br>
		<label for="serialNumberId">Serial Number: <%=televisoreItem.getSerialNumber()%></label><br>
		<br>

</body>
</html>