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
<p>Registeration form</p>
<s:form action="registerAction">
	<s:textfield name="firstName" key="global.firstName"></s:textfield><br/>
	<s:textfield name="lastName" key="global.lastName"></s:textfield>
	<s:radio name="gender" list="{'Male','Female'}" key="global.gender"/>
	<s:textfield name="age" key="global.age"></s:textfield>
	<s:textfield type="email" name ="email" key="global.email"></s:textfield>
	
	<s:submit key="global.Register"></s:submit>
</s:form>
<s:url action="changelocaleaction" var="urlEn">
	<s:param name="request_local">En</s:param>
</s:url>
<a href="${urlEn}">English</a>
<s:url action="changelocaleaction" var="urlFr">
	<s:param name="request_local">fr</s:param>
</s:url>
<a href="${urlFr}">French</a>
<s:url action="changelocaleaction" var="urlDe">
	<s:param name="request_local">de</s:param>
</s:url>
<a href="${urlDe}">German</a>


</body>
</html>