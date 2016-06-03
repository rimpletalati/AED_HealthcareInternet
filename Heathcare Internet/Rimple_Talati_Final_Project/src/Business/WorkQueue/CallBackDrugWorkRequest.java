/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.PharmaceuticalCompany.Drugs;

/**
 *
 * @author Rimple
 */
public class CallBackDrugWorkRequest extends WorkRequest{
    
    private Drugs drug;
    private Enterprise enterprise;

    public Drugs getDrug() {
        return drug;
    }

    public void setDrug(Drugs drug) {
        this.drug = drug;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    
}
