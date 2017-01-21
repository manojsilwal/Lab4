<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/Waa/resources/css/main.css" rel="stylesheet" type="text/css"></head>

</head>
<body>
	<section class="product-detail">
	<div class="product">
		<header>
		    <hgroup>
		      <h1>${customer.name}</h1>
		    </hgroup>
		  </header>
		    <section>
 
				  	<p>${customer.birthdate}</p>
				    <details>
				   		<summary>${customer.sex}</summary>
				  	</details>
			</section>
			
		</div>
	 
</section>
</body>
</html>