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
All Product Details

<table border="1">
<thead>
<tr>
	<th>Product Id</th>
	<th>Product Price</th>
	<th>Product Creater</th>
	<th>User action</th>
</tr>
</thead>
<s:iterator value="list" var="prod" >
<tbody>
<tr>
<td><s:property value="#prod.productid"/></td>
<td><s:property value="#prod.price"/></td>
<td><s:property value="#prod.username"/></td>
<td>
	<a 
	href="updateproductaction?productid=<s:property value="#prod.productid"/>">
	<button>Update</button>
	</a>

</td>
<td>
<a 
	href="deleteaction?productid=<s:property value="#prod.productid"/>">
	<button>Delete</button>
	</a>

</td>
</tr>

</tbody>
</s:iterator>
</table>



</body>
</html>