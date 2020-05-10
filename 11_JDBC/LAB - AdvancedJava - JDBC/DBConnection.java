package cg.javaflp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		try {
			// step 1 - load the driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			// step 2 - create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ems", "root", "admin");
			
			// step 3 - create statement 
			Statement st = con.createStatement();
			
			// Code to insert a new row in the table
			StringBuilder sb1 = new StringBuilder();
			sb1.append("insert into user values(8, 'ohHo', 'java', 'pwd')");
			st.executeUpdate(sb1.toString());

			// Creating query String
			StringBuilder sb = new StringBuilder();
			sb.append("select * from user");
			
			// step 4 - execute query
			ResultSet rs = st.executeQuery(sb.toString());
			
			System.out.println("NAME" + "\t" + "PWD" + "\t" + "TECH");
			
			// step 5 - handing the result set; and displaying it on console 
			while (rs.next()) {
				String userName = rs.getString("name");
				String password = rs.getString("password");
				String technology = rs.getString("technology");

				System.out.println(userName + "\t" + password + "\t" + technology);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
