package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Usuarios.Cliente;

public class ClienteDao {
	// a conex�o com o banco de dados
	 private Connection connection;
	
	 public ClienteDao() {
	 this.connection = new ConnectionFactory().getConnection();
	 }
	 
public void adiciona(Cliente cliente) {
 String sql = "insert into usuarios " +
 "(nome,senha,email,endereco,tipo,incremento)" +
 " values (?,?,?,?,?,?)";

 try {
 // prepared statement para inser��o
	 PreparedStatement stmt = connection.prepareStatement(sql);

 // seta os valores
 stmt.setString(1,cliente.getNome());
 stmt.setString(2,cliente.getSenha());
 stmt.setString(3,cliente.getEmail());
 stmt.setString(4,cliente.getEndereco());
 stmt.setString(5,cliente.getTipo());
 stmt.setLong(6,cliente.getCpf());
 

 // executa
 stmt.execute();
 stmt.close();
} catch (SQLException e) {
	throw new RuntimeException(e);
 }
}
}

