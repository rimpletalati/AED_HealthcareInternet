/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Rimple
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String labResults;
    private String patientName;
    private int mrNO;
    private Enterprise senderEnterprise;
    private String prescription;
    private int encounterID;

    public String getLabResults() {
        return labResults;
    }

    public void setLabResults(String labResults) {
        this.labResults = labResults;
    }

    public int getMrNO() {
        return mrNO;
    }

    public void setMrNO(int mrNO) {
        this.mrNO = mrNO;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }
    
    @Override
    public String toString(){
        return super.getMessage();
    }
    
    
    
    
}
