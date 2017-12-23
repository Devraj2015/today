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
<h1>This is a Product page</h1>
<form:form method="POST" action="pro.do" modelAttribute="list">
<table>
<tr>
<td>  
      <!-- Here we are printing error msg -->
ProductId:</td><td><form:input path="productId" id="productId" />
</td><%-- <td><form:errors path="productId" style="color:red;"></form:errors></td> --%>

</tr>

<tr>
<td>     
ProductName:</td><td><form:input path="productName" id="productName"/>
</td>         <%-- <td><form:errors path="productName" style="color:red;"  ></form:errors></td> --%>

</tr>

<tr>
<td>
       
Price:</td><td><form:input path="price" id="price"/>
</td>       <%--  <td><form:errors path="price" style="color:red;"  ></form:errors></td> --%>

</tr>

<tr>
<td>
ProductCategories:</td><td><form:input path="productCategories" id="productCategories"/>
</td><%-- <td> <form:errors path="productCategories" style="color:red;"  ></form:errors></td> --%>
</tr>                 


<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="reset"></td>
</tr>
</table>
</form:form>


<table border="1">
<tr>
<td>productId</td><td>productName</td><td>price</td><td>productCategories</td>
</tr>
<c:forEach items="${productlist}" var="pd">
<tr>
<td><c:out value="${pd.productId}"></c:out> </td>
<td><c:out value="${pd.productName}"></c:out> </td>
<td><c:out value="${pd.price}"></c:out> </td>
<td><c:out value="${pd.productCategories}"></c:out> </td>
</c:forEach>
</tr>
</table>

</body>
</html>