<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>测试</title>  
  </head>  
  <body>  
  <table border="1">
  <tr><th>FirstName</th><th>LastName</th></tr>
  <c:forEach items="${employees }" var="emp">
  	<tr>
  		<td>${emp.firstName} </td>
  		<td>${emp.lastName }</td>
  	</tr>
  </c:forEach>
  </table>
  </body>  
</html>  