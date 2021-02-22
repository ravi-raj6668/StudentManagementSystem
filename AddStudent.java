package curd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddStudent 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		Driver d = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		String db = "jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		Connection con1 =  DriverManager.getConnection(db);
		
		
		String sql = "INSERT INTO student (id, Fname, Lname, PhNo, Address, marks, Gender, DOB, Branch, Result) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = con1.prepareStatement(sql);
		
			System.out.println("Enter the id");
			int id  = sc.nextInt();
			stmt.setInt(1, id);
			sc.nextLine();
			System.out.println("Enter the Fname");
			String Fname = sc.nextLine();
			stmt.setString(2, Fname);
			
			System.out.println("Enter the Lname");
			String Lname = sc.nextLine();
			stmt.setString(3, Lname);
			
			System.out.println("Enter the phone number");
			String PhNo = sc.nextLine();
			stmt.setString(4, PhNo);
		
			System.out.println("Enter the address");
			String Address = sc.nextLine();
			stmt.setString(5, Address);
			
			System.out.println("Enter the marks");
			Double marks = sc.nextDouble();
			stmt.setDouble(6, marks);
			
			sc.nextLine();
			System.out.println("Enter the Gender");
			String Gender = sc.nextLine();
			stmt.setString(7, Gender);
			
			System.out.println("Enter Date Of Birth");
			String DOB = sc.nextLine();
			stmt.setString(8, DOB);
			
			System.out.println("Enter the Branch");
			String Branch = sc.nextLine();
			stmt.setString(9, Branch);
			
			System.out.println("Enter the Result");
			String Result = sc.nextLine();
			stmt.setString(10, Result);
			
		
		
		int r = stmt.executeUpdate();
		if(r > 0)
		{
			System.out.println("A new Student is added successfully");
			
		}
		
		stmt.close();
		con1.close();
		DriverManager.deregisterDriver(d);
		
	}
		
}
