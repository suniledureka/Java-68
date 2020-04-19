package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDbConnection(); 
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into emp values(109,'Employee-1',134.23)");
		st.addBatch("insert into emp values(110,'Employee-2',234.23)");
		//st.addBatch("insert into emp values(109,'Employee-3',134.23)");
		st.addBatch("insert into emp values(111,'Employee-3',134.23)");
		st.addBatch("update emp set sal=2500 where empno>108");
		
		con.setAutoCommit(false);
		
		try {
			int[] n = st.executeBatch();
			for(int x : n) {
				System.out.println("Employee Updated: "+x);
			}
			
			con.commit();
		}
		catch(Exception ex) {
			System.out.println("Batch Execution Failed");
			con.rollback();
		}
		
		st.close();
		con.close();
	}

}
