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
<form action="loginaction">
<s:textfield name="username" label="Username"></s:textfield><br/>
<s:textfield name="password" label="Password"></s:textfield><br/>
<s:submit value="Submit"></s:submit>
</form>

</body>
</html>