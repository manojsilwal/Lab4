<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:errors path="*"/>

	<form:form action="/Waa/addProduct" method="post" modelAttribute="product"> 
		<a href="?locale=en">English</a>
		<a href="?locale=np">Nepali</a>
		<ul>
			<li>
				<spring:message code="addProduct.form.productId.label"/>
				<form:input type="text" path="productId" value="${product.productId}"/>
			</li>
			<li>
				<label>Product Name :</label>
				<form:input type="text" path="name" value="${product.name}"/>
				<form:errors path="name" cssStyle="color: red"/>
			</li>
			<li>
				<label>Product Description :</label>
				<form:textarea type="text" path="description" value="${product.description}"/>
			</li>
			<li>
				<label>Discontinued</label>
				<form:checkbox path="discontinued" />
			</li>
				
			<li>
				<input type="radio" name="condition" value="new" <c:if test="${product.condition == 'new'}">checked</c:if> /> New
			</li>
			<li>
				<input type="submit" value="submit"/>
			</li>
		</ul>
	</form:form>
</body>
</html>