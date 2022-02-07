<%@ page import="modelo.cliente.Cliente" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes - Recodetour</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<%@ include file="navbar.jsp"  %>

	<% Cliente cliente = (Cliente) request.getAttribute("refCliente"); %>
	
	<div class="container py-4">
		<table class="table table-success table-striped">
			<thead>
				<tr>
				  <th scope="col">Código</th>
				    <th scope="col">Nome</th>
				    <th scope="col">RG</th>
				    <th scope="col">Email</th>
				    <th scope="col">Telefone</th>
				    <th></th>
				  </tr>
			</thead>
			<tbody>
				  <tr>
				    <th scope="row"><%= cliente.getCodigo() %></th>
				    <td> <%= cliente.getNome() %> </td>
			        <td> <%= cliente.getRg() %> </td>
			        <td> <%= cliente.getEmail() %> </td>
			        <td> <%= cliente.getTelefone() %> </td>
			        <td> <a href="remover.cliente?acao=ex&codigo=<%=cliente.getCodigo()%>">Excluir</a> </td>
				  </tr>
	        </tbody>
		</table>
		
		<div class="mb-3">
			<a href="index.jsp">Voltar para home</a> <br/>
		</div>
		
	</div>    

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
	</script>
</body>
</html>