package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java68","password");
		
		Statement st = con.createStatement();
		
		try {
			String sql = "create table emp(empno number(5) primary key,ename varchar(30), sal number(10,2))";
			st.execute(sql);
			System.out.println("DB Table Created!");
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}
}
