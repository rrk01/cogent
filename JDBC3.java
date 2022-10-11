package cogenttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC3 {
	
	public static void printLC(Connection con1) {
		try {
			Statement st = con1.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			while(rs.next()) {
				for(int i = 1; i <= 5; i ++) {
					System.out.println(rs.getString(1) + " \t| " + rs.getString(2) + " \t| " + rs.getString(3) + " \t| " + rs.getString(4));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addLC(Connection con1) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("> ADDING ENTRY <");
		try {
			
			PreparedStatement ps = con1.prepareStatement("insert into localcustomers values(?,?,?,?)");
			
			while (true) {
				
				System.out.println("ID: ");
				try {
					ps.setInt(1, sc1.nextInt());
				} catch (Exception e) {
					System.out.println("Invalid ID.");
					continue;
				}
				System.out.println("Name: ");
				sc1.next();
				
				ps.setString(2, "Samuel");
				ps.setString(3, "datums");
			}
			int i = ps.executeUpdate();
			System.out.println(i + " record(s) are inserted.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc1.close();
		}
	}
	
	public static void updateLC(Connection con1) {
		//PreparedStatement ps1 = con1.prepareStatement("update student set stname=? where stno=?");
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is available.");
			String url = "jdbc:mysql://localhost:3306/localcustomers?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Rizzulk123!");
			System.out.println("Connected to database.");
			
			//create table LocalCustomers(stno int primary key, stname varchar(25) not null, email varchar(25), rewardpoints int);
			
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("--- LOCAL CUSTOMER DATABASE ---");
				System.out.println("1. View all");
				System.out.println("2. Add");
				System.out.println("3. Update");
				System.out.println("4. Delete");
				System.out.println("5. Search by ID");
				System.out.println("6. Exit");
				int userSelection;
				
				try {
					userSelection = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid selection.");
					e.printStackTrace();
					continue;
				}
				
				switch(userSelection) {
					case 1:
						printLC(con);
					case 2:
						addLC(con);
					case 6:
						sc.close();
						break;
					default:
						System.out.println("Invalid selection.");
				}
					
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
