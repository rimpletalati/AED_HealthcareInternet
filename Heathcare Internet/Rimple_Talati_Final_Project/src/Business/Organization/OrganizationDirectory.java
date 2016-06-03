/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.PharmaceuticalCompany.getValue())){
            organization = new PCCompany();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.Drug.getValue())){
            organization = new DrugOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
