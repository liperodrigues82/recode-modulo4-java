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
	
	<%@ include file="navbar.jsp"  %>
	
	<form action="cadastrar.destino" method="POST">
		<div class="container">
			
			<hr>
			<h2> Cadastrar destino </h2>
			<hr><br/>
			
			<div class="mb-3 form-floating">
	 		    <input type="text" class="form-control" id="bilhete" name="txtNumeroBilhete" 
	 		    	placeholder="Número do Bilhete a atualizar" required/>
	 		    <label for="bilhete" class="form-label">Número do Bilhete a atualizar</label>
			</div>
			<div class="mb-3 form-floating">  			
	 		    <input type="text" class="form-control" id="origem" name="txtOrigem" placeholder="Origem" required/>
	 		    <label for="origem" class="form-label">Origem</label>
			</div>
			<div class="mb-3 form-floating">	  			
	 		    <input type="text" class="form-control" id="destino" name="txtDestino" placeholder="Destino" required/>
	 		    <label for="destino" class="form-label">Destino</label>
			</div>
			<div class="mb-3 form-floating">	  			
	 		    <input type="date" class="form-control" id="dataEmbarque" name="txtDataEmbarque" 
	 		    	placeholder="Data do embarque (DD/MM/YYYY)" required/>
	 		    <label for="dataEmbarque" class="form-label">Data do embarque (DD/MM/YYYY)</label>
			</div>
	    	<div class="mb-3 form-floating">	  			
	 		    <input type="time" class="form-control" id="horarioEmbarque" name="txtHorarioEmbarque" 
	 		    	placeholder="Horário do embarque (HH:MM)" required/>
	 		    <label for="horarioEmbarque" class="form-label">Horário do embarque (HH:MM)</label>
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