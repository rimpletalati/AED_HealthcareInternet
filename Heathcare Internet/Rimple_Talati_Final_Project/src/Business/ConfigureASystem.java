/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Rimple
 */
public class ConfigureASystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        Person  person = system.getPersonDirectory().createPerson("Rimple","Talati");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sa", "sa", person, new SystemAdminRole());
        
        return system;
    }
}
