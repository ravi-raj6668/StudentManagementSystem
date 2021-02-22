package curd;

import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		
		StudentMain sm = new StudentMain();
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter the choice");
			System.out.println("1.Add\n2.Update\n3.Delete\n4.Display\5.Exit");
			int ch  = sc.nextInt();
		
			switch(ch)
			{
			case 1: 
					break;
					
			case 2: 
					break;
					
			case 3: 
					break;
					
			case 4: 
					break;
					
			case 5: System.exit(0);
			
			default : System.out.println("Invalid Choice");
			}
		}
	}
}
