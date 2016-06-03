/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaciesEnterprise;
import Business.Network.NetworkCities;
import Business.Network.NetworkCountries;
import Business.Network.NetworkStates;
import Business.Person.Doctor;
import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.PharmacyWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class PrescribesDrugsToPateintsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescribesDrugsToPateintsJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private Doctor doctor;
    private Encounter encounter;
    private PharmacyWorkRequest pharmacyWorkRequest;
    private PharmaciesEnterprise pharmaciesEnterprise;
    private String pharmacyName;
    
    public PrescribesDrugsToPateintsJPanel(JPanel userProcessContainer, Doctor doctor, Ecosystem ecosystem, Encounter encounter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctor = doctor;
        this.ecosystem = ecosystem;
        this.encounter = encounter;
        populateCountryComboBox();
    }

    public void populateCountryComboBox() {
        countryJComboBox1.removeAllItems();

        for (NetworkCountries nc : ecosystem.getNetworkListsCountries()) {
            countryJComboBox1.addItem(nc);
        }
    }

    public void populateStateComboBox(NetworkCountries networkCountries) {
        stateNameJComboBox1.removeAllItems();
        for (NetworkStates ns : networkCountries.getNetworkListStates()) {
            stateNameJComboBox1.addItem(ns);
        }
    }

    public void populateCityComboBox(NetworkStates networkStates) {
        cityJComboBox1.removeAllItems();
        for (NetworkCities nc : networkStates.getNetworkListCities()) {
            cityJComboBox1.addItem(nc);
        }
    }

    public void populatePharmacies(NetworkCities networkCities) {
        pharmaciesJComboBox.removeAllItems();
        for (Enterprise e : networkCities.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof PharmaciesEnterprise) {
                PharmaciesEnterprise pe = (PharmaciesEnterprise) e;
                pharmaciesJComboBox.addItem(pe);
            }
        }
    }

    public void populateDrugs(PharmaciesEnterprise pe) {
        suggestedDrugsJComboBox.removeAllItems();
        for (Drugs drugs : pe.getDrugsList()) {
            if (drugs.getIsApproved() == null ? Drugs.Approved_Status == null : drugs.getIsApproved().equals(Drugs.Approved_Status)) {
                suggestedDrugsJComboBox.addItem(drugs);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingJLabel = new javax.swing.JLabel();
        countryJComboBox1 = new javax.swing.JComboBox();
        stateNameJLabel = new javax.swing.JLabel();
        stateNameJComboBox1 = new javax.swing.JComboBox();
        cityJLabel = new javax.swing.JLabel();
        cityJComboBox1 = new javax.swing.JComboBox();
        countryJLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pharmaciesJComboBox = new javax.swing.JComboBox();
        suggestedDrugsJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        suggestedDrugsJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        medicationJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        drugNameJLabel = new javax.swing.JLabel();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Prescription");

        countryJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryJComboBox1ActionPerformed(evt);
            }
        });

        stateNameJLabel.setText("State:");

        stateNameJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateNameJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateNameJComboBox1ActionPerformed(evt);
            }
        });

        cityJLabel.setText("City:");

        cityJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBox1ActionPerformed(evt);
            }
        });

        countryJLabel1.setText("Country:");

        jLabel1.setText("Pharmacies:");

        pharmaciesJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmaciesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaciesJComboBoxActionPerformed(evt);
            }
        });

        suggestedDrugsJLabel.setText("Suggested Drugs:");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        suggestedDrugsJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        suggestedDrugsJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestedDrugsJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Medication:");

        jLabel13.setText("Drug Name:");

        drugNameJLabel.setText("jLabel14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stateNameJLabel)
                                    .addComponent(countryJLabel1)
                                    .addComponent(cityJLabel)
                                    .addComponent(jLabel1))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(suggestedDrugsJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(countryJComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stateNameJComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityJComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pharmaciesJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suggestedDrugsJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(drugNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(headingJLabel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryJLabel1)
                    .addComponent(countryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateNameJLabel)
                    .addComponent(stateNameJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJLabel)
                    .addComponent(cityJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pharmaciesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suggestedDrugsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(drugNameJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(suggestedDrugsJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(submitJButton)
                .addGap(37, 37, 37)
                .addComponent(backJButton)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryJComboBox1ActionPerformed

        NetworkCountries nc = (NetworkCountries) countryJComboBox1.getSelectedItem();
        if (nc != null) {
            populateStateComboBox(nc);
        }
    }//GEN-LAST:event_countryJComboBox1ActionPerformed

    private void stateNameJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateNameJComboBox1ActionPerformed

        NetworkStates ns = (NetworkStates) stateNameJComboBox1.getSelectedItem();
        if (ns != null) {
            populateCityComboBox(ns);
        }
    }//GEN-LAST:event_stateNameJComboBox1ActionPerformed

    private void cityJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBox1ActionPerformed

        NetworkCities nc = (NetworkCities) cityJComboBox1.getSelectedItem();
        if (nc != null) {
            populatePharmacies(nc);
        }
    }//GEN-LAST:event_cityJComboBox1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String medication = medicationJTextField.getText().trim();
        if ("".equals(medication)) {
            JOptionPane.showMessageDialog(null, "Please do not keep medication empty.");
            return;
        }
        Drugs d = (Drugs) suggestedDrugsJComboBox.getSelectedItem();
        encounter.getDrugs().add(d);

        pharmacyWorkRequest = new PharmacyWorkRequest();
        pharmacyWorkRequest.setPatient(encounter.getPatient());
        pharmacyWorkRequest.setSender(encounter.getDoctor());
        pharmacyWorkRequest.setMessage(medication);
        pharmacyWorkRequest.setEnterprise(encounter.getLabTestWorkResquest().getSenderEnterprise());
        pharmacyWorkRequest.setStatus("Sent list to Pharmacy.");
        pharmacyWorkRequest.setPharmicistName(pharmacyName);
        pharmacyWorkRequest.setDrugs(d);

        encounter.getDoctor().getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);
        encounter.getPatient().getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);
        pharmaciesEnterprise.getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void pharmaciesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaciesJComboBoxActionPerformed
        PharmaciesEnterprise pe = (PharmaciesEnterprise) pharmaciesJComboBox.getSelectedItem();
        if (pe != null) {
            pharmaciesEnterprise = pe;
            pharmacyName = pe.getName();
            populateDrugs(pe);
        }
    }//GEN-LAST:event_pharmaciesJComboBoxActionPerformed

    private void suggestedDrugsJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestedDrugsJComboBoxActionPerformed
        
        Drugs dlist = (Drugs) suggestedDrugsJComboBox.getSelectedItem();
        if (dlist != null) {
            drugNameJLabel.setText(dlist.getDrugName());
        }
    }//GEN-LAST:event_suggestedDrugsJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cityJComboBox1;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JComboBox countryJComboBox1;
    private javax.swing.JLabel countryJLabel1;
    private javax.swing.JLabel drugNameJLabel;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField medicationJTextField;
    private javax.swing.JComboBox pharmaciesJComboBox;
    private javax.swing.JComboBox stateNameJComboBox1;
    private javax.swing.JLabel stateNameJLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JComboBox suggestedDrugsJComboBox;
    private javax.swing.JLabel suggestedDrugsJLabel;
    // End of variables declaration//GEN-END:variables
}
