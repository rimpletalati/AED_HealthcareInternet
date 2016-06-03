/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PCCompany extends Organization{

    public PCCompany() {
        super(Organization.Type.PharmaceuticalCompany.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
