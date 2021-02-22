package curd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudent 
{
	public static void main(String[] args) throws Exception 
	{
		Driver d = new com.mysql.jdbc.Driver();
		//System.out.println(d);
		DriverManager.registerDriver(d);
		
		String db = "jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		Connection con1 =  DriverManager.getConnection(db);
		//System.out.println(con1);
		
		String sql = "SELECT * FROM student";
		Statement stmt = con1.createStatement();
		ResultSet res = stmt.executeQuery(sql);
		
		int count = 0;
		
		while(res.next())
		{
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getInt(4));
			System.out.println(res.getString(5));
			System.out.println(res.getString(6));
			System.out.println(res.getString(7));
			System.out.println(res.getString(8));
			System.out.println(res.getString(9));
			System.out.println(res.getString(10));
			System.out.println("-------------------------------");
		}
		
		stmt.close();
		con1.close();
		DriverManager.deregisterDriver(d);
		
	}
}
