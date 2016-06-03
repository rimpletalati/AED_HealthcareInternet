/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.LabAssistant;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class LabRole extends Role{

    public LabRole() {
        super(RoleType.Lab.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        Person person = account.getPerson();
        LabAssistant la = (LabAssistant)person;
            return new LabAssistantWorkAreaJPanel(userProcessContainer, enterprise,la);
    }
    
}
