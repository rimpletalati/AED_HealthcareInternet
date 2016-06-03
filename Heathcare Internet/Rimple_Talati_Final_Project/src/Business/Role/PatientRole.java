/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class PatientRole extends Role{

    public PatientRole() {
        super(RoleType.Patient.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        
        Person person = account.getPerson();
        Patient patient = (Patient)person;
        return new PatientWorkAreaJPanel(userProcessContainer, ecosystem,patient);
    }
    
}
