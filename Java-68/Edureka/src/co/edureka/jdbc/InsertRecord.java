package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		
		Statement st = con.createStatement();
		
		try {
			//String sql = "insert into emp values(101,'Sunil',123.45)";
			String sql = "insert into emp(empno,ename,sal) values(102,'Anil',223.45),(103,'Praveen',345.12),(104,'Rahul',567.12),(105,'Naveen',567.12)";
			int n = st.executeUpdate(sql);
			System.out.println("Employees Saved = "+ n);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}

}
