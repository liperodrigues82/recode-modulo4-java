<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.persistencia.DAODestino"%>
<%@page import="modelo.destino.Destino"%>
<%@page import="java.util.List"%>
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
	
	<div class="container py-4">
	
		<hr>
		<h1>Lista de destinos reservados</h1>
		<hr><br/>
	
		<table class="table table-primary table-striped">
			<thead>
				<tr>
				  <th scope="col">Número do Bilhete</th>
				    <th scope="col">Origem</th>
				    <th scope="col">Destino</th>
				    <th scope="col">Data do embarque</th>
				    <th scope="col">Horário do embarque</th>
				    <th></th>
				    <th></th>
				  </tr>
			</thead>
			<tbody>
			
		<% 
			DAODestino daoDestino = new DAODestino();
			List<Destino> lista = daoDestino.pegarListaDestinos();
			for(Destino destino : lista) {
		%>
			
				  <tr>
				    <th scope="row">
				    	<%= destino.getNumeroBilhete() %>
				    </th>
				    <td> <%= destino.getOrigem() %> </td>
			        <td> <%= destino.getDestino() %> </td>
			        <td> <%= destino.getDataEmbarque() %> </td>
			        <td> <%= destino.getHorarioEmbarque() %> </td>			        
			        <td>  </td>
			        <td> <a href="remover.destino?acao=ex&codigo=<%=destino.getNumeroBilhete()%>">Excluir</a> </td>
				  </tr>
		<%
			}
		%>
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