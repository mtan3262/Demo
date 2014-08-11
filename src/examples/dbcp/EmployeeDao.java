package examples.dbcp;

import java.sql.SQLException;

public interface EmployeeDao {

	String SUCCESS="success";
	
    public String getEmployeeName(int empno) throws SQLException;
    
    public void getAllEmployeeName() throws SQLException ;
}