package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Usuarios.Admin;

public class AdminDao {
	// a conex�o com o banco de dados
	 private Connection connection;
	
	 public AdminDao() {
	 this.connection = new ConnectionFactory().getConnection();
	 }
	 
public void adiciona(Admin administrador) {
 String sql = "insert into usuarios " +
 "(nome,senha,email,endereco,tipo,incremento)" +
 " values (?,?,?,?,?,?)";

 try {
 // prepared statement para inser��o
	 PreparedStatement stmt = connection.prepareStatement(sql);

 // seta os valores
 stmt.setString(1,administrador.getNome());
 stmt.setString(2,administrador.getSenha());
 stmt.setString(3,administrador.getEmail());
 stmt.setString(4,administrador.getEndereco());
 stmt.setString(5,administrador.getTipo());
 stmt.setInt(6,administrador.getMatricula());
 
 // executa
 stmt.execute();
 stmt.close();
} catch (SQLException e) {
	throw new RuntimeException(e);
 }
}
}

