/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.EnterpriseAdminWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private Enterprise enterprise;
    private Patient patient;

    public ManagePatientsJPanel(JPanel userProcessContainer, Ecosystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) managePatientJTable.getModel();
        model.setRowCount(0);
        
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof PatientOrganization){
            for(Person p: org.getPersonDirectory().getPersonList()){
                Patient pat = (Patient)p;
                Object[] row = new Object[5];
                row[0] = pat.getMrNo();
                row[1] = pat.getFirstName() + " " + pat.getLastName();
                row[2] = pat.getPreferredDoctor();
                row[3] = pat.getIsAssigned();
                row[4] = pat;

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
        addPatientJButton = new javax.swing.JButton();
        viewPatientJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        managePatientJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignToDoctorJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Patients");

        addPatientJButton.setText("Add Patients");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });

        viewPatientJButton.setText("View Patients");
        viewPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientJButtonActionPerformed(evt);
            }
        });

        managePatientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medical Record Number", "Patient Name", "Preferred Doctor ID", "Assigned Doctor", "SSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managePatientJTable);
        if (managePatientJTable.getColumnModel().getColumnCount() > 0) {
            managePatientJTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignToDoctorJButton.setText("Assign Preferred Doctor");
        assignToDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToDoctorJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(backJButton)
                            .addGap(70, 70, 70)
                            .addComponent(viewPatientJButton)
                            .addGap(40, 40, 40)
                            .addComponent(addPatientJButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(assignToDoctorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(viewPatientJButton)
                    .addComponent(addPatientJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(assignToDoctorJButton))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        AddPatientsJPanel addPatientsJPanel = new AddPatientsJPanel(userProcessContainer, ecosystem, enterprise);
        userProcessContainer.add("addPatientsJPanel", addPatientsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientJButtonActionPerformed

        int selectedRow = managePatientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Patient p = (Patient) managePatientJTable.getValueAt(selectedRow, 4);
        ViewPatientsJPanel viewPatientsJPanel = new ViewPatientsJPanel(userProcessContainer, p);
        userProcessContainer.add("viewPatientsJPanel", viewPatientsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignToDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToDoctorJButtonActionPerformed
        int selectedRow = managePatientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Patient p = (Patient) managePatientJTable.getValueAt(selectedRow, 4);
        Doctor doctor = p.getPreferredDoctor();
        doctor.getPatientList().add(p);

        p.setPreferredDoctorEnterprise(enterprise);
        if ("Yes".equals(p.getIsAssigned())) {

            JOptionPane.showMessageDialog(null, "This patient is already assigned.");
            return;
        }

        p.setIsAssigned("Yes");
        EnterpriseAdminWorkRequest eawr = new EnterpriseAdminWorkRequest();
        eawr.setMessage("Dr. " + doctor + " is assigned to " + p);
        eawr.setSenderEnterprise(enterprise);
        eawr.setDoctor(doctor);
        eawr.setPatient(p);
        eawr.setStatus("Completed by admin");
        doctor.getWorkQueue().getWorkRequestList().add(eawr);
        p.getWorkQueue().getWorkRequestList().add(eawr);

    }//GEN-LAST:event_assignToDoctorJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton assignToDoctorJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managePatientJTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewPatientJButton;
    // End of variables declaration//GEN-END:variables
}