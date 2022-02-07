<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<title>Navbar - Recodetour</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous"/>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
    		<a class="navbar-brand" href="index.jsp">Recodetour
    		 <img src="./images/iconeNav.png" style="width: 45px"> </a>
 	       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
 	       		data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
     		 <span class="navbar-toggler-icon"></span>
           </button>
   		   <div class="collapse navbar-collapse text-light justify-content-end" id="navbarNav">
    		   <ul class="navbar-nav">
       				 <li class="nav-item">
       				   <a class="nav-link active" aria-current="page" href="cliente-lista.jsp">Clientes cadastrados</a>
      			     </li>
      			     <li class="nav-item">
       				   <a class="nav-link active" href="destino-lista.jsp">Destinos reservados</a>
        			</li>
       			 </ul>
            </div>
		</div>
	</nav>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
		
	</script>
</body>
</html>