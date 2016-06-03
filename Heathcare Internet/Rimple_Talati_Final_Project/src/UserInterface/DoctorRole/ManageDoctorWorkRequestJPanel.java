/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.EnterpriseAdminWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.ReferredDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ManageDoctorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form manageDoctorWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private ArrayList<Encounter> encounterList;
    private ArrayList<Encounter> newEncounterList;
    private Doctor doctor;
    private Ecosystem ecosystem;
    //private Patient patient;
    private Enterprise enterprise;
    private Person person;

    public ManageDoctorWorkRequestJPanel(JPanel userProcessContainer, Doctor doctor, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.doctor = doctor;
        //this.enterprise = enterprise;
        populateEnterprise(doctor);
        //populateCountryComboBox();
        appointmentDetailsJTextField.setVisible(false);
        appointmentDetailsJLabel.setVisible(false);
        doneJButton.setVisible(false);
        submitDetailsJButton.setVisible(false);

    }

    private void populateEnterprise(Doctor doctor) {
        enterpriseJComboBox.removeAllItems();
        for (Enterprise e : doctor.getEnterpriseList()) {
            enterpriseJComboBox.addItem(e);
        }
    }

    private void populatePatients(Enterprise enterprise) {
        DefaultTableModel model = (DefaultTableModel) managePatientsJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : doctor.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof EnterpriseAdminWorkRequest) {
                EnterpriseAdminWorkRequest eawr = (EnterpriseAdminWorkRequest) wr;
                if (eawr.getSenderEnterprise() == enterprise) {
                    Object[] row = new Object[4];
                    row[0] = eawr;
                    row[1] = eawr.getPatient().getMrNo();
                    row[2] = eawr.getPatient().getFirstName() + " " + eawr.getPatient().getLastName();
                    row[3] = eawr.getStatus();

                    model.addRow(row);
                }
            }
            if (wr instanceof PatientWorkRequest) {
                PatientWorkRequest pwr = (PatientWorkRequest) wr;
                if (pwr.getReceiverEnterprise().equals(enterprise)) {
                    Object[] row = new Object[4];
                    row[0] = pwr;
                    row[1] = pwr.getPatient().getMrNo();
                    row[2] = pwr.getPatient().getFirstName() + " " + pwr.getPatient().getLastName();
                    row[3] = pwr.getStatus() == "Sent" ? "Pending" : pwr.getStatus();

                    model.addRow(row);
                }
            }

            if (wr instanceof ReferredDoctorWorkRequest) {
                ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) wr;
                if ((rdwr.getReceiverEnterprise().equals(enterprise)) && (rdwr.getReceiver() == doctor)) {
                    Object[] row = new Object[4];
                    row[0] = rdwr;
                    row[1] = rdwr.getPatient().getMrNo();
                    row[2] = rdwr.getPatient().getFirstName() + " " + rdwr.getPatient().getLastName();
                    row[3] = rdwr.getStatus();//== "Sent" ? "Pending" : rdwr.getStatus();

                    model.addRow(row);
                }
            }

        }
    }

    private ArrayList<Encounter> showEncounterHistory(Patient patient) {
        encounterList = new ArrayList<>();
        if (enterprise instanceof HospitalEnterprise) {
            HospitalEnterprise he = (HospitalEnterprise) enterprise;
            for (Encounter encounter : he.getEncounterList()) {
                if (encounter.getPatient().equals(patient) && encounter.getDoctor().equals(doctor)) {
                    encounterList.add(encounter);
                }
            }
        }
        if (enterprise instanceof ClinicEnterprise) {
            ClinicEnterprise ce = (ClinicEnterprise) enterprise;
            for (Encounter encounter : ce.getEncounterList()) {
                if (encounter.getPatient().equals(patient) && encounter.getDoctor().equals(doctor)) {
                    encounterList.add(encounter);
                }
            }
        }
        return encounterList;
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
        managePatientsJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        addEncounterJButton = new javax.swing.JButton();
        processRequestJButton = new javax.swing.JButton();
        appointmentDetailsJLabel = new javax.swing.JLabel();
        appointmentDetailsJTextField = new javax.swing.JTextField();
        doneJButton = new javax.swing.JButton();
        viewRequestJButton = new javax.swing.JButton();
        submitDetailsJButton = new javax.swing.JButton();
        enterpriseJLabel = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        enterpriseIDJLabel = new javax.swing.JLabel();
        viewEncounterJButton = new javax.swing.JButton();
        referAnotherDoctorJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Work Requests");

        managePatientsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Medical Record Number", "Patient Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managePatientsJTable);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addEncounterJButton.setText("Add Encounter");
        addEncounterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEncounterJButtonActionPerformed(evt);
            }
        });

        processRequestJButton.setText("Process Request");
        processRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestJButtonActionPerformed(evt);
            }
        });

        appointmentDetailsJLabel.setText("Appointement Details:");

        doneJButton.setText("Done");
        doneJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneJButtonActionPerformed(evt);
            }
        });

        viewRequestJButton.setText("View Request");
        viewRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestJButtonActionPerformed(evt);
            }
        });

        submitDetailsJButton.setText("Submit Details");
        submitDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDetailsJButtonActionPerformed(evt);
            }
        });

        enterpriseJLabel.setText("Enterprise:");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise ID:");

        enterpriseIDJLabel.setText("jLabel2");

        viewEncounterJButton.setText("View Encounter");
        viewEncounterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncounterJButtonActionPerformed(evt);
            }
        });

        referAnotherDoctorJButton.setText("Refer another doctor");
        referAnotherDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referAnotherDoctorJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(doneJButton)
                .addGap(27, 27, 27)
                .addComponent(submitDetailsJButton)
                .addGap(378, 378, 378))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(enterpriseJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseIDJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(addEncounterJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewEncounterJButton)
                        .addGap(41, 41, 41)
                        .addComponent(viewRequestJButton)
                        .addGap(32, 32, 32)
                        .addComponent(processRequestJButton)
                        .addGap(35, 35, 35)
                        .addComponent(referAnotherDoctorJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(appointmentDetailsJLabel)
                        .addGap(26, 26, 26)
                        .addComponent(appointmentDetailsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backJButton)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJLabel)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(enterpriseIDJLabel))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEncounterJButton)
                    .addComponent(viewEncounterJButton)
                    .addComponent(viewRequestJButton)
                    .addComponent(processRequestJButton)
                    .addComponent(referAnotherDoctorJButton))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentDetailsJLabel)
                    .addComponent(appointmentDetailsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitDetailsJButton)
                    .addComponent(doneJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void doneJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneJButtonActionPerformed
        appointmentDetailsJTextField.setVisible(false);
        appointmentDetailsJLabel.setVisible(false);
        submitDetailsJButton.setVisible(false);
        doneJButton.setVisible(false);
    }//GEN-LAST:event_doneJButtonActionPerformed

    private void processRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestJButtonActionPerformed
        int selectedRow = managePatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if (wr instanceof EnterpriseAdminWorkRequest || wr instanceof ReferredDoctorWorkRequest) {
            JOptionPane.showMessageDialog(null, "Further details not available.");
            return;
        }
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest pwd = (PatientWorkRequest) wr;
            appointmentDetailsJLabel.setVisible(true);
            appointmentDetailsJTextField.setVisible(true);
            doneJButton.setVisible(false);
            submitDetailsJButton.setVisible(true);
            appointmentDetailsJTextField.setEditable(true);
        }

    }//GEN-LAST:event_processRequestJButtonActionPerformed

    private void viewRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestJButtonActionPerformed

        int selectedRow = managePatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if (wr instanceof EnterpriseAdminWorkRequest || wr instanceof ReferredDoctorWorkRequest) {
            JOptionPane.showMessageDialog(null, "Further details not available.");
            return;
        }
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest pwd = (PatientWorkRequest) wr;
            appointmentDetailsJLabel.setVisible(true);
            appointmentDetailsJTextField.setVisible(true);
            doneJButton.setVisible(true);
            submitDetailsJButton.setVisible(false);
            appointmentDetailsJTextField.setText(pwd.getAppointmentDetails());
            appointmentDetailsJTextField.setEditable(false);
        }
    }//GEN-LAST:event_viewRequestJButtonActionPerformed

    private void submitDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDetailsJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = managePatientsJTable.getSelectedRow();
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if ("".equals(appointmentDetailsJTextField.getText())) {
            JOptionPane.showMessageDialog(null, "Please write appointment details.");
            return;
        }
        PatientWorkRequest pwr = (PatientWorkRequest) wr;
        pwr.setAppointmentDetails(appointmentDetailsJTextField.getText());
        pwr.setStatus("Completed");
        pwr.setResolveDate(new Date());
        appointmentDetailsJTextField.setVisible(false);
        appointmentDetailsJLabel.setVisible(false);
        doneJButton.setVisible(false);
        submitDetailsJButton.setVisible(false);
        JOptionPane.showMessageDialog(null, "Appointment Details has been set");
    }//GEN-LAST:event_submitDetailsJButtonActionPerformed

    private void addEncounterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEncounterJButtonActionPerformed

        int selectedRow = managePatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest pwd = (PatientWorkRequest) wr;
            Patient patient= pwd.getPatient();
            if(patient.getPreferredDoctor()!=doctor && patient.getReferredDoctor()==null)
            {
                JOptionPane.showMessageDialog(null, "You are not allowed to add encounter for this patient now");
                return;
            }
            if (wr.getStatus().equals("Completed")) {
                AddEncounterJPanel addEncounterJPanel = new AddEncounterJPanel(userProcessContainer, wr, doctor, ecosystem);
                userProcessContainer.add("addEncounterJPanel", addEncounterJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Process the request first.");
                return;
            }
        }
        if (wr instanceof EnterpriseAdminWorkRequest) {
            EnterpriseAdminWorkRequest eawd = (EnterpriseAdminWorkRequest) wr;
            Patient patient = eawd.getPatient();
            if (patient.getReferredDoctor() != null) {  
                JOptionPane.showMessageDialog(null, "You can not add encounter");
                return;
            }
            // if (wr.getStatus().equals("Completed by admin")) {
            AddEncounterJPanel addEncounterJPanel = new AddEncounterJPanel(userProcessContainer, wr, doctor, ecosystem);
            userProcessContainer.add("addEncounterJPanel", addEncounterJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
//            } else {
//                JOptionPane.showMessageDialog(null, "Process the request first.");
            // }
        }

        if (wr instanceof ReferredDoctorWorkRequest) {
            ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) wr;
            Patient patient = rdwr.getPatient();
            if (patient.getReferredDoctor() == null) {  
                JOptionPane.showMessageDialog(null, "You can not add encounter");
                return;
            }
            AddEncounterJPanel addEncounterJPanel = new AddEncounterJPanel(userProcessContainer, wr, doctor, ecosystem);
            userProcessContainer.add("addEncounterJPanel", addEncounterJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

//            } else {
//                JOptionPane.showMessageDialog(null, "Process the request first.");
//            }
        }

    }//GEN-LAST:event_addEncounterJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        Enterprise e = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if (e != null) {
            enterpriseIDJLabel.setText(String.valueOf(e.getOrganizationID()));
            populatePatients(e);
            enterprise = e;

        }
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void referAnotherDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referAnotherDoctorJButtonActionPerformed
        int selectedRow = managePatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest pwr = (PatientWorkRequest) wr;
            Patient patient = pwr.getPatient();
            showEncounterHistory(patient);
            encounterList = showEncounterHistory(patient);
            if (patient.getReferredDoctor() != null) {  
                JOptionPane.showMessageDialog(null, "You can not refer doctor again");
                return;
            }
            if (patient.getPreferredDoctor()!= doctor) {  
                JOptionPane.showMessageDialog(null, "You can not refer doctor again");
                return;
            }

            ReferAnotherDoctorJPanel referAnotherDoctorJPanel = new ReferAnotherDoctorJPanel(userProcessContainer, ecosystem, patient, encounterList, doctor, enterprise);
            userProcessContainer.add("referAnotherDoctorJPanel1", referAnotherDoctorJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
        if (wr instanceof EnterpriseAdminWorkRequest) {
            EnterpriseAdminWorkRequest eawr = (EnterpriseAdminWorkRequest) wr;
            Patient patient = eawr.getPatient();
            encounterList = showEncounterHistory(patient);
            if (patient.getReferredDoctor() != null) {
                JOptionPane.showMessageDialog(null, "You can not refer doctor again");
                return;
            }
            ReferAnotherDoctorJPanel referAnotherDoctorJPanel = new ReferAnotherDoctorJPanel(userProcessContainer, ecosystem, patient, encounterList, doctor, enterprise);
            userProcessContainer.add("referAnotherDoctorJPanel2", referAnotherDoctorJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        if (wr instanceof ReferredDoctorWorkRequest) {
            JOptionPane.showMessageDialog(null, "You can not referred doctor");
            return;
        }
    }//GEN-LAST:event_referAnotherDoctorJButtonActionPerformed

    private void viewEncounterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncounterJButtonActionPerformed

        int selectedRow = managePatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        WorkRequest wr = (WorkRequest) managePatientsJTable.getValueAt(selectedRow, 0);
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest pwr = (PatientWorkRequest) wr;
            Patient patient = pwr.getPatient();
//            showEncounterHistory(patient);
            encounterList = showEncounterHistory(patient);

            ViewEncounterJPanel viewEncounterJPanel = new ViewEncounterJPanel(userProcessContainer, encounterList);
            userProcessContainer.add("viewEncounterJPanel1", viewEncounterJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        if (wr instanceof EnterpriseAdminWorkRequest) {
            EnterpriseAdminWorkRequest eawr = (EnterpriseAdminWorkRequest) wr;
            Patient patient = eawr.getPatient();
            encounterList = showEncounterHistory(patient);

            ViewEncounterJPanel viewEncounterJPanel = new ViewEncounterJPanel(userProcessContainer, encounterList);
            userProcessContainer.add("viewEncounterJPanel2", viewEncounterJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        if (wr instanceof ReferredDoctorWorkRequest) {
            newEncounterList = new ArrayList<>();
            ReferredDoctorWorkRequest rdwr = (ReferredDoctorWorkRequest) wr;
            newEncounterList = rdwr.getEncounterList();

            Patient patient = rdwr.getPatient();
            showEncounterHistory(patient);
            for (Encounter e : newEncounterList) {
                encounterList.add(e);

            }
            ViewEncounterJPanel viewEncounterJPanel = new ViewEncounterJPanel(userProcessContainer, encounterList);
            userProcessContainer.add("viewEncounterJPanel3", viewEncounterJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }


    }//GEN-LAST:event_viewEncounterJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEncounterJButton;
    private javax.swing.JLabel appointmentDetailsJLabel;
    private javax.swing.JTextField appointmentDetailsJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton doneJButton;
    private javax.swing.JLabel enterpriseIDJLabel;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managePatientsJTable;
    private javax.swing.JButton processRequestJButton;
    private javax.swing.JButton referAnotherDoctorJButton;
    private javax.swing.JButton submitDetailsJButton;
    private javax.swing.JButton viewEncounterJButton;
    private javax.swing.JButton viewRequestJButton;
    // End of variables declaration//GEN-END:variables
}
