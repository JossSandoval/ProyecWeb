<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Principal</title>
</head>
<style>
body {
	position: absolute;
	display: grid;
	background: #22797E;
	font-size: 1.2em;
}

.logoimg {
	position: relative;
	left: 25vw;
	width: 100%;
	height: 300px;
	background-image:
		url(https://img1.wsimg.com/isteam/ip/12c268d0-1ec2-4696-9ac4-6e5b43fd08bf/logo%20pjmx.png/)
}

table {
	position: relative;
	width: 150%;
	top: 10px;
	left: 10vw;
	transform: translate(-50% .50%);
}

th, td {
	padding: 15px;
	text-align: left;
	border: 1px solid #ddd;
	text-align: center;
}

td {
	color: white;
}

th {
	background-color: #FEFEFE;
}
</style>


<body>
<!--   <a href="DataController?accion=nuevo"> Agregar cuenta</a>  -->

	<div class="logoimg">
		<img src="@{/css/media/logopjmx.png}" alt="">
	</div>
	<table border="1" WIDTH="500">
		
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Lastname</th>
				<th>Email</th>
				<th>Address</th>
				<th>Password</th>
			</tr>
	
		<c:forEach var="usuario" items="${usuarios}">
			<tr >
				<td ><c:out value="${usuario.id}"/></td>
				<td ><c:out value="${usuario.name}"/></td>
				<td ><c:out value="${usuario.lastName}"/></td>
				<td ><c:out value="${usuario.email}"/></td>
				<td ><c:out value="${usuario.address}"/></td>
				<td ><c:out value="${usuario.password}"/></td>
			</tr>
	      </c:forEach>
	      
	</table>
	
	  <div class="container">
</body>

</html>
