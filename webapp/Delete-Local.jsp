<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@  page import = "java.util.*,
     connection.*" %>
  
 
 <form action = "formBanda">
Idlocal=<input type = "text" name="idlocais">
Local = <input type = "text" name="localidade"/>
Capacidade = <input type = "text" name="capacidade"/>
<input type = "submit" value="Deletar"/>
</form>
</body>
</html>