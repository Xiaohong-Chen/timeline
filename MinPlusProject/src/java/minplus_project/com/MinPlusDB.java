package minplus_project.com;

import java.sql.*;

public class MinPlusDB {
    
    private final String url = "jdbc:mysql://mydb.c7dqzvdqwufu.us-east-2.rds.amazonaws.com:3306";
    private final String user = "mydb";
    private final String password = "123456789";
    
    private Connection con=null;
    protected PreparedStatement ps=null;
    protected ResultSet rs = null;
    
    public Connection connectDB() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        return con;
    }
    
    public void disconnectDB() throws SQLException{
        con.close();
        ps.close();
        rs.close();
        
    }
    
}
