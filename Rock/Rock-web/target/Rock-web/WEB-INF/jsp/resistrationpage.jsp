<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>This is Resistration Page</h1>
	<form:form method="POST" action="resistrationpage.do"
		modelAttribute="list">


		<table>
		<spring:message code="input.langauge"></spring:message><a href="?locale=en">English</a>|<a href="?locale=zh_CN">chineese</a>|<a href="?locale=hi">हिंदी</a>
			<tr>
				<td><spring:message code="input.email" /></td>
				<!-- Here we are printing error msg -->
				<td>
					<form:input path="emailId" id="emailId" /></td>
					<%-- <td><form:errors path="emailId" style="color:red;"
						class="error.emailId"></form:errors> </td> --%>
			</tr>

			<tr>
				<td><spring:message code="input.password" /></td>
				<td> 
				<form:password
						path="password" id="password" /></td>
						<%-- <td><form:errors path="password" style="color:red;"
						class="error.password"></form:errors></td> --%>
			</tr>

			<tr>
				<td><spring:message code="input.name" /></td>

				<td> <form:input path="name"
						id="name" /></td>
						<%-- <td><form:errors path="name" style="color:red;"
						class="error.name"></form:errors></td> --%>
			</tr>

			<tr>
				<td><spring:message code="input.lastname" /></td>
				<td> <form:input path="lastname"
						id="lastname" /></td>
						<%-- <td><form:errors path="lastname" style="color:red;"
						class="error.lastname"></form:errors></td> --%>
			</tr>

			<tr>
				<td><spring:message code="input.address" /></td>
				<td> <form:input path="address"
						id="address" /></td>
						<%-- <td><form:errors path="address" style="color:red;"
						class="error.address"></form:errors></td> --%>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>