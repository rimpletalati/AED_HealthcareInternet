/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.Date;

/**
 *
 * @author Rimple
 */
public class LabAssistant extends Person{
    
    private String licenseNo;
    //private String degreeType;
    //private String experience;
    //private String trainingSchool;
    private Date joiningDate;
    private String maritalStatus;

    public LabAssistant() {
        this.joiningDate = new Date();
    }
    
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

//    public String getDegreeType() {
//        return degreeType;
//    }
//
//    public void setDegreeType(String degreeType) {
//        this.degreeType = degreeType;
//    }
//
//    public String getTrainingSchool() {
//        return trainingSchool;
//    }
//
//    public void setTrainingSchool(String trainingSchool) {
//        this.trainingSchool = trainingSchool;
//    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    
}
