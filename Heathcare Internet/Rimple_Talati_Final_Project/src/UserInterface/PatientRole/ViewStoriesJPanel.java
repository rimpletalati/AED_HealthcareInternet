/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PatientRole;

import Business.Forum.Stories;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class ViewStoriesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStoriesJPanel
     */
    private JPanel userProcessContainer;
    private Stories s;
    public ViewStoriesJPanel(JPanel userProcessContainer, Stories s) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.s = s;
        populateFields();
    }

    private void populateFields() {
        patientNameJTextField.setText(s.getPatient().getFirstName());
        ageJTextField.setText(String.valueOf(s.getAge()));
        genderJTextField.setText(s.getPatient().getGender());
        heightJTextField.setText(String.valueOf(s.getHeight()));
        weightJTextField.setText(String.valueOf(s.getWeight()));
        diseaseJTextField.setText(s.getDisease().getDiseaseName());
        illnessDiscoveredJTextField.setText(s.getIllnessDiscovered());
        signsJTextArea.setText(s.getSigns());
        testPerformedJTextArea.setText(s.getTestPerformed());
        drugsUsedJTextArea.setText(s.getDrugsUsed());
        resultsJTextArea.setText(s.getResultTreatment());
        recoveryTimeJTextArea.setText(s.getRecoveryTime());
        additionalCommentsJTextArea.setText(s.getAdditionalComments());
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genderJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        diseaseJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        illnessDiscoveredJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        signsJTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        testPerformedJTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        drugsUsedJTextArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        recoveryTimeJTextArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        additionalCommentsJTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultsJTextArea = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        headingJLabel1 = new javax.swing.JLabel();

        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Patient Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 73, -1, -1));

        patientNameJTextField.setEnabled(false);
        jPanel1.add(patientNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 70, 105, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 108, -1, -1));

        ageJTextField.setEnabled(false);
        jPanel1.add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 105, 105, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Gender:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 108, -1, -1));

        genderJTextField.setEnabled(false);
        jPanel1.add(genderJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 105, 105, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Height:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 108, -1, -1));

        heightJTextField.setEnabled(false);
        jPanel1.add(heightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 105, 105, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Weight:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 108, -1, -1));

        weightJTextField.setEnabled(false);
        jPanel1.add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 105, 105, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Disease/Illness");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 173, -1, -1));

        diseaseJTextField.setEnabled(false);
        jPanel1.add(diseaseJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 170, 222, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Illness discovered during");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 216, -1, -1));

        illnessDiscoveredJTextField.setEnabled(false);
        jPanel1.add(illnessDiscoveredJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 213, 651, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Signs and Symptoms");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 258, -1, -1));

        signsJTextArea.setColumns(20);
        signsJTextArea.setRows(5);
        signsJTextArea.setEnabled(false);
        jScrollPane2.setViewportView(signsJTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 266, 641, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Tests performed during treatment");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 388, -1, -1));

        testPerformedJTextArea.setColumns(20);
        testPerformedJTextArea.setRows(5);
        testPerformedJTextArea.setEnabled(false);
        jScrollPane4.setViewportView(testPerformedJTextArea);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 417, 658, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Drugs used during treatment");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 541, -1, -1));

        drugsUsedJTextArea.setColumns(20);
        drugsUsedJTextArea.setRows(5);
        drugsUsedJTextArea.setEnabled(false);
        jScrollPane3.setViewportView(drugsUsedJTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 559, 658, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Additional Comments");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 987, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Results of treatment (ex- side effect, stress)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 692, -1, -1));

        recoveryTimeJTextArea.setColumns(20);
        recoveryTimeJTextArea.setRows(5);
        recoveryTimeJTextArea.setEnabled(false);
        jScrollPane7.setViewportView(recoveryTimeJTextArea);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 839, 658, -1));

        additionalCommentsJTextArea.setColumns(20);
        additionalCommentsJTextArea.setRows(5);
        additionalCommentsJTextArea.setEnabled(false);
        jScrollPane6.setViewportView(additionalCommentsJTextArea);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 987, 658, -1));

        resultsJTextArea.setColumns(20);
        resultsJTextArea.setRows(5);
        resultsJTextArea.setEnabled(false);
        jScrollPane5.setViewportView(resultsJTextArea);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 721, 658, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Recovery Time");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 839, 171, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 1124, -1, -1));

        headingJLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel1.setText("View Story");
        jPanel1.add(headingJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea additionalCommentsJTextArea;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField diseaseJTextField;
    private javax.swing.JTextArea drugsUsedJTextArea;
    private javax.swing.JTextField genderJTextField;
    private javax.swing.JLabel headingJLabel1;
    private javax.swing.JTextField heightJTextField;
    private javax.swing.JTextField illnessDiscoveredJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JTextArea recoveryTimeJTextArea;
    private javax.swing.JTextArea resultsJTextArea;
    private javax.swing.JTextArea signsJTextArea;
    private javax.swing.JTextArea testPerformedJTextArea;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
