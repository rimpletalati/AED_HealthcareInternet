/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author Rimple
 */
public class Patient extends Person{
    
    private int mrNo;
    private String maritalStatus;
    private String isInsurance;
    private String insuranceNo;
    private String insuranceCompany;
    private Doctor preferredDoctor;
    private Doctor referredDoctor;
    private Date registrationDate;
    private String allergies;
    private String comments;
    private String isAssigned = "No";
    private Enterprise preferredDoctorEnterprise;
    private Enterprise referredDoctorEnterprise;
    
    private static int count = 0;
    
    public Patient(){
        mrNo = count;
        count++;
        this.registrationDate = new Date();
        
    }

    public int getMrNo() {
        return mrNo;
    }

    public void setMrNo(int mrNo) {
        this.mrNo = mrNo;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public Doctor getPreferredDoctor() {
        return preferredDoctor;
    }

    public void setPreferredDoctor(Doctor preferredDoctor) {
        this.preferredDoctor = preferredDoctor;
    }

   

    public String getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(String isInsurance) {
        this.isInsurance = isInsurance;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(String isAssigned) {
        this.isAssigned = isAssigned;
    }

    public Doctor getReferredDoctor() {
        return referredDoctor;
    }

    public void setReferredDoctor(Doctor referredDoctor) {
        this.referredDoctor = referredDoctor;
    }

    public Enterprise getPreferredDoctorEnterprise() {
        return preferredDoctorEnterprise;
    }

    public void setPreferredDoctorEnterprise(Enterprise preferredDoctorEnterprise) {
        this.preferredDoctorEnterprise = preferredDoctorEnterprise;
    }

    public Enterprise getReferredDoctorEnterprise() {
        return referredDoctorEnterprise;
    }

    public void setReferredDoctorEnterprise(Enterprise referredDoctorEnterprise) {
        this.referredDoctorEnterprise = referredDoctorEnterprise;
    }

    
    
    @Override
    public String toString(){
    return String.valueOf(super.getSsn());
}
    
}
