
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Role.AdminAuthorityRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class AdminAuthority extends Organization{
    
    private static AdminAuthority adminAuthority;
    private ArrayList<Doctor> doctorList;
    
    public AdminAuthority() {
        super(null);
        this.doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminAuthorityRole());
        return roleList;
    }
    
}
