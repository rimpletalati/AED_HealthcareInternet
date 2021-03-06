/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.WorkQueue.PatientWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class AddPatientWorkRequestForPatJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addPatientWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private Patient patient;
    private Enterprise enterprise;

    public AddPatientWorkRequestForPatJPanel(JPanel userProcessConatiner, Ecosystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.ecosystem = ecosystem;
        this.patient = patient;
        populateDoctorTable();
        messageJLabel.setVisible(false);
        messageJTextArea.setVisible(false);
        addJButton.setVisible(false);
    }

    private void populateDoctorTable() {

        DefaultTableModel model = (DefaultTableModel) manageDoctorsJTable.getModel();
        model.setRowCount(0);

        Object[] row1 = new Object[3];
        row1[0] = patient.getPreferredDoctor();
        row1[1] = patient.getPreferredDoctor().getFirstName() + " " + patient.getPreferredDoctor().getLastName();
        row1[2] = patient.getPreferredDoctorEnterprise();
        model.addRow(row1);

        if (patient.getReferredDoctor() != null) {
            Object[] row2 = new Object[3];
            row2[0] = patient.getReferredDoctor();
            row2[1] = patient.getReferredDoctor().getFirstName() + " " + patient.getReferredDoctor().getLastName();
            row2[2] = patient.getReferredDoctorEnterprise();
            model.addRow(row2);
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
        manageDoctorsJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        messageJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();
        selectDoctorJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Add Work Request");

        manageDoctorsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SSN", "Doctor Name", "Enterprise Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageDoctorsJTable);

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        messageJLabel.setText("Message:");

        messageJTextArea.setColumns(20);
        messageJTextArea.setRows(5);
        jScrollPane2.setViewportView(messageJTextArea);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        selectDoctorJButton.setText("Select Doctor");
        selectDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDoctorJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(headingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(selectDoctorJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(messageJLabel)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(addJButton)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(selectDoctorJButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(messageJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(addJButton)
                .addGap(73, 73, 73)
                .addComponent(backJButton)
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        int selectedRow = manageDoctorsJTable.getSelectedRow();
        Doctor d = (Doctor) manageDoctorsJTable.getValueAt(selectedRow, 0);
         enterprise = (Enterprise) manageDoctorsJTable.getValueAt(selectedRow, 2);
        if ("".equals(messageJTextArea.getText())) {
            JOptionPane.showMessageDialog(null, "Please write a message.");
            return;
        }
        PatientWorkRequest pwr = new PatientWorkRequest();
        pwr.setMessage(messageJTextArea.getText());
        pwr.setPatient(patient);
        pwr.setDoctor(d);
        pwr.setReceiver(d);
        pwr.setReceiverEnterprise(enterprise);
        pwr.setStatus("Sent");
        d.getWorkQueue().getWorkRequestList().add(pwr);
        patient.getWorkQueue().getWorkRequestList().add(pwr);
        messageJLabel.setVisible(false);
        messageJTextArea.setVisible(false);
        addJButton.setVisible(false);
        JOptionPane.showMessageDialog(null, "Message has been sent to Doctor.");


    }//GEN-LAST:event_addJButtonActionPerformed

    private void selectDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDoctorJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageDoctorsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        messageJTextArea.setVisible(true);
        messageJLabel.setVisible(true);
        //selectDoctorJButton.setVisible(true);
        addJButton.setVisible(true);
    }//GEN-LAST:event_selectDoctorJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manageDoctorsJTable;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JTextArea messageJTextArea;
    private javax.swing.JButton selectDoctorJButton;
    // End of variables declaration//GEN-END:variables
}
