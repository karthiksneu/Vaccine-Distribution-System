/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import TheBusiness.Personnel.Person;
import TheBusiness.Roles.SystemAdminRole;
import TheBusiness.UserAccountManagement.UserAccount;

/**
 *
 * @author soham
 */
public class ConfigureSystem {
    
    public static Ecosystems configure(){
        //Creating Ecosystem
        Ecosystems business = Ecosystems.getInstance();
        Person person = null;
        //Creating sysadmin user account
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());       
        return business;
    }
    
}
