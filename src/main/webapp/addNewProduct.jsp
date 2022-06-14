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

<form action="addnewaction">
<s:textfield name="username" label="Username"></s:textfield><br/>
<s:textfield name="price" label="Price"></s:textfield><br/>
<s:textfield name="id"  label="Product id"></s:textfield><br/>
<s:submit value="Add"></s:submit>
</form>

</body>
</html>