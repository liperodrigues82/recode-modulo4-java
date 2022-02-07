package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.cliente.Cliente;

public class DAOCliente {

	private static Connection con = null;
	private static PreparedStatement preparedStatement = null;
	private BancoDados bancoDados;	

	public DAOCliente() throws Exception {
		bancoDados = new BancoDados();
		con = bancoDados.getConnection();
	}

	public void create(Cliente cliente) throws SQLException {

		final String sql = "INSERT INTO cliente (codigo, nome, rg, email, telefone) VALUES (?, ?, ?, ?, ?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, cliente.getCodigo());
		preparedStatement.setString(2, cliente.getNome());
		preparedStatement.setString(3, cliente.getRg());
		preparedStatement.setString(4, cliente.getTelefone());
		preparedStatement.setString(5, cliente.getTelefone());
		preparedStatement.executeUpdate();

		con.close();
	}

	public void delete(Cliente cliente) throws SQLException {

		final String sql = "DELETE FROM cliente WHERE codigo = ?";

		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, cliente.getCodigo());
		preparedStatement.executeUpdate();

		con.close();
	}

	public Cliente read(Cliente cliente) throws SQLException {

		final String sql = "SELECT * FROM cliente WHERE codigo = ?";

		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, cliente.getCodigo());

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			cliente.setNome(rs.getString("nome"));
			cliente.setRg(rs.getString("rg"));
			cliente.setEmail(rs.getString("email"));
			cliente.setTelefone(rs.getString("telefone"));
		}

		con.close();

		return cliente;
	}
	
	public List<Cliente> pegarListaClientes() throws SQLException {
		
		final String sql = "SELECT * FROM cliente";
		
		List<Cliente> listaClientes = new ArrayList<>();		
		
		
		try {
			
			preparedStatement = con.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {	
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setRg(rs.getString("rg"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				listaClientes.add(cliente);
			}
			
		} catch (Exception e) {
			System.out.println("Erro" + e);
		}
		
		con.close(); 
		
		return listaClientes;
		
	}
	
	public void update(Cliente cliente) throws SQLException {

		final String sql = "UPDATE cliente SET nome = ?, rg = ?, email = ?, telefone = ? WHERE codigo = ?";

		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, cliente.getNome());
		preparedStatement.setString(2, cliente.getRg());
		preparedStatement.setString(3, cliente.getTelefone());
		preparedStatement.setString(4, cliente.getTelefone());
		preparedStatement.setInt(5, cliente.getCodigo());

		preparedStatement.executeUpdate();

		con.close();
	}

}
