/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.Organization;
import Business.Role.ManageDiseaseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class ManageDiseaseAdmin extends Organization {

    private ArrayList<Disease> diseaseList;

    public ManageDiseaseAdmin() {
        super(Type.DiseaseOrganization.getValue());
        diseaseList = new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ManageDiseaseRole());
        return roleList;
    }

}
