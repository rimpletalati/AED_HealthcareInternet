/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmaceuticalCompany;

import Business.Enterprise.PharmaceuticalCompaniesEnterprise;

/**
 *
 * @author Rimple
 */
public class Drugs {
    private int drugID;
    private String drugName;
    private PharmaceuticalCompaniesEnterprise manufacturingCo;
    private float strength;
    private String specifiations;
    private float price;
    private String isApproved = "Yet to take decision";
    public static final String Approved_Status = "Approved";
    public static final String Not_Approved_Status = "Not Approved";
    private MedicationGuidelines medicationGuidelines;
    private static int count = 1;
    
    public Drugs(){
        drugID = count;
        count++;
        medicationGuidelines = new MedicationGuidelines();
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }
    

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public PharmaceuticalCompaniesEnterprise getManufacturingCo() {
        return manufacturingCo;
    }

    public void setManufacturingCo(PharmaceuticalCompaniesEnterprise manufacturingCo) {
        this.manufacturingCo = manufacturingCo;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public String getSpecifiations() {
        return specifiations;
    }

    public void setSpecifiations(String specifiations) {
        this.specifiations = specifiations;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public MedicationGuidelines getMedicationGuidelines() {
        return medicationGuidelines;
    }

    public void setMedicationGuidelines(MedicationGuidelines medicationGuidelines) {
        this.medicationGuidelines = medicationGuidelines;
    }   
    
    @Override
    public String toString(){
        return String.valueOf(drugID);
    }
    
    
}
