/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Roles.Role;
import TheBusiness.Roles.ClinicProviderRole;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */
//INitializing our ClinicOrganization that extends our Organization Entity
public class ClinicOrganization extends Organization{
    
    private String ClincName;
    
    public ClinicOrganization() {
        super(OrganizationType.ClinicOrganization.getValue());
    }

    public String getClincName() {
        return ClincName;
    }

    public void setClincName(String ClincName) {
        this.ClincName = ClincName;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicProviderRole());
        return roles;
    }
    
}
