<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca Televisore</title>
</head>
<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dati da ricercare<br>
	<%}    %>
	
	<form action="SearchServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br><br>
		<input type="text" name="marcaInput" id="marcaInputId"><br>
		<br>
		<label for="modelloInputId">MODELLO:</label><br><br>
		<input type="text" name="modelloInput" id="modelloInputId"><br>
		<br>
		<input type="submit" value="CERCA">	
	</form>
</body>
</html>