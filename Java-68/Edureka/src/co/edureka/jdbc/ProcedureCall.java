package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		//Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java68","password");
		
		CallableStatement cst = con.prepareCall("{call addNum(?,?,?)}");
		
		int x = 23, y = 45;
		cst.setInt(1, x);
		cst.setInt(2, y);
		
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		
		int sum = cst.getInt(3);
		System.out.println(x+" + "+y+" = "+ sum);		
		
		con.close();
	}
}
