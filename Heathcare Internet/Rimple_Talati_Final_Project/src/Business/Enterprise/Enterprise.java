/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Rimple
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpiseType;
    private OrganizationDirectory organizationDirectory;
    

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpiseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpiseType() {
        return enterpiseType;
    }

    public void setEnterpiseType(EnterpriseType enterpiseType) {
        this.enterpiseType = enterpiseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterpriseType{
        
        Hospital("Hosptial"),
        Clinic("Clinic"),
        Pharmacies("Pharmacies"),
        PharmaceuticalCompanies("Pharmaceutical Companies");
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }        
    }
}
