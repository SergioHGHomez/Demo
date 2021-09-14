<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/usuarios.js" ></script>
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<header>
		<jsp:include page="encabezadoMenu.jsp" flush="true"/>
	</header>
	<section>
		<table id="tablaUsuarios">
			<thead>
				<tr>
					<th>id</th>
					<th>nombre</th>
					<th>usuario</th>
					<th>password</th>
					<th>acciones</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					
				</tr>
			</tbody>
		</table>
	</section>
	<footer></footer>
	
	<script src="js/usuarios.js" ></script>
</body>
</html>