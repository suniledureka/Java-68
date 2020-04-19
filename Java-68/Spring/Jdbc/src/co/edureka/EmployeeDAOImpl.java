package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jt;

	public EmployeeDAOImpl() {
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values(" + emp.getEmpno() + ",'" + emp.getEname() + "'," + emp.getSal() + ")";
		int rows_affected = jt.update(sql);
		if (rows_affected > 0) {
			System.out.println("Employee Saved!");
		}
	}

	@Override
	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='" + emp.getEname() + "', sal=" + emp.getSal() + " where empno="+emp.getEmpno();
		int rows_affected = jt.update(sql);
		if (rows_affected > 0) {
			System.out.println("Employee Updated!");
		}

	}

	@Override
	public void deleteEmp(int empno) {
		String sql = "delete from emp where empno="+empno;
		int rows_affected = jt.update(sql);
		if(rows_affected>0)
			System.out.println("Employee Deleted");
		else
			System.out.println("No Matching Employee found!");
	}

	@Override
	public List<Employee> getEmployees() {
		String sql = "select * from emp";
		List<Employee> emps = new ArrayList<>();
		
		emps = jt.query(sql, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList = new ArrayList<>();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setSal(rs.getFloat(3));
					empList.add(emp);
				}			
				return empList;
			}
			
		});
		
		return emps;
	}

}
