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
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import UserInterface.AdministrativeRole.ManageOrgJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class AdminRole extends Role{

    public AdminRole() {
        super(RoleType.Admin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, ecosystem);
    }
    
}
