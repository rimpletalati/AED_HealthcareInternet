/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rimple
 */
public class Disease {

    private String diseaseName;
    private float icd9Code;
    private String symptoms;
    private String description;

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public float getIcd9Code() {
        return icd9Code;
    }

    public void setIcd9Code(float icd9Code) {
        this.icd9Code = icd9Code;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return diseaseName;
    }
    

}
