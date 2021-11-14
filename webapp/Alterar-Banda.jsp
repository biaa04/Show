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
<form action="???">
<input type="hidden" name="idbandas" value="${dados.idbandas}"/>
Nome:<input type="text" name="nome" value="${dados.nome}"/></br>
Gênero<input type="text" name="genero" value="${dados.genero}"/>
<input type="submit" value="Alterar"/>
<input type="reset" value="Limpar"/>
</form>
</body>
</html>