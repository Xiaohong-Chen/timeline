package minplus_project.com;

import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author seanc
 */
@ManagedBean
@RequestScoped
public class UserLogin extends MinPlusDB{

    private int userID;

    public int getUserID() {
        return userID;
    }
    
    private String userLastName;
    private String userFirstName;
    private String userPassword;

    private String usergender;
    private String userEmail;
    private String userMobileNum;

    private String userLoginEmail;
    private String userLoginPassword;

    public String getUserLoginEmail() {
        return userLoginEmail;
    }

    public void setUserLoginEmail(String userLoginEmail) {
        this.userLoginEmail = userLoginEmail;
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobileNum() {
        return userMobileNum;
    }

    public void setUserMobileNum(String userMobileNum) {
        this.userMobileNum = userMobileNum;
    }

    public String checkUserAccount() throws ClassNotFoundException, SQLException {
        ps = connectDB().prepareStatement("SELECT * FROM minplusdb.users where userEmail ='"+ userLoginEmail+"'");
        rs=ps.getResultSet();
        rs=ps.executeQuery();
        
        
        while(rs.next()){
            userPassword = rs.getString("userPassword");
            if(userPassword.equals(userLoginPassword)){
                userID =rs.getInt("userID");
                userLastName=rs.getString("userLastName");
                userFirstName=rs.getString("userFirstName");
                disconnectDB();
                return "myaccount";
            }
          
        }
        return null;   
    }
}
