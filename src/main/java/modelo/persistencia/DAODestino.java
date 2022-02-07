package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.destino.Destino;

public class DAODestino {

	private Connection con = null;
	private PreparedStatement preparedStatement = null;
	private BancoDados bancoDados;

	public DAODestino() throws Exception {
		bancoDados = new BancoDados();
		con = bancoDados.getConnection();
	}

	public void create(Destino destino) throws SQLException {

		final String sql = "INSERT INTO destino (numeroBilhete, origem, destino, dataEmbarque, horarioEmbarque) VALUES (?, ?, ?, ?, ?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, destino.getNumeroBilhete());
		preparedStatement.setString(2, destino.getOrigem());
		preparedStatement.setString(3, destino.getDestino());
		preparedStatement.setString(4, destino.getDataEmbarque());
		preparedStatement.setString(5, destino.getHorarioEmbarque());
		
		preparedStatement.executeUpdate();

		con.close();
		
	}

	public void delete(Destino destino) throws SQLException {

		final String sql = "DELETE FROM destino WHERE numeroBilhete = ?";

		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, destino.getNumeroBilhete());
		
		preparedStatement.executeUpdate();

		con.close();
	}

	public Destino read(Destino destino) throws SQLException {

		final String sql = "SELECT * FROM destino WHERE numeroBilhete = ?";
		
		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, destino.getNumeroBilhete());
		
		ResultSet rs = preparedStatement.executeQuery();
		
		while (rs.next()) {
			destino.setOrigem(rs.getString("origem"));
			destino.setDestino(rs.getString("destino"));
			destino.setDataEmbarque(rs.getString("dataEmbarque"));
			destino.setHorarioEmbarque(rs.getString("horarioEmbarque"));	
		}
		
		con.close();
		
		return destino;
	}
	
	
	public List<Destino> pegarListaDestinos() throws SQLException {
		
		final String sql = "SELECT * FROM destino";
		
		List<Destino> listaDestinos = new ArrayList<>();		
		
		
		try {
			
			preparedStatement = con.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {	
				Destino destino = new Destino();
				destino.setNumeroBilhete(rs.getInt("numeroBilhete"));
				destino.setOrigem(rs.getString("origem"));
				destino.setDestino(rs.getString("destino"));
				destino.setDataEmbarque(rs.getString("dataEmbarque"));
				destino.setHorarioEmbarque(rs.getString("horarioEmbarque"));
				listaDestinos.add(destino);
			}
			
		} catch (Exception e) {
			System.out.println("Erro" + e);
		}
		
		con.close(); 
		
		return listaDestinos;
		
	}
	

	public void update(Destino destino) throws SQLException {

		final String sql = "UPDATE destino SET origem = ?, destino = ?, dataEmbarque = ?, horarioEmbarque = ? WHERE numeroBilhete = ?";
		
		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, destino.getOrigem());
		preparedStatement.setString(2, destino.getDestino());
		preparedStatement.setString(3, destino.getDataEmbarque());
		preparedStatement.setString(4, destino.getHorarioEmbarque());
		preparedStatement.setInt(5, destino.getNumeroBilhete());
		
		preparedStatement.executeUpdate();
		
		con.close();
	}
	
}