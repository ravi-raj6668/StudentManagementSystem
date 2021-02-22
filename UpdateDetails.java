package curd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDetails 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		Driver d = new com.mysql.jdbc.Driver();
		//System.out.println(d);
		DriverManager.registerDriver(d);
		
		String db = "jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		Connection con1 =  DriverManager.getConnection(db);
		//System.out.println(con1);
		
		String sql = "UPDATE student "+ 
					"SET Fname = ?, "
						
					+"WHERE ID= ? ";
		
		PreparedStatement stmt = con1.prepareStatement(sql);
		System.out.println("Enter the id");
		int id  = sc.nextInt();
		stmt.setInt(2, id);
		
		
		System.out.println("Enter the Fname to be updated");
		sc.nextLine();
		String Fname = sc.nextLine();
		stmt.setString(1, Fname);
		
		System.out.println("Enter the Fname to be updated");
		String Lname = sc.nextLine();
		stmt.setString(2, Lname);
		
		System.out.println("Enter the PhNo to be updated");
		String PhNo = sc.nextLine();
		stmt.setString(3, PhNo);
		
		System.out.println("Enter the Address to be updated");
		String Address = sc.nextLine();
		stmt.setString(4, Address);
		
		System.out.println("Enter the marks to be updated");
		Double marks = sc.nextDouble();
		stmt.setDouble(5, marks);
		sc.nextLine();
		
		System.out.println("Enter the Gender to be updated");
		String Gender = sc.nextLine();
		stmt.setString(6, Gender);

		System.out.println("Enter the DOB to be updated");
		String DOB = sc.nextLine();
		stmt.setString(7, DOB);
		
		System.out.println("Enter the Branch to be updated");
		String Branch = sc.nextLine();
		stmt.setString(8, Branch);
		
		System.out.println("Enter the Result to be updated");
		String Result = sc.nextLine();
		stmt.setString(9, Result);
		
		
		int r = stmt.executeUpdate();
		if(r > 0)
		{
			System.out.println("An existing student is updated successfully");
			
		}
		
		stmt.close();
		con1.close();
		DriverManager.deregisterDriver(d);
	}
}
