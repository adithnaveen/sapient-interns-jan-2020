package com.naveen.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

	// all variables WRT connection goes here 
	static Connection connection;
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs1, rs2; 
	
	public static Connection getPostGresConnection() {

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection
					("jdbc:postgresql://localhost:5432/sapdb", 
							"postgres", "kanchan@1");

			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
