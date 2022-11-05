import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	
	//gerencia conexao com o banco de dados
	private Connection conection = null;
	//gerencia as consultas com o banco de dados
	private Statement statement = null;
	
		public void conectar() {
			
			//1� java database connection; 2� servidor; 3� nome tabela;
			String servidor = "jdbc:mysql://localhost:3306/ds_GUI";
			String usuario = "root";
			String senha = "";
			// driver usado na conex�o
			String driver = "com.mysql.jdbc.Driver";
			
			try {
				
				//faz conex�o com banco
				this.conection = DriverManager.getConnection(servidor, usuario, senha);
				//cria ambiente para executar c�digos dentro do banco
				this.statement = this.conection.createStatement();
				
			} catch(Exception e) {
				System.out.println("Erro: "+ e.getMessage());
			}
			
		}
		
		public void inserirAmigo(String nome, String apelido, String telefone) {
			
			try {
				
				String query = "INSERT INTO tbAmigo(nome, apelido, telefone)"
								+"VALUES ('"+nome+"','"+apelido+"','"+telefone+"')";
				//executa o c�digo dentro do sql
				this.statement.executeUpdate(query);
			} catch (Exception e) {
				System.out.println("Erro: "+e.getMessage());
			}
			
		}

}
