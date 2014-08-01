package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Usuarios.Usuario;

public class UsuarioDao {
	// a conexão com o banco de dados
	 private Connection connection;
	
	 public UsuarioDao() {
	 this.connection = new ConnectionFactory().getConnection();
	 }
	 
public void adiciona(Usuario usuario) {
 String sql = "insert into usuarios " +
 "(nome,senha,email,endereco,tipo, incremento)" +
 " values (?,?,?,?,?,?)";

 try {
 // prepared statement para inserção
	 PreparedStatement stmt = connection.prepareStatement(sql);

 // seta os valores
 stmt.setString(1,usuario.getNome());
 stmt.setString(2,usuario.getSenha());
 stmt.setString(3,usuario.getEmail());
 stmt.setString(4,usuario.getEndereco());
 stmt.setString(5,usuario.getTipo());
 ;
 

 // executa
 stmt.execute();
 stmt.close();
} catch (SQLException e) {
	throw new RuntimeException(e);
 }
}
}

