package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) throws Exception
	{
	 //Initialize JDBC Driver of MySQL
	 Class.forName("com.mysql.jdbc.Driver");
	 
	 //Connect to MySQL DB Server
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
	 
	 //Create an object for passing SQL queries to DB
	 Statement st = con.createStatement();
	 
	 try {
		 String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		 st.execute(sql);
		 System.out.println("DB Table Created!");
	 }
	 catch(Exception ex) {
		 System.out.println("DB Table could not be created: "+ ex.toString());
	 }
	 
	 //close the connection with DB
	 st.close();
	 con.close();
	}
}
