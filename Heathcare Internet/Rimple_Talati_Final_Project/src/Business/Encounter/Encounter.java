/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import Business.Person.Doctor;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.LabTestWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rimple
 */
public class Encounter {

    private int encounterID;
    private Patient patient;
    private Doctor doctor;
    private VitalSigns vitalSign;
    private String medication;
    private Date encounterDate;
    private LabTestWorkRequest labTestWorkResquest;
    private static int count = 1;
    private ArrayList<Drugs> drugs;
    
    public Encounter() {
        encounterDate = new Date();
        encounterID = count;
        count++;
        drugs = new ArrayList<>();
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public LabTestWorkRequest getLabTestWorkResquest() {
        return labTestWorkResquest;
    }

    public void setLabTestWorkResquest(LabTestWorkRequest labTestWorkResquest) {
        this.labTestWorkResquest = labTestWorkResquest;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public ArrayList<Drugs> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drugs> drugs) {
        this.drugs = drugs;
    }

    @Override
    public String toString(){
    return String.valueOf(encounterID);
}

}
