/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Roles.ManufacturerRole;
import TheBusiness.Roles.Role;
import TheBusiness.VaccineManagement.VaccineProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//INitializing our ManufactureOrganization that extends our Organization Entity
public class ManufactureOrganization extends Organization {
    
    private VaccineProductCatalog vaccineProductCatalog;
    
    public ManufactureOrganization() {
        super(OrganizationType.ManufactureOrg.getValue());
        vaccineProductCatalog = new VaccineProductCatalog();
    }

    public VaccineProductCatalog getVaccineProductCatalog() {
        return vaccineProductCatalog;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerRole());
        return roles;
    }
    
}
