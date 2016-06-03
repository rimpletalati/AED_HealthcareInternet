/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmaceuticalCompanyEmployeeRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalCompaniesEnterprise;
import Business.Organization.Organization;
import Business.Organization.PCCompany;
import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.PharmaceuticalCompanyWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class PCWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PCWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Ecosystem ecosystem;
    private PharmaceuticalCompaniesEnterprise pce;

    public PCWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        populateTable();
        messageJLabel.setVisible(false);
        messageJTextField.setVisible(false);
        sendJButton.setVisible(false);

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) manageDrugsJTable.getModel();
        model.setRowCount(0);
        if (enterprise instanceof PharmaceuticalCompaniesEnterprise) {
            pce = (PharmaceuticalCompaniesEnterprise) enterprise;
            for (Drugs d : pce.getDrugsList()) {

                Object[] row = new Object[6];
                row[0] = d;
                row[1] = d.getDrugName();
                row[2] = d.getSpecifiations();
                row[3] = d.getStrength();
                row[4] = d.getPrice();
                row[5] = d.getIsApproved();
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

        headingJLabel = new javax.swing.JLabel();
        addDrugsJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageDrugsJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processApprovalRequestJButton = new javax.swing.JButton();
        messageJLabel = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        sendJButton = new javax.swing.JButton();
        viewRequestsJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Drugs");

        addDrugsJButton.setText("Add Drugs");
        addDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugsJButtonActionPerformed(evt);
            }
        });

        manageDrugsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Drug ID", "Drug Name", "Specifications", "Strength", "Price", "Is Approved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageDrugsJTable);
        if (manageDrugsJTable.getColumnModel().getColumnCount() > 0) {
            manageDrugsJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            manageDrugsJTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processApprovalRequestJButton.setText("Process Request To World FDA");
        processApprovalRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processApprovalRequestJButtonActionPerformed(evt);
            }
        });

        messageJLabel.setText("Message");

        sendJButton.setText("Send");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });

        viewRequestsJButton.setText("View all Requests");
        viewRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshJButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(226, 226, 226)
                                    .addComponent(headingJLabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(182, 182, 182)
                                    .addComponent(messageJLabel)
                                    .addGap(48, 48, 48)
                                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(197, 197, 197))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(addDrugsJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(sendJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(processApprovalRequestJButton)
                        .addGap(129, 129, 129)
                        .addComponent(viewRequestsJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addDrugsJButton)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processApprovalRequestJButton)
                    .addComponent(viewRequestsJButton))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJLabel)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(sendJButton)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugsJButtonActionPerformed

        AddDrugsToPCEmployeeJPanel addDrugsToPCEmployeeJPanel = new AddDrugsToPCEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("addDrugsToPCEmployeeJPanel", addDrugsToPCEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDrugsJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processApprovalRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processApprovalRequestJButtonActionPerformed

        int selectedRow = manageDrugsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Drugs d = (Drugs) manageDrugsJTable.getValueAt(selectedRow, 0);
//        if (d.getIsApproved().equals(Drugs.Approved_Status)
//                || d.getIsApproved().equals(Drugs.Not_Approved_Status)) {
            messageJLabel.setVisible(true);
            messageJTextField.setVisible(true);
            sendJButton.setVisible(true);
//        }
    }//GEN-LAST:event_processApprovalRequestJButtonActionPerformed

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed

        int selectedRow = manageDrugsJTable.getSelectedRow();
        Drugs drugs = (Drugs) manageDrugsJTable.getValueAt(selectedRow, 0);

        PharmaceuticalCompanyWorkRequest pcwr = new PharmaceuticalCompanyWorkRequest();
        if ("".equals(messageJTextField.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Please write a message.");
            return;
        }
        pcwr.setMessage(messageJTextField.getText());

        pcwr.setSetSender(enterprise.getName());
        pcwr.setEnterpriseID(enterprise.getOrganizationID());
        pcwr.setDrug(drugs);

        ecosystem.getWorldFDA().getWorkQueue().getWorkRequestList().add(pcwr);
        enterprise.getWorkQueue().getWorkRequestList().add(pcwr);

        messageJLabel.setVisible(false);
        messageJTextField.setVisible(false);
        sendJButton.setVisible(false);
        JOptionPane.showMessageDialog(null, "Message has been sent to World FDA.");
        messageJTextField.setText("");
    }//GEN-LAST:event_sendJButtonActionPerformed

    private void viewRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsJButtonActionPerformed
        // TODO add your handling code here:

        ViewPCRequestsJPanel viewPCRequestsJPanel = new ViewPCRequestsJPanel(userProcessContainer, enterprise);

        userProcessContainer.add("viewPCRequestsJPanel", viewPCRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewRequestsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugsJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageDrugsJTable;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton processApprovalRequestJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendJButton;
    private javax.swing.JButton viewRequestsJButton;
    // End of variables declaration//GEN-END:variables
}
