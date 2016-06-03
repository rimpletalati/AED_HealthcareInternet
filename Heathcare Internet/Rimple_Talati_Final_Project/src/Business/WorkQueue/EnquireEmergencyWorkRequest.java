/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class EnquireEmergencyWorkRequest extends WorkRequest{
    
    private int mrNo;
    private ArrayList<Encounter>encounterList;
    private Enterprise enterprise;
    private Doctor doctor;

    public EnquireEmergencyWorkRequest(){
        encounterList = new ArrayList<>();
    }
    public int getMrNo() {
        return mrNo;
    }

    public void setMrNo(int mrNo) {
        this.mrNo = mrNo;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
}
