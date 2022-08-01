<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Agregar Disco</h1>
		<form action="insertDisco" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="artista">Artista</label> <input type="text"
							class="form-control" id="artista" name="artista"
							placeholder="Nombre del artista">
					</div>
				</div>
				
				<div class="col">
					<div class="form-group">
						<label for="album">Album</label> <input type="text"
							class="form-control" id="album" name="album"
							placeholder="Nombre del album">
					</div>
				</div>
				
				<div class="col">
					<div class="form-group">
						<label for="genero">Genero</label> <input type="text"
							class="form-control" id="genero" name="genero"
							placeholder="Genero del album">
					</div>
				</div>
				
				<div class="col">
					<div class="form-group">
						<label for="Stock">Copias adquiridas</label> <input type="number"
							class="form-control" id="stock" name="stock"
							placeholder="Copias">
					</div>
				</div>
				
				<div class="col">
					<div class="form-group">
						<label for="precio">Precio</label> <input type="number"
							class="form-control" id="precio" name="precio"
							placeholder="precio">
					</div>
				</div>
				
			</div>

			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>