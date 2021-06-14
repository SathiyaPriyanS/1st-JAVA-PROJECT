package configuration;

import java.sql.*;

public class JDBCConnection {
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");	
		return con;
	}
}