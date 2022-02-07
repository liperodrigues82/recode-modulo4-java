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
	
	<form action="cadastrar.cliente" method="POST">
		<div class="container">
				
			<hr>
			<h2> Cadastrar cliente </h2>
			<hr><br/>
				
			<div class="mb-3 form-floating">
	 		    <input type="text" class="form-control" id="nomeCliente" name="txtCodigo" placeholder="Código" required/>
	 		    <label for="nomeCliente" class="form-label">Código</label>
			</div>
			<div class="mb-3 form-floating">	
	 		    <input type="text" class="form-control" id="nomeCliente" name="txtNome" placeholder="Nome completo" required/>
	 		    <label for="nomeCliente" class="form-label">Nome completo</label>
			</div>
			<div class="mb-3 form-floating">
	 		    <input type="text" class="form-control" id="rgCliente" maxlength="12" name="txtRG" placeholder="RG" required/>
	 		    <label for="rgCliente" class="form-label">RG</label>
			</div>
			<div class="mb-3 form-floating">
	 		    <input type="email" class="form-control" id="emailCliente" name="txtEmail" placeholder="Email" required/>
	 		    <label for="emailCliente" class="form-label">Email</label>
			</div>
	    	<div class="mb-3 form-floating">
	 		    <input type="tel" class="form-control" id="telCliente" maxlength="11" name="txtTelefone" 
	 		    	placeholder="Telefone (ddd + telefone | apenas números)" required/>
	 		    <label for="telCliente" class="form-label">Telefone (ddd + telefone | apenas números)</label>
			</div>
			<div class="mb-3">
				<input class="btn btn-primary" type="submit" value="Enviar">
				<input class="btn btn-primary" type="reset" value="Limpar">
			</div>
			<div class="mb-3">
				<a href="index.jsp">Voltar para home</a> <br/>
			</div>
		</div>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
	</script>
</body>
</html>