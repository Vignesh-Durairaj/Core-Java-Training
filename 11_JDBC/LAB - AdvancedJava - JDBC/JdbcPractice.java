package cg.javaflp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class JdbcPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "admin");
		
			/**
			 *  Code for Lab 11.2 - using statement
			 */
			
			/*
			Statement st = con.createStatement();
			StringBuilder sb = new StringBuilder();
			sb.append("select * from user where name = '" + name + "'");
			ResultSet rs = st.executeQuery(sb.toString());
			*/
			
			/** 
			 * Fetch query using Prepared statement 
			 */
			PreparedStatement ps = con.prepareStatement("select * from user where name = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String userName = rs.getString("name");
				String technology = rs.getString("technology");

				System.out.println(userName + " belong to " + technology + " technology");
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
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getDBConncetion(){
		
		
		return null;
	}

}
