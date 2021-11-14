package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class DadosDAO {
private Connection connection;
	
	 public DadosDAO(){
		this.connection = new ConnectionDatabase().getConnection();

}

	//Adiciona-Banda
	public void adiciona(Dados dado) {
		String sql = "insert into bandas " + "(nome,genero)" + " values (?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,dado.getNome());
			stmt.setString(2,dado.getGenero());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

	//Alterar-Banda
	public void alterar(Dados dado) {
		String sql = "update bandas set nome=?,genero=?, where idbandas=? ";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,dado.getNome());
			stmt.setString(2,dado.getGenero());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	 //Remove-Banda
	 public void remove(Dados dado) {
		 int confirma = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja remover essa banda?","Atenção",JOptionPane.YES_NO_OPTION);
	     if(confirma==JOptionPane.YES_OPTION) {
	    	 
	     
		 try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from bandas where idbandas=?");
	          stmt.setString(1, dado.getIdbandas());
	       //   stmt.setString(2, dado.getGenero());
	          stmt.executeUpdate();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	 }
	  }
	//Listagem-Banda
		 public List<Dados> getListaBandas() {
		      try {
		          List<Dados> dados = new ArrayList<Dados>();
		          PreparedStatement stmt = this.connection.
		                  prepareStatement("select * from bandas");
		          ResultSet rs = stmt.executeQuery();

		          while (rs.next()) {
		              
		              Dados dado = new Dados();
		              
		              dado.setNome(rs.getString("nome"));
		              dado.setGenero(rs.getString("genero"));
		              

		             
		              
		               dados.add(dado);
		          }
		          rs.close();
		          stmt.close();
		          return dados;
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }
	 
	//Adiciona-Local
		public void adicionaLocal(Dados dado) {
			String sql = "insert into locais " + "(localidade,capacidade)" + " values (?,?)";

			try {

				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1,dado.getLocalidade());
				stmt.setString(2,dado.getCapacidade());

				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		//Altera-Local
		 public void alteraLocal(Dados dado) {
		      String sql = "update  locais set  localidade=? for localidade=?";
		              

		      try {
		          PreparedStatement stmt = connection
		                  .prepareStatement(sql);
		          stmt.setString(1, dado.getLocalidade());
		          stmt.setString(2, dado.getCapacidade());
		        
		          
		          stmt.execute();
		          stmt.close();
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }
		//Remove-Local
		 public void removeLocal(Dados dado) {
		      try {
		          PreparedStatement stmt = connection
		                  .prepareStatement("delete from locais where localidade=?");
		          stmt.setString(1, dado.getLocalidade());
		         // stmt.setInt(2, dado.getCapacidade());
		          stmt.execute();
		          stmt.close();
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }

}
