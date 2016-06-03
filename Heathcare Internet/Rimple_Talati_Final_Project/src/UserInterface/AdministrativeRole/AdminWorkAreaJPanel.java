/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmaceuticalCompaniesEnterprise;
import Business.Enterprise.PharmaciesEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.DrugOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.PharmacyOrganization;
import Business.WorkQueue.EnquireEmergencyWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.PharmaceuticalCompanyEmployeeRole.CallBackDrugsJPanel;
import UserInterface.PharmaceuticalCompanyEmployeeRole.SendNotificationJPanel;
import UserInterface.PharmaceuticalCompanyEmployeeRole.ViewFeedbacksJPanel;
import UserInterface.PharmaceuticalCompanyEmployeeRole.ViewMyPharmaciesJPanel;
import UserInterface.PharmaceuticalCompanyEmployeeRole.ViewNotficationToNetworksJPanel;
import UserInterface.PharmaciesRole.ManageDrugsToPharmaciesJPanel;
import UserInterface.PharmaciesRole.ManagePharmaciesWorkRequestJPanel;
import UserInterface.PharmaciesRole.ViewCallBackDrugsJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Ecosystem ecosystem;
    private ArrayList<Encounter> encounterList;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        managePatientsJButton.setVisible(false);
        manageStaffJButton.setVisible(false);
        manageDrugsJButton.setVisible(false);
        managePharmacyStoresJButton.setVisible(false);
        viewMyPharmaciesJButton.setVisible(false);
        manageWorkRequestsJButton.setVisible(false);
        addEmergencyJButton.setVisible(false);
        sendNotficationJButton.setVisible(false);
        emeregencyJPanel.setVisible(false);
        viewNotifcationJButton.setVisible(false);
        callBackDrugsJButton.setVisible(false);
        viewCallBackRequestJButton.setVisible(false);
        viewFeedbacksJButton.setVisible(false);
        if (enterprise instanceof HospitalEnterprise) {
            managePatientsJButton.setVisible(true);
            manageStaffJButton.setVisible(true);
            addEmergencyJButton.setVisible(true);
            emeregencyJPanel.setVisible(true);
            populateTable();
        }
        
        if (enterprise instanceof ClinicEnterprise) {
            managePatientsJButton.setVisible(true);
            manageStaffJButton.setVisible(true);
            //addEmergencyJButton.setVisible(true);
            emeregencyJPanel.setVisible(true);
            populateTable();
        }
        if (enterprise instanceof PharmaciesEnterprise) {
            manageDrugsJButton.setVisible(true);
            managePharmacyStoresJButton.setVisible(true);
            manageWorkRequestsJButton.setVisible(true);
            viewNotifcationJButton.setVisible(true);
            viewCallBackRequestJButton.setVisible(true);
        }
        if (enterprise instanceof PharmaceuticalCompaniesEnterprise) {
            manageStaffJButton.setVisible(true);
            viewMyPharmaciesJButton.setVisible(true);
            sendNotficationJButton.setVisible(true);
            callBackDrugsJButton.setVisible(true);
            viewFeedbacksJButton.setVisible(true);
        }

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) manageTableJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof EnquireEmergencyWorkRequest) {
                EnquireEmergencyWorkRequest eewr =(EnquireEmergencyWorkRequest) wr;

                Object[] row = new Object[4];
                row[0] = eewr;
                row[1] = eewr.getMrNo();
                row[2] = eewr.getDoctor().getFirstName() + " " + eewr.getDoctor().getLastName();
                row[3] = eewr.getEnterprise();
                
                model.addRow(row);

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

        manageOrganizationJButton = new javax.swing.JButton();
        headingJLabel = new javax.swing.JLabel();
        manageStaffJButton = new javax.swing.JButton();
        managePatientsJButton = new javax.swing.JButton();
        managePharmacyStoresJButton = new javax.swing.JButton();
        manageDrugsJButton = new javax.swing.JButton();
        viewMyPharmaciesJButton = new javax.swing.JButton();
        manageWorkRequestsJButton = new javax.swing.JButton();
        emeregencyJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageTableJTable = new javax.swing.JTable();
        sendPatientDetailsJButton = new javax.swing.JButton();
        sendNotficationJButton = new javax.swing.JButton();
        viewNotifcationJButton = new javax.swing.JButton();
        callBackDrugsJButton = new javax.swing.JButton();
        viewCallBackRequestJButton = new javax.swing.JButton();
        viewFeedbacksJButton = new javax.swing.JButton();
        addEmergencyJButton = new javax.swing.JButton();

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("My work area - Admin Role");

        manageStaffJButton.setText("Manage Staff");
        manageStaffJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStaffJButtonActionPerformed(evt);
            }
        });

        managePatientsJButton.setText("Manage Patients");
        managePatientsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsJButtonActionPerformed(evt);
            }
        });

        managePharmacyStoresJButton.setText("Manage Pharmacy Stores");
        managePharmacyStoresJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyStoresJButtonActionPerformed(evt);
            }
        });

        manageDrugsJButton.setText("Manage Drugs");
        manageDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugsJButtonActionPerformed(evt);
            }
        });

        viewMyPharmaciesJButton.setText("View My Pharmacies");
        viewMyPharmaciesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMyPharmaciesJButtonActionPerformed(evt);
            }
        });

        manageWorkRequestsJButton.setText("Manage Work Requests");
        manageWorkRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkRequestsJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Emergency Requests:");

        manageTableJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "MR No.", "Doctor Name", "Hospital/Clinic"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageTableJTable);

        sendPatientDetailsJButton.setText("Send Patient Details");
        sendPatientDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPatientDetailsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emeregencyJPanelLayout = new javax.swing.GroupLayout(emeregencyJPanel);
        emeregencyJPanel.setLayout(emeregencyJPanelLayout);
        emeregencyJPanelLayout.setHorizontalGroup(
            emeregencyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emeregencyJPanelLayout.createSequentialGroup()
                .addGroup(emeregencyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emeregencyJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emeregencyJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(emeregencyJPanelLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(sendPatientDetailsJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emeregencyJPanelLayout.setVerticalGroup(
            emeregencyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emeregencyJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendPatientDetailsJButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        sendNotficationJButton.setText("Send Notification");
        sendNotficationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotficationJButtonActionPerformed(evt);
            }
        });

        viewNotifcationJButton.setText("View Notification from Pharmaceutical Company");
        viewNotifcationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNotifcationJButtonActionPerformed(evt);
            }
        });

        callBackDrugsJButton.setText("Call Back Drugs");
        callBackDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callBackDrugsJButtonActionPerformed(evt);
            }
        });

        viewCallBackRequestJButton.setText("View Call Back Request");
        viewCallBackRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCallBackRequestJButtonActionPerformed(evt);
            }
        });

        viewFeedbacksJButton.setText("View Feedbacks");
        viewFeedbacksJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFeedbacksJButtonActionPerformed(evt);
            }
        });

        addEmergencyJButton.setText("Add Emeregency Situation");
        addEmergencyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmergencyJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manageOrganizationJButton)
                                    .addComponent(viewMyPharmaciesJButton))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sendNotficationJButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(callBackDrugsJButton)
                                        .addGap(34, 34, 34)
                                        .addComponent(viewFeedbacksJButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(manageStaffJButton)
                                        .addGap(35, 35, 35)
                                        .addComponent(managePatientsJButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(managePharmacyStoresJButton)
                                .addGap(27, 27, 27)
                                .addComponent(manageDrugsJButton)
                                .addGap(18, 18, 18)
                                .addComponent(manageWorkRequestsJButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewNotifcationJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewCallBackRequestJButton))
                            .addComponent(addEmergencyJButton)
                            .addComponent(emeregencyJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(headingJLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageOrganizationJButton)
                    .addComponent(manageStaffJButton)
                    .addComponent(managePatientsJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewMyPharmaciesJButton)
                    .addComponent(sendNotficationJButton)
                    .addComponent(callBackDrugsJButton)
                    .addComponent(viewFeedbacksJButton))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageDrugsJButton)
                    .addComponent(managePharmacyStoresJButton)
                    .addComponent(manageWorkRequestsJButton)
                    .addComponent(viewNotifcationJButton)
                    .addComponent(viewCallBackRequestJButton))
                .addGap(24, 24, 24)
                .addComponent(addEmergencyJButton)
                .addGap(18, 18, 18)
                .addComponent(emeregencyJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrgJPanel manageOrgJPanel = new ManageOrgJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrgJPanel", manageOrgJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageStaffJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStaffJButtonActionPerformed

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DrugOrganization || o instanceof NurseOrganization || o instanceof LabOrganization
                    || o instanceof DoctorOrganization) {
                ManageStaffJPanel manageStaffJPanel = new ManageStaffJPanel(userProcessContainer, ecosystem, enterprise);
                userProcessContainer.add("manageStaffJPanel", manageStaffJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Organization has not been added yet.");

    }//GEN-LAST:event_manageStaffJButtonActionPerformed

    private void managePatientsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsJButtonActionPerformed

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PatientOrganization) {
                ManagePatientsJPanel managePatientsJPanel = new ManagePatientsJPanel(userProcessContainer, ecosystem, enterprise);
                userProcessContainer.add("managePatientsJPanel", managePatientsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                return;
            }

        }
        JOptionPane.showMessageDialog(null, "Patient Organization has not been added yet.");
    }//GEN-LAST:event_managePatientsJButtonActionPerformed

    private void managePharmacyStoresJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyStoresJButtonActionPerformed

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PharmacyOrganization) {
                ManagePharmacyStoreJPanel managePharmacyStoreJPanel = new ManagePharmacyStoreJPanel(userProcessContainer, enterprise);
                userProcessContainer.add("managePharmacyStoreJPanel", managePharmacyStoreJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                return;
            }

        }
        JOptionPane.showMessageDialog(null, "Pharmacy Store organization is not added yet!");
    }//GEN-LAST:event_managePharmacyStoresJButtonActionPerformed

    private void manageDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugsJButtonActionPerformed
        ManageDrugsToPharmaciesJPanel manageDrugsJPanel = new ManageDrugsToPharmaciesJPanel(userProcessContainer, ecosystem, enterprise);
        userProcessContainer.add("manageDrugsJPanel", manageDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        return;
    }//GEN-LAST:event_manageDrugsJButtonActionPerformed

    private void viewMyPharmaciesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyPharmaciesJButtonActionPerformed

        ViewMyPharmaciesJPanel viewMyPharmaciesJPanel = new ViewMyPharmaciesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("viewMyPharmaciesJPanel", viewMyPharmaciesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        return;
    }//GEN-LAST:event_viewMyPharmaciesJButtonActionPerformed

    private void manageWorkRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkRequestsJButtonActionPerformed

        ManagePharmaciesWorkRequestJPanel managePharmaciesWorkRequestJPanel = new ManagePharmaciesWorkRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("managePharmaciesWorkRequestJPanel", managePharmaciesWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageWorkRequestsJButtonActionPerformed

    private void addEmergencyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmergencyJButtonActionPerformed

        AddEmergencySituationJPanel addEmergencySituationJPanel = new AddEmergencySituationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("addEmergencySituationJPanel", addEmergencySituationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addEmergencyJButtonActionPerformed

    private void sendPatientDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPatientDetailsJButtonActionPerformed
        int selectedRow = manageTableJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) manageTableJTable.getValueAt(selectedRow, 0);
        EnquireEmergencyWorkRequest eewr = (EnquireEmergencyWorkRequest) wr;
        int mrNO = eewr.getMrNo();
        if (enterprise instanceof HospitalEnterprise) {
            HospitalEnterprise he = (HospitalEnterprise) enterprise;
            for (Encounter encounter : he.getEncounterList()) {
                if (encounter.getPatient().getMrNo() == mrNO) {
                    eewr.getEncounterList().add(encounter);
                }
            }
        }
        
        if (enterprise instanceof ClinicEnterprise) {
            ClinicEnterprise ce = (ClinicEnterprise) enterprise;
            for (Encounter encounter : ce.getEncounterList()) {
                if (encounter.getPatient().getMrNo() == mrNO) {
                    eewr.getEncounterList().add(encounter);
                }
            }
        }
        enterprise.getWorkQueue().getWorkRequestList().remove(wr);
        JOptionPane.showMessageDialog(null,"Patient details has been sent");
        populateTable();
    }//GEN-LAST:event_sendPatientDetailsJButtonActionPerformed

    private void sendNotficationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotficationJButtonActionPerformed
        
        SendNotificationJPanel sendNotificationJPanel = new SendNotificationJPanel(userProcessContainer,enterprise, ecosystem);
        userProcessContainer.add("sendNotificationJPanel", sendNotificationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sendNotficationJButtonActionPerformed

    private void viewNotifcationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNotifcationJButtonActionPerformed
        
        ViewNotficationToNetworksJPanel viewNotificationPharmacies = new ViewNotficationToNetworksJPanel(userProcessContainer,enterprise.getWorkQueue());
        userProcessContainer.add("viewNotificationPharmacies", viewNotificationPharmacies);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewNotifcationJButtonActionPerformed

    private void callBackDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callBackDrugsJButtonActionPerformed
        
        CallBackDrugsJPanel callBackDrugsJPanel = new CallBackDrugsJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("callBackDrugsJPanel", callBackDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_callBackDrugsJButtonActionPerformed

    private void viewCallBackRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCallBackRequestJButtonActionPerformed
        
        ViewCallBackDrugsJPanel viewCallBackDrugsJPanel = new ViewCallBackDrugsJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("viewCallBackDrugsJPanel", viewCallBackDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewCallBackRequestJButtonActionPerformed

    private void viewFeedbacksJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFeedbacksJButtonActionPerformed
        
        ViewFeedbacksJPanel viewFeedbacksJPanel = new ViewFeedbacksJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("viewFeedbacksJPanel", viewFeedbacksJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFeedbacksJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmergencyJButton;
    private javax.swing.JButton callBackDrugsJButton;
    private javax.swing.JPanel emeregencyJPanel;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageDrugsJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton managePatientsJButton;
    private javax.swing.JButton managePharmacyStoresJButton;
    private javax.swing.JButton manageStaffJButton;
    private javax.swing.JTable manageTableJTable;
    private javax.swing.JButton manageWorkRequestsJButton;
    private javax.swing.JButton sendNotficationJButton;
    private javax.swing.JButton sendPatientDetailsJButton;
    private javax.swing.JButton viewCallBackRequestJButton;
    private javax.swing.JButton viewFeedbacksJButton;
    private javax.swing.JButton viewMyPharmaciesJButton;
    private javax.swing.JButton viewNotifcationJButton;
    // End of variables declaration//GEN-END:variables
}
