package com.klu.Connections;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil{
		final static String fornameURL = "com.mysql.jdbc.Driver";
		final static String dbURL  = "jdbc:mysql://localhost:3306/ep";
		final static String username = "root";
		final static String password = "190031460@s14";
		public static Connection DBConnection() throws SQLException, ClassNotFoundException
		{
			Class.forName(fornameURL);
			Connection con1 = DriverManager.getConnection(dbURL, username,password);
			return con1;
		}
}
