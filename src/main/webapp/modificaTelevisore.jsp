<%@page import="it.prova.model.Televisore" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Televisore</title>
</head>

<form action="ExecuteModificaServlet" method="post">
	<% Televisore televisoreItem = (Televisore)request.getAttribute("televisoreDaInviare");%>
	
	<label for="marcaInputId">Marca:</label><br>
	<input type="text" name="marcaInput" value="<%=televisoreItem.getMarca()%>" id="marcaInputId">
		<br>
		<label for="modelloInputId">Modello:</label><br>
		<input type="text" name="modelloInput" value="<%=televisoreItem.getModello()%>" id="modelloInputId">
		<br>
		<label for="prezzoInputId">Prezzo:</label><br>
		<input type="text" name="prezzoInput" value="<%=televisoreItem.getPrezzo()%>" id="prezzoInputId">
		<br>
		<label for="serialNumberId">Serial Number:</label><br>
		<input type="text" name="serialNumberInput" value="<%=televisoreItem.getSerialNumber()%>" id="serialNumberInputId">
		<br>
		<input type="hidden" name="id" value="<%=televisoreItem.getId()%>">
		<input type="submit" value="Conferma">
	
	</form>

</body>
</html>