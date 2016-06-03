/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Pharmacy.PharmacyStore;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ManagePharmacyStoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyStoreJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PharmacyOrganization organization;

    public ManagePharmacyStoreJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof PharmacyOrganization) {
                PharmacyOrganization po = (PharmacyOrganization) org;
                organization = po;
            }
        }
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) manageStoresJTable.getModel();
        model.setRowCount(0);
        for (PharmacyStore ps : organization.getPharmacyStoreList()) {

            Object[] row = new Object[6];
            row[0] = ps;
            row[1] = ps.getStoreName();
            row[2] = ps.getAddress();
            row[3] = ps.getCity();
            row[4] = ps.getState();
            row[5] = ps.getCountry();
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        manageStoresJTable = new javax.swing.JTable();
        headingJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addPharmacyStoreJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        manageStoresJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Store ID", "Store Name", "Address", "City", "State", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageStoresJTable);
        if (manageStoresJTable.getColumnModel().getColumnCount() > 0) {
            manageStoresJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Pharmacy Store");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addPharmacyStoreJButton.setText("Add Stores");
        addPharmacyStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyStoreJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(backJButton)
                        .addGap(53, 53, 53)
                        .addComponent(addPharmacyStoreJButton)
                        .addGap(57, 57, 57)
                        .addComponent(refreshJButton)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addPharmacyStoreJButton)
                    .addComponent(refreshJButton))
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addPharmacyStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyStoreJButtonActionPerformed
        AddPharmacyStoreJPanel addPharmacyStoreJPanel = new AddPharmacyStoreJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("addPharmacyStoreJPanel", addPharmacyStoreJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPharmacyStoreJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPharmacyStoreJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageStoresJTable;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}