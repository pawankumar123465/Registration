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
<s:form action="registerAction">
	<s:textfield name="firstName" label="First Name"></s:textfield><br/>
	<s:textfield name="lastName" label ="last Name"></s:textfield>
	<s:radio name="gender" list="{'Male','Female'}" label="Genger"/>
	<s:textfield name="age" label="Age"></s:textfield>
	<s:textfield type="email" name ="email" label="Email"></s:textfield>
	<s:textarea name="address" label="Address" cols="30" rows="7"> </s:textarea>
	<s:select  multiple="true" list="{'Math','Geography','Software'}" label="Subject" headerKey="none" headerValue="Select a color" name="subject"></s:select>
	<s:checkboxlist label="What's your favor color"
      list="{'red','yellow'}"
      name="color" />
    <s:checkbox value="true" name="selected" label="Selected"></s:checkbox>
	<s:reset value="Reset"></s:reset>
	<s:submit value="Submit"></s:submit>
</s:form>

</body>
</html>