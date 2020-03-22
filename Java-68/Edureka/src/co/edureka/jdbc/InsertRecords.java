package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.jdbc.Driver"); 

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		
		//Statement st = con.createStatement();
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		String req="Y";
		while(req.equalsIgnoreCase("Y"))
		{
		 try {
			System.out.print("enter empno: ");
			int eno = sc.nextInt();
			sc.nextLine();
			
			System.out.print("enter name: ");
			String name = sc.nextLine();
			
			System.out.print("enter salary: ");
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			System.out.println("Employees Saved = "+ n);
			
			System.out.print("more employees to save [Y/N] : ");
			req= sc.next();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		}//while
		
		pst.close();
		con.close();		 

	}

}
