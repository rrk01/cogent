package cogenttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample2 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is available.");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "21393006739290r");
			System.out.println("Connected to database.");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			while(rs.next()) {
				for(int i = 1; i <= 5; i ++) {
					System.out.println(rs.getString(1) + " \t| " + rs.getString(2) + " \t| " + rs.getString(3) + " \t| " + rs.getString(4) + " \t| " + rs.getString(5));
				}
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
