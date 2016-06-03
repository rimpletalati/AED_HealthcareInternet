/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class Doctor extends Person{
    
    private String licenseNo;
    private String specialization;
   // private String dateOfJoining;
    private ArrayList<Patient> patientList;//delete this later on
    private ArrayList<Enterprise> enterpriseList;
    
    public Doctor() {
        this.patientList = new ArrayList<>();
        this.enterpriseList = new ArrayList<>();
    }

    
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

//    public String getDateOfJoining() {
//        return dateOfJoining;
//    }
//
//    public void setDateOfJoining(String dateOfJoining) {
//        this.dateOfJoining = dateOfJoining;
//    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    
    @Override
    public String toString() {
        return super.getSsn();
    }
    
}
