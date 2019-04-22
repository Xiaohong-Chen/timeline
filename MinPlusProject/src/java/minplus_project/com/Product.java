package minplus_project.com;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author seanc
 */
@ManagedBean
public class Product {
    
    public int productID;
    public String productName;
    public int productQuotePrice;
    public String productURL;
    public int userID;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuotePrice() {
        return productQuotePrice;
    }

    public void setProductQuotePrice(int productQuotePrice) {
        this.productQuotePrice = productQuotePrice;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
    
}
