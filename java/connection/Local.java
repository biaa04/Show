package connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import javax.servlet.annotation.WebServlet;

@WebServlet("./formLocal")
public class Local  extends HttpServlet{
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
      
      String localidade = req.getParameter("localidade");
      String capacidade = req.getParameter("capacidade");      
      
      Dados  dado = new Dados();
      dado.setNome(localidade);
      dado.setGenero(capacidade);
      
      DadosDAO dao = new DadosDAO();
      dao.adiciona(dado);
      
      out.println("<html>");
      out.println("<body>");
      out.println("Local " + dado.getLocalidade() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
    //<%  String capacidade =Int.parseInt( req.getParameter("capacidade")); %
}

}
