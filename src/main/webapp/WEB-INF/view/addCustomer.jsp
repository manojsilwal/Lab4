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

	<form:form action="/Waa/addCustomer" method="post" modelAttribute="customer"> 
		<a href="?locale=en">English</a>
		<a href="?locale=np">Nepali</a>
		<ul>
			<li>
				<spring:message code="addCustomer.form.username.label"/>
				<form:input type="text" path="username" value="${customer.username}"/>
				<form:errors path="username" cssStyle="color: red"/>
			</li>
			<li>
				<spring:message code="addCustomer.form.birthdate.label"/>
				<form:input type="text" path="birthdate" value="${customer.birthdate}"/>
				<form:errors path="birthdate" cssStyle="color: red"/>
			</li>
			<li>
				<spring:message code="addCustomer.form.address.label"/>
				<form:input type="text" path="address" value="${customer.address}"/>
				<form:errors path="address" cssStyle="color: red"/>
			</li>
			<li>
				<spring:message code="addCustomer.form.sex.label"/>
				<input type="radio" name="sex" value="male" <c:if test="${customer.sex == 'male'}">checked</c:if> />
				 <spring:message code="addCustomer.form.male.label"/>
				<input type="radio" name="sex" value="female" <c:if test="${customer.sex == 'female'}">checked</c:if> /> 
				<spring:message code="addCustomer.form.female.label"/>
				<form:errors path="sex" cssStyle="color: red"/>
			</li>
			<li>
				<spring:message code="addCustomer.form.password.label"/>
				<form:input type="text" path="password" value="${customer.password}"/>
				<form:errors path="password" cssStyle="color: red"/>
			</li>
				
			<li>
				<input type="submit" value="submit"/>
			</li>
		</ul>
	</form:form>
</body>
</html>