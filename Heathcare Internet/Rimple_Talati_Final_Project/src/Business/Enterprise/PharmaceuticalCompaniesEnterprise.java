/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.PharmaceuticalCompany.Drugs;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PharmaceuticalCompaniesEnterprise extends Enterprise{

    private ArrayList<Drugs> drugsList;
    private ArrayList<PharmaciesEnterprise> pharmaciesEnterpriseList;
    
    
    public PharmaceuticalCompaniesEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.PharmaceuticalCompanies);
        drugsList = new ArrayList<>();
        pharmaciesEnterpriseList = new ArrayList<>();
       
    }

    public ArrayList<Drugs> getDrugsList() {
        return drugsList;
    }

    public void setDrugsList(ArrayList<Drugs> drugsList) {
        this.drugsList = drugsList;
    }

    public ArrayList<PharmaciesEnterprise> getPharmaciesEnterpriseList() {
        return pharmaciesEnterpriseList;
    }

    public void setPharmaciesEnterpriseList(ArrayList<PharmaciesEnterprise> pharmaciesEnterpriseList) {
        this.pharmaciesEnterpriseList = pharmaciesEnterpriseList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
