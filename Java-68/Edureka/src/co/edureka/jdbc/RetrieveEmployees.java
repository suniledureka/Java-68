package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		/*
		Class.forName("com.mysql.jdbc.Driver"); 

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		*/
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		try {
			//ResultSet rs = st.executeQuery("select * from emp");
			//ResultSet rs = st.executeQuery("select * from emp where empno=106");
			ResultSet rs = st.executeQuery("select * from emp where empno between 101 and 105");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getFloat("sal"));
				Thread.sleep(2000);
			}
			rs.close();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();		 

	}

}
