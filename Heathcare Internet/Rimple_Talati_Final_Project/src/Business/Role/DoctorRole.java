/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class DoctorRole extends Role{

    public DoctorRole() {
        super(RoleType.Doctor.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {

        Person person = account.getPerson();
        Doctor doctor = (Doctor)person;
            return new DoctorWorkAreaJPanel(userProcessContainer, ecosystem,doctor);
    }
    
}
