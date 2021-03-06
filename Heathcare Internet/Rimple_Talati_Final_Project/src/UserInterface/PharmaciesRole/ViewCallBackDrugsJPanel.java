/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmaciesRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaciesEnterprise;
import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.CallBackDrugWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ViewCallBackDrugsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCallBackDrugsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ViewCallBackDrugsJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
    }
    

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) manageDrugsJTable.getModel();
        model.setRowCount(0);
        if (enterprise instanceof PharmaciesEnterprise) {
            PharmaciesEnterprise pe = (PharmaciesEnterprise) enterprise;
            for (WorkRequest wr : pe.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof CallBackDrugWorkRequest) {
                    CallBackDrugWorkRequest request = (CallBackDrugWorkRequest) wr;
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = request.getDrug().getDrugID();
                    row[2] = request.getDrug().getDrugName();
                    row[3] = request.getEnterprise().getName();

                    model.addRow(row);
                }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        manageDrugsJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        processRequestJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("View Call Back Drugs Request");

        manageDrugsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Drug ID", "Drug Name", "Pharmaceutical Co. Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageDrugsJTable);
        if (manageDrugsJTable.getColumnModel().getColumnCount() > 0) {
            manageDrugsJTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        processRequestJButton.setText("Process Request");
        processRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(processRequestJButton)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processRequestJButton)
                .addGap(50, 50, 50)
                .addComponent(backJButton)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void processRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestJButtonActionPerformed

        int selectedRow = manageDrugsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        CallBackDrugWorkRequest cbd = (CallBackDrugWorkRequest) manageDrugsJTable.getValueAt(selectedRow, 0);
        PharmaciesEnterprise pe = (PharmaciesEnterprise) enterprise;
        boolean flag = true;
        for (Drugs d : pe.getDrugsList()) {
            if (d.getDrugID() != cbd.getDrug().getDrugID()) {
                pe.getDrugsList().remove(cbd.getDrug());
                flag = false;
                JOptionPane.showMessageDialog(null, "This drug is removed");
                break;
            }
        }
        if(flag == true){
        JOptionPane.showMessageDialog(null, "This drug has already removed");
        }

    }//GEN-LAST:event_processRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageDrugsJTable;
    private javax.swing.JButton processRequestJButton;
    // End of variables declaration//GEN-END:variables
}
