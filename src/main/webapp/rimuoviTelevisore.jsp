<%@page import="it.prova.model.Televisore" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimmina Televisore</title>
</head>
<body>
	<form action="ExecuteRemoveServlet" method="post">
	<% Televisore televisoreItem = (Televisore)request.getAttribute("televisoreDaInviare"); %>
	
		Riepilogo Eliminazione:<br>
	
		<br><label for="marcaInputId">MARCA: <%=televisoreItem.getMarca()%> </label><br>

		<br>
		<label for="modelloInputId">MODELLO: <%=televisoreItem.getModello()%></label><br>
		<br>
		<label for="prezzoInputId">PREZZO: <%=televisoreItem.getPrezzo()%></label><br>
		<br>
		<label for="serialNumberId">SERIAL NUMBER: <%=televisoreItem.getSerialNumber()%></label><br>
		<br>
		<input type="hidden" name="id" value="<%=televisoreItem.getId()%>">
		<input type="submit" value="Conferma">
	</form>

</body>
</html>