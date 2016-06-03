/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Clinic){
            enterprise = new ClinicEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Pharmacies){
            enterprise = new PharmaciesEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.PharmaceuticalCompanies){
            enterprise = new PharmaceuticalCompaniesEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public boolean checkifEnterpriseTypeUnique(String enterpriseName){
        for(Enterprise enterprise: enterpriseList){
        if(enterprise.getName().equals(enterpriseName)){
            return false;
            }
        }
        return true;
    }
    
    public void deleteEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
}
