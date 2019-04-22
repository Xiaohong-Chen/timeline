/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minplus_project.com;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author seanc
 */

public class MainController {
    private List<Product> productList;
    ListQuery query = new ListQuery();

    public List<Product> getProductList() throws ClassNotFoundException, SQLException {
        productList = query.listProduct();
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
