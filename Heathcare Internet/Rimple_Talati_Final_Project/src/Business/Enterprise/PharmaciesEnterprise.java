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
public class PharmaciesEnterprise extends Enterprise{

    private ArrayList<Drugs> drugsList;
    public PharmaciesEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.Pharmacies);
        drugsList = new ArrayList<>();
    }

    public ArrayList<Drugs> getDrugsList() {
        return drugsList;
    }

    public void setDrugsList(ArrayList<Drugs> drugsList) {
        this.drugsList = drugsList;
    }

    public void deleteDrugs( Drugs drugs){
        drugsList.remove(drugs);
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
