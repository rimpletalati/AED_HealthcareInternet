/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Forum;

import Business.Disease;
import Business.Person.Patient;
import java.util.Date;

/**
 *
 * @author Rimple
 */
public class Stories {
    private int storyID;
    private Disease disease;
    private Patient patient;
    private int age;
    private float height;
    private float weight;
    private String illnessDiscovered;
    private String signs;
    private String testPerformed;
    private String drugsUsed;
    private String resultTreatment;
    private String recoveryTime;
    private String additionalComments;
    private Date submittedDate;
    public static final String regular_checkup = "During regular check-up";
    public static final String not_feel_Well = "Did not feel well";
    public static final String others = "Others";
    private static int count = 1;
    
    public Stories(){
        storyID = count;
        count++;
        submittedDate = new Date();
    }
    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSigns() {
        return signs;
    }

    public void setSigns(String signs) {
        this.signs = signs;
    }

    public String getTestPerformed() {
        return testPerformed;
    }

    public void setTestPerformed(String testPerformed) {
        this.testPerformed = testPerformed;
    }

    public String getDrugsUsed() {
        return drugsUsed;
    }

    public void setDrugsUsed(String drugsUsed) {
        this.drugsUsed = drugsUsed;
    }

    public String getResultTreatment() {
        return resultTreatment;
    }

    public void setResultTreatment(String resultTreatment) {
        this.resultTreatment = resultTreatment;
    }

    public String getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(String recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getIllnessDiscovered() {
        return illnessDiscovered;
    }

    public void setIllnessDiscovered(String illnessDiscovered) {
        this.illnessDiscovered = illnessDiscovered;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }
    
     @Override
    public String toString() {
        return String.valueOf(storyID);
    }
    
}
