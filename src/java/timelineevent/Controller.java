package timelineevent;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Controller {

    public String computerSystemExecute(View_DataInput v) {
        Model dataModel = new Model();
        ComputerSystem cs = new ComputerSystem(v);

        return "index";
    }

    public String computerHardwareExecute(View_DataInput v) {
        Model dataModel = new Model();
        ComputerHardware ch = new ComputerHardware(v);

        return "index";
    }

    

    public String hunmanInterestExecute(View_DataInput v) throws SQLException, ClassNotFoundException {
        Model dataModel = new Model();
        HumanInterest hi = new HumanInterest(v);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://jws-app-mysql:3306/lllc";
        String user ="user";
        String password = "password";
        Connection con = DriverManager.getConnection(url, user, password);
        
        
        
        Statement ps =con.createStatement();
        ps.executeUpdate("INSERT INTO products (id, title, description, price) VALUES (2,12,12,12)" );
        con.close();
        

        return "index";
    }

}
