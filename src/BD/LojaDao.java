package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Usuarios.Loja;

public class LojaDao {
	// a conex�o com o banco de dados
	 private Connection connection;
	
	 public LojaDao() {
	 this.connection = new ConnectionFactory().getConnection();
	 }
	 
public void adiciona(Loja loja) {
 String sql = "insert into usuarios " +
 "(nome,senha,email,endereco,tipo,incremento)" +
 " values (?,?,?,?,?,?)";

 try {
 // prepared statement para inser��o
	 PreparedStatement stmt = connection.prepareStatement(sql);

 // seta os valores
 stmt.setString(1,loja.getNome());
 stmt.setString(2,loja.getSenha());
 stmt.setString(3,loja.getEmail());
 stmt.setString(4,loja.getEndereco());
 stmt.setString(5,loja.getTipo());
 stmt.setInt(6,loja.getCnpj());

 

 // executa
 stmt.execute();
 stmt.close();
} catch (SQLException e) {
	throw new RuntimeException(e);
 }
}
}

