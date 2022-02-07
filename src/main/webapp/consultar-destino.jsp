<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Destinos - Recodetour</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	
	<%@ include file="navbar.jsp" %>
	
	<form action="consultar.destino" method="GET">
		<div class="container">
			
			<hr>	
			<h2> Consultar destino </h2>
			<hr><br/>
					
			<div class="mb-3 form-floating">
	 		    <input type="text" class="form-control" id="numeroBilhete" name="txtNumeroBilhete"
	 		    	placeholder="Número do bilhete" required/>
	 		    <label for="numeroBilhete" class="form-label">Número do bilhete</label>
			</div>
			<div class="mb-3">
				<input class="btn btn-primary" type="submit" value="Consultar">
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