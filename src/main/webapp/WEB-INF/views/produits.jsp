<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Catalogue</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<div class="row col-md-6">
			<h3>Catalogue des produits</h3>
		</div>
	</div>
	<div class="container">
		<div class="row col-sm-6">
			<f:form modelAttribute="produit" action="saveProduit" method="post">
				<div class="form-group">
					<f:input path="reference" class="form-control" name="reference" placeholder="Reference" />
					<f:errors path="reference" class=""></f:errors>
				</div>
				<div class="form-group">
					<f:input path="designation" class="form-control" name="designation" placeholder="Designation" />
					<f:errors path="designation" class=""></f:errors>
				</div>
				<div class="form-group">
					<f:input path="prix" type="text" class="form-control" name="prix" placeholder="Prix" />
					<f:errors path="prix" class=""></f:errors>
				</div>
				<div class="form-group">
					<f:input path="quantite" class="form-control" name="quantite" placeholder="Quantite" />
					<f:errors path="quantite" class=""></f:errors>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Valider</button>
				</div>
			</f:form>
		</div>
	</div>
	
	<div class="container" id="listProduits">
		<table class="table table-striped">
			<tr>
				<th>REFERENCE</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th>
			</tr>
			<c:forEach var="p" items="${produits}">
				<tr>
					<td>${p.reference}</td>
					<td>${p.designation}</td>
					<td>${p.prix}</td>
					<td>${p.quantite}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>