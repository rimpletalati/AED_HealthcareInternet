/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Patient;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class ReferredDoctorWorkRequest extends WorkRequest{
    
    private ArrayList<Encounter> encounterList;
    private Patient patient;
    private Enterprise senderEnterprise;
    private Enterprise receiverEnterprise;

//    public ReferredDoctorWorkRequest(){
//        encounterList = new ArrayList<>();
//    }
    
    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }
    
    
    
}
