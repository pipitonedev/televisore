<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci nuovo Televisore</title>
</head>
<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dati da inserire:<br>
	<%}    %>
	
	<form action="ExecuteInsertServlet" method="post">
	<label for="marcaInputId">Marca:</label><br>
	<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">Modello:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="prezzoInputId">Prezzo:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId">
		<br>
		<label for="serialNumberId">Serial Number:</label><br>
		<input type="text" name="serialNumberInput" id="serialNumberInputId">
		<br>
		<input type="submit" value="Conferma">
	
	</form>

</body>
</html>