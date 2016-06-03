    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public abstract class Role {
    
    private String role;
    public enum RoleType{
        Admin("Admin"),
        AdminAuthority("Admin Authority"),
        WorldFDA("World FDA"),
        SystemAdmin("System Admin"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Patient("Patient"),
        Pharmacy("Pharmacist"),
        Lab("Lab"),
        DrugManage("Drug Manage"),
        PCEmployee("Pharmaceutical Company Employee"),
        ManageDisease("Manage Disease");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public Role(String role) {
       this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Ecosystem business);

    @Override
    public String toString() {
        return role;
    }
}
