/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Pharmacy.PharmacyStore;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PharmacyOrganization extends Organization {

    private ArrayList<PharmacyStore> pharmacyStoreList;

    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
        pharmacyStoreList = new ArrayList<>();
    }

    public ArrayList<PharmacyStore> getPharmacyStoreList() {
        return pharmacyStoreList;
    }

    public void setPharmacyStoreList(ArrayList<PharmacyStore> pharmacyStoreList) {
        this.pharmacyStoreList = pharmacyStoreList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
