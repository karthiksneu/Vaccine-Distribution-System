/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Enterprise;

import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.NationalEnterprise.Distributor;
import TheBusiness.NationalEnterprise.Manufacturer;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//Initializing Enterprise Directory class
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseDirectory;

    public EnterpriseDirectory() {
        enterpriseDirectory = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;
        
        
        if(type == Enterprise.EnterpriseType.Hospital){
            
            enterprise = new HospitalEnterprise(name);
            enterpriseDirectory.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.CDC){
            
            enterprise = new CenterOfDiseaseControl(name);
            enterpriseDirectory.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Distributor){
            
            enterprise = new Distributor(name);
            enterpriseDirectory.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Manufacturer){
            
            enterprise = new Manufacturer(name);
            enterpriseDirectory.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.LocalHealthDepartment){
            
            enterprise = new LocalHealthDepartment(name);
            enterpriseDirectory.add(enterprise);
        }
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise enterprise){
        
        enterpriseDirectory.remove(enterprise);
    }
    
}
