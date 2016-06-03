/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Rimple
 */
public class AssignEmergencyWorkRequest extends WorkRequest{
    private int MRNo;
    private String patientName;
    private Enterprise enterprise;

    public int getMRNo() {
        return MRNo;
    }

    public void setMRNo(int MRNo) {
        this.MRNo = MRNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    
}
