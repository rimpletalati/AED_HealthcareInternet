/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drugs;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PharmacyWorkRequest extends WorkRequest{
    
    private Patient patient;
    private Enterprise enterprise;
    private String pharmicistName;
    private Drugs drugs;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getPharmicistName() {
        return pharmicistName;
    }

    public void setPharmicistName(String pharmicistName) {
        this.pharmicistName = pharmicistName;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    @Override
    public String toString(){
        return super.getMessage();
    }
}
