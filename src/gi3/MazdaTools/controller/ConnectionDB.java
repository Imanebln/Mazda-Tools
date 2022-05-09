package gi3.MazdaTools.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDB {
	
	private static Connection con = null;

	public ConnectionDB()
	{	String name="automarket";
		String url = "jdbc:mysql://localhost:3306/"+name;
		String user = "root";
		String pass = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connexion réussite");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection()
	{
		return con;
	}
}



