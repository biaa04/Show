package connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import javax.servlet.annotation.WebServlet;


@WebServlet("./formBanda")
public class Banda extends HttpServlet {
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
      
      String nome = req.getParameter("nome");
      String genero = req.getParameter("genero");
      
      Dados  dado = new Dados();
      dado.setNome(nome);
      dado.setGenero(genero);
      
      DadosDAO dao = new DadosDAO();
      dao.adiciona(dado);
      
      out.println("<html>");
      out.println("<body>");
      out.println("Banda " + dado.getNome() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");

}
}