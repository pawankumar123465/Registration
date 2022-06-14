<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
<%@ include file="Header.jsp" %>
<s:property value="username"/>
User logged in Success fully<br/>
<s:form action="showProduct">
<s:submit value="Show Product"></s:submit>
</s:form>
<a href="addNewProduct.jsp">
	<button type="submit">Add New Product</button>
</a>


</body>
</html>