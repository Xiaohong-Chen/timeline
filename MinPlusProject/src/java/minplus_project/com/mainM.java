/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minplus_project.com;

import java.sql.SQLException;

/**
 *
 * @author seanc
 */
public class mainM {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        MainController m = new MainController();
        
        System.out.println(m.getProductList().get(0).getProductURL());
        
    }
}
