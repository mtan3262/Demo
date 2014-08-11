package examples.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class EmployeeDaoImpl extends Action implements EmployeeDao {

    private DataSource dataSource_;
    Logger logger = Logger.getLogger(getClass());
    public EmployeeDaoImpl(DataSource dataSource) {
        dataSource_ = dataSource;
    }

    public String getEmployeeName(int empno) throws SQLException {
        String ename = null;
        Connection con = dataSource_.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                "SELECT ename FROM emp WHERE empno = ?");
           
            try {
                ps.setInt(1, empno);
                ResultSet rs = ps.executeQuery();
                try {
                    if (rs.next()) {
                        ename = rs.getString("ename");
                    }
                } finally {
                    rs.close();
                }
            } finally {
                ps.close();
            }
        } finally {
            con.close();
        }
        return ename;
    }
    public void getAllEmployeeName() throws SQLException
    {
    	
        Connection con = dataSource_.getConnection();
        try {
        	Statement ps = con.createStatement();
           
            try {
               
                ResultSet rs = ps.executeQuery( "SELECT * FROM STU");
                System.out.println("STT	USERNAME	PASSWORD");
                try {
                    while (rs.next()) {
                      // String name = rs.getString("ename");
                        
                        System.out.print(rs.getInt("id")+"\t"+rs.getString("USERNAME")+"\t\t"+rs.getString("PASSWORD"));
                        System.out.println("");
                    }
                } finally {
                    rs.close();
                }
            } finally {
                ps.close();
            }
        } finally {
            con.close();
        }
       
    	
    }
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws SQLException{
		
    	Connection con = dataSource_.getConnection();
        try {
        	Statement ps = con.createStatement();
           
            try {
               
                ResultSet rs = ps.executeQuery( "SELECT * FROM STU");
                System.out.println("STT	USERNAME	PASSWORD");
                try {
                    while (rs.next()) {
                      // String name = rs.getString("ename");
                        
                        System.out.print(rs.getInt("id")+"\t"+rs.getString("USERNAME")+"\t\t"+rs.getString("PASSWORD"));
                        System.out.println("");
                    }
                } finally {
                    rs.close();
                }
            } finally {
                ps.close();
            }
        } finally {
            con.close();
        }
       
		System.out.println("hello");
		return mapping.findForward(SUCCESS) ;
} 
}