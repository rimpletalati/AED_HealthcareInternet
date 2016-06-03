/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmaciesRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalCompaniesEnterprise;
import Business.Enterprise.PharmaciesEnterprise;
import Business.Network.NetworkCities;
import Business.Network.NetworkCountries;
import Business.Network.NetworkStates;
import Business.PharmaceuticalCompany.Drugs;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class AddDrugsFromPCCompanyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDrugsFromPCCompany
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private Enterprise enterprise;
    private PharmaciesEnterprise pe;
    private PharmaceuticalCompaniesEnterprise pcee;

    public AddDrugsFromPCCompanyJPanel(JPanel userProcessContainer, Ecosystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateCountryTable();
    }

    private void populateCountryTable() {
        DefaultTableModel model = (DefaultTableModel) manageCompanyJTable.getModel();
        model.setRowCount(0);
        for (NetworkCountries networkCountries : ecosystem.getNetworkListsCountries()) {
            for (NetworkStates networkStates : networkCountries.getNetworkListStates()) {
                for (NetworkCities networkCities : networkStates.getNetworkListCities()) {
                    for (Enterprise enterprise : networkCities.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmaceuticalCompaniesEnterprise) {
                            Object[] row = new Object[2];
                            row[0] = enterprise.getOrganizationID();
                            row[1] = enterprise;

                            model.addRow(row);
                        }

                    }

                }

            }
        }
    }

    private void populateDrugs(PharmaceuticalCompaniesEnterprise pce) {
        DefaultTableModel model = (DefaultTableModel) manageDrugsJTable.getModel();
        model.setRowCount(0);
        for (Drugs drugs : pce.getDrugsList()) {
            if (drugs.getIsApproved().equals(Drugs.Approved_Status)) {
                Object[] row = new Object[5];
                row[0] = drugs;
                row[1] = drugs.getDrugName();
                row[2] = drugs.getStrength();
                row[3] = drugs.getSpecifiations();
                row[4] = drugs.getPrice();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        manageCompanyJTable = new javax.swing.JTable();
        selectCompanyJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        manageDrugsJTable = new javax.swing.JTable();
        adddrugsJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Add Drugs");

        manageCompanyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Company ID", "Pharmaceutical Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageCompanyJTable);
        if (manageCompanyJTable.getColumnModel().getColumnCount() > 0) {
            manageCompanyJTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        selectCompanyJButton.setText("Select Company");
        selectCompanyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCompanyJButtonActionPerformed(evt);
            }
        });

        manageDrugsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug ID", "Drug Name", "Strength", "Specifications", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(manageDrugsJTable);

        adddrugsJButton.setText("Add Drugs");
        adddrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddrugsJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(selectCompanyJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(backJButton)
                        .addGap(150, 150, 150)
                        .addComponent(adddrugsJButton)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(selectCompanyJButton)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(adddrugsJButton))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void selectCompanyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCompanyJButtonActionPerformed
        int selectedRow = manageCompanyJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }
        PharmaceuticalCompaniesEnterprise pce = (PharmaceuticalCompaniesEnterprise) manageCompanyJTable.getValueAt(selectedRow, 1);
        populateDrugs(pce);
        pcee = pce;
    }//GEN-LAST:event_selectCompanyJButtonActionPerformed

    private void adddrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddrugsJButtonActionPerformed

        int selectedRow = manageDrugsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }
        Drugs drugs = (Drugs) manageDrugsJTable.getValueAt(selectedRow, 0);
        if (enterprise instanceof PharmaciesEnterprise) {
            pe = (PharmaciesEnterprise) enterprise;

            for (Drugs dr : pe.getDrugsList()) {
                if (dr.getDrugID() == drugs.getDrugID()) {
                    JOptionPane.showMessageDialog(null, "This drug has already been added");
                    return;
                }
            }

        }

//        if (enterprise instanceof PharmaciesEnterprise) {
//            pe = (PharmaciesEnterprise) enterprise;
//        }
        pe.getDrugsList().add(drugs);

        for (PharmaciesEnterprise pent : pcee.getPharmaciesEnterpriseList()) {
            if (pent.getOrganizationID() == pe.getOrganizationID()) {

                return;
            }

        }

        pcee.getPharmaciesEnterpriseList().add(pe);
    }//GEN-LAST:event_adddrugsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddrugsJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manageCompanyJTable;
    private javax.swing.JTable manageDrugsJTable;
    private javax.swing.JButton selectCompanyJButton;
    // End of variables declaration//GEN-END:variables
}