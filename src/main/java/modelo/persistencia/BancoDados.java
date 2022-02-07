package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BancoDados {

	private final String url = "jdbc:mysql://localhost:3306/recodetour?useTimezone=true&serverTimezone=UTC";
	private final String user = "root";
	private final String password = "";
	private final String driverBanco = "com.mysql.cj.jdbc.Driver";
	private Connection con = null;
	private PreparedStatement preparedStatement = null;
	
	public BancoDados() throws Exception {
		Class.forName(driverBanco);
		con = DriverManager.getConnection(url, user, password);
	}
	
	public Connection getConnection() {
		return con;
	}
}
