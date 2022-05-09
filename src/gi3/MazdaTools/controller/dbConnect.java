package gi3.MazdaTools.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {

	
	public static Connection Connect() throws SQLException
	{	
		try {
			String databaseUser ="root";
			String databaseMDP ="";
			String databaseName ="automarket";
			String url ="jdbc:mysql://localhost:3306/"+databaseName;
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection(url,databaseUser,databaseMDP);
				return con;
		} catch (ClassNotFoundException | SQLException e) {
		}
		return null;
		
		
	}
}
