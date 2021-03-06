/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorldFDARole;

import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.PharmaceuticalCompanyWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorldFDA;
import UserInterface.PharmaceuticalCompanyEmployeeRole.ViewGuidelinesPag1JPanel;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ManageDrugsToApproveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugsToApproveJPanel
     */
    private JPanel userProcessContainer;
    private WorldFDA worldFDA;
    private PharmaceuticalCompanyWorkRequest pcwr;

    public ManageDrugsToApproveJPanel(JPanel userProcessContainer, WorldFDA worldFDA) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.worldFDA = worldFDA;
        approvedJRadioButton.setVisible(false);
        decilnedjRadioButton.setVisible(false);
        submitJButton.setVisible(false);
        poptable();
    }

    private void poptable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : worldFDA.getWorkQueue().getWorkRequestList()) {
            pcwr = (PharmaceuticalCompanyWorkRequest) wr;
            Object[] row = new Object[7];
            row[0] = wr;
            row[1] = pcwr.getSetSender();
            row[2] = pcwr.getDrug();
            row[3] = pcwr.getDrug().getDrugName();
            row[4] = pcwr.getDrug().getIsApproved();
            row[5] = pcwr.getRequestDate();
            row[6] = pcwr.getResolveDate() == null ? "--" : pcwr.getResolveDate();
            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        headingJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        approvedJRadioButton = new javax.swing.JRadioButton();
        decilnedjRadioButton = new javax.swing.JRadioButton();
        submitJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        viewDrugsJButton = new javax.swing.JButton();
        viewGuidelinesJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Drugs to Approve/Disapprove");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Pharmaceutical Company", "Drug ID", "Drug Name", "Is Approved?", "Request Date", "Resolve Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            workRequestJTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            workRequestJTable.getColumnModel().getColumn(4).setPreferredWidth(130);
            workRequestJTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            workRequestJTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process >>");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(approvedJRadioButton);
        approvedJRadioButton.setSelected(true);
        approvedJRadioButton.setText("Approved");

        buttonGroup1.add(decilnedjRadioButton);
        decilnedjRadioButton.setText("Declined");

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        viewDrugsJButton.setText("View Drugs");
        viewDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugsJButtonActionPerformed(evt);
            }
        });

        viewGuidelinesJButton.setText("View Drug Guidelines");
        viewGuidelinesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGuidelinesJButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(submitJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backJButton)
                                        .addGap(122, 122, 122)
                                        .addComponent(processJButton)
                                        .addGap(59, 59, 59))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(approvedJRadioButton)
                                        .addGap(51, 51, 51)
                                        .addComponent(decilnedjRadioButton)))
                                .addGap(23, 23, 23)
                                .addComponent(viewDrugsJButton)
                                .addGap(63, 63, 63)
                                .addComponent(viewGuidelinesJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(headingJLabel)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewDrugsJButton)
                            .addComponent(processJButton)
                            .addComponent(viewGuidelinesJButton))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approvedJRadioButton)
                    .addComponent(decilnedjRadioButton))
                .addGap(18, 18, 18)
                .addComponent(submitJButton)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

            approvedJRadioButton.setVisible(true);
            decilnedjRadioButton.setVisible(true);
            submitJButton.setVisible(true);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }
        PharmaceuticalCompanyWorkRequest request = (PharmaceuticalCompanyWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setResolveDate(new Date());
        if (approvedJRadioButton.isSelected()) {
            request.getDrug().setIsApproved(Drugs.Approved_Status);
        }
        if (decilnedjRadioButton.isSelected()) {
            request.getDrug().setIsApproved(Drugs.Not_Approved_Status);
        }
        approvedJRadioButton.setVisible(false);
        decilnedjRadioButton.setVisible(false);
        submitJButton.setVisible(false);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        poptable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void viewDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugsJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Drugs drugs = (Drugs) workRequestJTable.getValueAt(selectedRow, 2);

        ViewDrugsJPanel viewDrugsJPanel = new ViewDrugsJPanel(userProcessContainer, drugs);
        userProcessContainer.add("viewDrugsJPanel", viewDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugsJButtonActionPerformed

    private void viewGuidelinesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGuidelinesJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Drugs d = (Drugs) workRequestJTable.getValueAt(selectedRow, 2);

        ViewGuidelinesPag1JPanel viewGuidelinesPag1JPanel = new ViewGuidelinesPag1JPanel(userProcessContainer, d);
        userProcessContainer.add("viewGuidelinesPag1JPanel", viewGuidelinesPag1JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewGuidelinesJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approvedJRadioButton;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton decilnedjRadioButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton viewDrugsJButton;
    private javax.swing.JButton viewGuidelinesJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
