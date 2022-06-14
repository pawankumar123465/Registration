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
Welcome<br/><br/>
First Name:
<s:property value="firstName"/><br/>
Last Name:
<s:property value="lastName"/><br/>
Gender:
<s:property value="gender"/><br/>
Email:
<s:property value="email"/><br/>
Age:
<s:property value="age"/><br/>
Address:
<s:property value="address"/><br/>

Subject:
<s:property value="subject"/><br/>

Colors:
<s:property value="color"/><br/>
Selected:
<s:property value="selected"/><br/>


</body>
</html>