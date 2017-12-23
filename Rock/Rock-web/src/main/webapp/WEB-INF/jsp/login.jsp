<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>भारत माता की जय </h1>
<form:form method="POST" action="good.do" modelAttribute="list">
<table>
<tr>
<td>
email:<form:input path="emailId" id="emailId"/>
</td>
</tr>

<tr>
<td>
password:<form:password path="password" id="password"/>
</td>
</tr>

<tr>
<td><input type="submit" value="submit">
</td>
</tr>
<tr>
<td><a href="resistrationpage.do">Resistration</a></td>
</tr>
</table>
</form:form>
</body>
</html>