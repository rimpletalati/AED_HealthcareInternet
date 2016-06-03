/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Encounter.Encounter;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class ClinicEnterprise extends Enterprise{

    private ArrayList<Encounter> encounterList;
    public ClinicEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.Clinic);
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
