<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<link href="/Waa/resources/css/main.css" rel="stylesheet" type="text/css"></head>
<body>
	<div class="jumbotron">
		<h1 class="display-3">Product Page</h1>
	</div>
	<%-- <div class="content">
		<ul class="products">
			<c:forEach var="product" items="${products}">
				<li class="item">
					<ul class="product-col">
						<li><a href="/Waa/product/${product.productId}">${product.name}</a></li>
					</ul>
				</li>
			</c:forEach>
		</ul>
	</div> --%>
	<table class="table table-bordered">
	  <thead>
	    <tr>
	      <th>#</th>
	      <th>Product Name</th>
	      <th>Price </th>
	      <th></th>
	      <th></th>
	      <th></th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach var="product" items="${products}">
		    <tr>
		      <th scope="row">1</th>
		      <td>${product.name}</td>
		      <td>${product.condition}</td>
		      <td><a href="/Waa/deleteProduct/${product.productId}">Delete</a></td>
		      <td><a href="/Waa/updateProduct/${product.productId}">Edit</a></td>
		    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<a href="/Waa/addProduct" class="btn btn-primary">Add Product</a>
</body>
</html>