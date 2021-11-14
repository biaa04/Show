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
          List<Dados> locais = dao.getListaBandas();
          for (Dados dado : locais ) {
    %>
      <tr>
        <td><%=dado.getIdlocais() %></td>
		<td><%=dado.getLocalidade() %></td>
        <td><%=dado.getCapacidade() %></td>
    
      </tr>
     <%
      }
    %>
  </table>
  
     
<form action="formLocal">
<input type="hidden" name="idbandas" value="${dados.idlocais}"/>
Local:<input type="text" name="localidade" value="${dados.localidade}"/></br>
Capacidade:<input type="text" name="capacidade" value="${dados.capacidade}"/></br>
<input type="submit" value="Alterar"/>
<input type="reset" value="Limpar"/>
</form>

</body>
</html>