/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minplus_project.com;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author seanc
 */
@ManagedBean
public class ListQuery extends MinPlusDB {
    
    public List<Product> listProduct() throws ClassNotFoundException, SQLException{
        List<Product> productArray=new ArrayList<Product>();
        ps=connectDB().prepareStatement("select productID, productName,productQuotedPrice,productURL,userID from minplusdb.products");
        
        rs=ps.executeQuery();
        Product p;
        
        while(rs.next()){
            p=new Product();
            p.setProductID(rs.getInt("productID"));
            p.setProductName(rs.getString("productName"));
            p.setProductQuotePrice(rs.getInt("productQuotedPrice"));
            p.setProductURL(rs.getString("productURL"));
            p.setUserID(rs.getInt("userID"));
            productArray.add(p);
        }
        return productArray;
    }
}
