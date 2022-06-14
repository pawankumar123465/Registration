<%@page import="javax.servlet.jsp.tagext.Tag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<form action="savechanges">
<s:textfield name="productid" label="Product id" readonly="true"></s:textfield><br/>
<s:textfield name="price" label="Price"></s:textfield><br/>
<s:textfield name="username" label="Username"></s:textfield><br/>
<s:submit value="Update"></s:submit>
</form>


</body>
</html>