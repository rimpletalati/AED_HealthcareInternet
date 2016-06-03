/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.PharmaceuticalCompany.Drugs;

/**
 *
 * @author Rimple
 */
public class PharmaceuticalCompanyWorkRequest extends WorkRequest{
    
    private Drugs drug;
    private String setSender;
    private int enterpriseID;
    

    public Drugs getDrug() {
        return drug;
    }

    public void setDrug(Drugs drug) {
        this.drug = drug;
    }

    public String getSetSender() {
        return setSender;
    }

    public void setSetSender(String setSender) {
        this.setSender = setSender;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
    }
    
     @Override
    public String toString(){
        return super.getMessage();
    }
    
    
}
