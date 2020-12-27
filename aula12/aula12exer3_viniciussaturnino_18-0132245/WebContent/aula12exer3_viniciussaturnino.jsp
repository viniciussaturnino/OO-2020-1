<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Operacao</title>
	</head>
	
	<body>

	 	<h1>Operação de Soma</h1>
	 	
	 	<%!
	 		int n1 = 2;
	 		int n2 = 7;
	 		int soma = n1 + n2;
	 	%>
	 	
	 	<p>Valor 1: <%out.print(n1); %></p>
	 	<p>Valor 2: <%out.print(n2); %></p>
	 	<p>SOMA TOTAL: <%out.print(soma); %></p>
	 
	</body>
</html>