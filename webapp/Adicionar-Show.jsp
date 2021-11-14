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
   
   <table>
    <%
    DadosDAO dao = new DadosDAO();
          List<Dados> shows_bandas = dao.getListaBandas();
          for (Dados dado : shows_bandas ) {
    %>
      <tr>
        <td><%=dado.getId() %></td>
		<td><%=dado.getNome() %></td>
        <td><%=dado.getGenero() %></td>
        <td><%=dado.getLocalidade() %></td>
        <td><%=dado.getCapacidade() %></td>
    
      </tr>
     <%
      }
    %>
  </table>
  
   
 
 <form action = "formBanda">
Nome = <input type = "text" name="nome"/>
Gênero = <input type = "text" name="genero"/>
Data = <input type = "text" name="data"/>
<input type = "submit" value="Gravar"/>
</form>


</body>
</html>