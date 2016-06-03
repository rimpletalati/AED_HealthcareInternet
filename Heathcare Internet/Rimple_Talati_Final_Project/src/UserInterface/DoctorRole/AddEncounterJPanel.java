/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Encounter.VitalSigns;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmaciesEnterprise;
import Business.Network.NetworkCities;
import Business.Network.NetworkCountries;
import Business.Network.NetworkStates;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drugs;
import Business.WorkQueue.EnterpriseAdminWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.ReferredDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rimple
 */
public class AddEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounterJPanel
     */
    private JPanel userProcessContainer;
    private WorkRequest workRequest;
    private Patient patient;
    private Doctor doctor;
    private Enterprise enterprise;
    private LabTestWorkRequest ltwr;
//    private ArrayList<Enterprise> enterpriseList;
    private Ecosystem ecosystem;
    private PharmacyWorkRequest pharmacyWorkRequest;
    private PharmaciesEnterprise pharmaciesEnterprise;
    private String pharmacyName;

    public AddEncounterJPanel(JPanel userProcessContainer, WorkRequest workRequest, Doctor d, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.workRequest = workRequest;
        this.doctor = d;
        this.ecosystem = ecosystem;
        if (workRequest instanceof PatientWorkRequest) {
            PatientWorkRequest pwd = (PatientWorkRequest) workRequest;
            mrNoJTextField.setText(String.valueOf(pwd.getPatient().getMrNo()));
            patientNameJTextField.setText(pwd.getPatient().getFirstName() + " " + pwd.getPatient().getLastName());
            testNameJTextField.setVisible(false);
            testNameJLabel.setVisible(false);
            patient = pwd.getPatient();
            enterprise = pwd.getReceiverEnterprise();
            prescriptionJPanel.setVisible(false);
            if (patient.getPreferredDoctor().equals(doctor)) {
                closeCaseJButton.setVisible(false);
            }
        }
        if (workRequest instanceof EnterpriseAdminWorkRequest) {
            EnterpriseAdminWorkRequest eawd = (EnterpriseAdminWorkRequest) workRequest;
            mrNoJTextField.setText(String.valueOf(eawd.getPatient().getMrNo()));
            patientNameJTextField.setText(eawd.getPatient().getFirstName() + " " + eawd.getPatient().getLastName());
            testNameJTextField.setVisible(false);
            testNameJLabel.setVisible(false);
            patient = eawd.getPatient();
            enterprise = eawd.getSenderEnterprise();
            prescriptionJPanel.setVisible(false);
            if (patient.getPreferredDoctor().equals(doctor)) {
                closeCaseJButton.setVisible(false);
            }
        }
        if (workRequest instanceof ReferredDoctorWorkRequest) {
            ReferredDoctorWorkRequest rdwd = (ReferredDoctorWorkRequest) workRequest;
            mrNoJTextField.setText(String.valueOf(rdwd.getPatient().getMrNo()));
            patientNameJTextField.setText(rdwd.getPatient().getFirstName() + " " + rdwd.getPatient().getLastName());
            testNameJTextField.setVisible(false);
            testNameJLabel.setVisible(false);
            patient = rdwd.getPatient();
            enterprise = rdwd.getReceiverEnterprise();
            prescriptionJPanel.setVisible(false);
            if (patient.getPreferredDoctor().equals(doctor)) {
                closeCaseJButton.setVisible(false);
            }
        }

    }

    public void populateCountryComboBox() {
        countryJComboBox1.removeAllItems();

        for (NetworkCountries nc : ecosystem.getNetworkListsCountries()) {
            countryJComboBox1.addItem(nc);
        }
    }

    public void populateStateComboBox(NetworkCountries networkCountries) {
        stateNameJComboBox1.removeAllItems();
        for (NetworkStates ns : networkCountries.getNetworkListStates()) {
            stateNameJComboBox1.addItem(ns);
        }
    }

    public void populateCityComboBox(NetworkStates networkStates) {
        cityJComboBox1.removeAllItems();
        for (NetworkCities nc : networkStates.getNetworkListCities()) {
            cityJComboBox1.addItem(nc);
        }
    }

    public void populatePharmacies(NetworkCities networkCities) {
        pharmaciesJComboBox.removeAllItems();
        for (Enterprise e : networkCities.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof PharmaciesEnterprise) {
                PharmaciesEnterprise pe = (PharmaciesEnterprise) e;
                pharmaciesJComboBox.addItem(pe);
            }
        }
    }

    public void populateDrugs(PharmaciesEnterprise pe) {
        drugsJComboBox.removeAllItems();
        for (Drugs drugs : pe.getDrugsList()) {
            if (drugs.getIsApproved() == null ? drugs.Approved_Status == null : drugs.getIsApproved().equals(drugs.Approved_Status)) {
                drugsJComboBox.addItem(drugs);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        headingJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mrNoJTextField = new javax.swing.JTextField();
        firstNameJLabel = new javax.swing.JLabel();
        patientNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weightJTextField = new javax.swing.JTextField();
        systolicBPJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        temperatureJTextField = new javax.swing.JTextField();
        respiartoryRateJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        yesJRadioButton = new javax.swing.JRadioButton();
        noJRadioButton = new javax.swing.JRadioButton();
        testNameJLabel = new javax.swing.JLabel();
        testNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        prescribeDrugsJButton = new javax.swing.JButton();
        prescriptionJPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicationJTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        pharmaciesJComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        countryJLabel1 = new javax.swing.JLabel();
        countryJComboBox1 = new javax.swing.JComboBox();
        stateNameJLabel = new javax.swing.JLabel();
        stateNameJComboBox1 = new javax.swing.JComboBox();
        cityJLabel = new javax.swing.JLabel();
        cityJComboBox1 = new javax.swing.JComboBox();
        drugsJComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        drugNameJLabel = new javax.swing.JLabel();
        closeCaseJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Add Encounter");

        jLabel1.setText("MR No.:");

        mrNoJTextField.setEditable(false);

        firstNameJLabel.setText("Patient Name:");

        patientNameJTextField.setEditable(false);

        jLabel2.setText("Weight:");

        jLabel3.setText("Systolic Blood Pressure:");

        jLabel4.setText("Heart Rate:");

        jLabel5.setText("Temperature:");

        jLabel6.setText("Respiratory Rate:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Lab Test Request?");

        buttonGroup1.add(yesJRadioButton);
        yesJRadioButton.setText("Yes");
        yesJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(noJRadioButton);
        noJRadioButton.setSelected(true);
        noJRadioButton.setText("No");
        noJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noJRadioButtonActionPerformed(evt);
            }
        });

        testNameJLabel.setText("Tests Name:");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Vital Signs:");

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        prescribeDrugsJButton.setText("Prescribe Drugs and Medication");
        prescribeDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeDrugsJButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Prescription:");

        jLabel7.setText("Medication:");

        medicationJTextArea.setColumns(20);
        medicationJTextArea.setRows(5);
        jScrollPane1.setViewportView(medicationJTextArea);

        jLabel10.setText("Pharmacies:");

        pharmaciesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaciesJComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Suggested Drugs:");

        countryJLabel1.setText("Country:");

        countryJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryJComboBox1ActionPerformed(evt);
            }
        });

        stateNameJLabel.setText("State:");

        stateNameJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateNameJComboBox1ActionPerformed(evt);
            }
        });

        cityJLabel.setText("City:");

        cityJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBox1ActionPerformed(evt);
            }
        });

        drugsJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsJComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setText("Drug Name:");

        javax.swing.GroupLayout prescriptionJPanelLayout = new javax.swing.GroupLayout(prescriptionJPanel);
        prescriptionJPanel.setLayout(prescriptionJPanelLayout);
        prescriptionJPanelLayout.setHorizontalGroup(
            prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescriptionJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescriptionJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prescriptionJPanelLayout.createSequentialGroup()
                        .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryJLabel1)
                            .addComponent(stateNameJLabel)
                            .addComponent(cityJLabel)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pharmaciesJComboBox, 0, 104, Short.MAX_VALUE)
                            .addComponent(stateNameJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugsJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drugNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        prescriptionJPanelLayout.setVerticalGroup(
            prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prescriptionJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryJLabel1)
                    .addComponent(countryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateNameJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityJLabel))
                .addGap(18, 18, 18)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(pharmaciesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(prescriptionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(drugsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(drugNameJLabel))
                .addGap(60, 60, 60))
        );

        closeCaseJButton.setText("Close Case");
        closeCaseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCaseJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(mrNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(firstNameJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(prescribeDrugsJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(181, 181, 181)
                        .addComponent(saveJButton)
                        .addGap(172, 172, 172)
                        .addComponent(closeCaseJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(yesJRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(noJRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(testNameJLabel))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respiartoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(systolicBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(prescriptionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(mrNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameJLabel)
                            .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)))
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(systolicBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(temperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(respiartoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yesJRadioButton)
                    .addComponent(noJRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testNameJLabel)
                    .addComponent(testNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(prescribeDrugsJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prescriptionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(backJButton)
                    .addComponent(closeCaseJButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed

        try {
            String weight = weightJTextField.getText().trim();
            String respiratoryRate = respiartoryRateJTextField.getText().trim();
            String heartRate = heartRateJTextField.getText().trim();
            String systolicBloodPressure = systolicBPJTextField.getText().trim();
            String temperature = temperatureJTextField.getText().trim();
            String medication = medicationJTextArea.getText();

            String testName = testNameJTextField.getText();
            if (("".equals(weight)) || ("".equals(respiratoryRate)) || ("".equals(heartRate))
                    || ("".equals(systolicBloodPressure)) || ("".equals(temperature)) || ("".equals(medication))) {
                JOptionPane.showMessageDialog(null, "Please do not keep any values empty.");
                return;
            }

            Pattern pattern = Pattern.compile("\\d{10}");
            Matcher wtField = pattern.matcher(weight);
            Matcher rrField = pattern.matcher(respiratoryRate);
            Matcher hrField = pattern.matcher(heartRate);
            Matcher ssbpField = pattern.matcher(systolicBloodPressure);
            Matcher tempField = pattern.matcher(temperature);
            if (!(wtField.matches()) && !(rrField.matches()) && !(hrField.matches()) && !(ssbpField.matches())
                    && !(tempField.matches())) {
                JOptionPane.showMessageDialog(null, "Please use valid values for vital signs.");
                return;
            }
            float wt = Float.parseFloat(weight);
            float rr = Float.parseFloat(respiratoryRate);
            float hr = Float.parseFloat(heartRate);
            float sbp = Float.parseFloat(systolicBloodPressure);
            float temp = Float.parseFloat(temperature);

            VitalSigns vs = new VitalSigns();
            vs.setHeartRate(hr);
            vs.setRespiratoryRate(rr);
            vs.setSystolicBloodPressure(sbp);
            vs.setTemperatue(temp);
            vs.setWeight(wt);

            NetworkCountries nc = (NetworkCountries) countryJComboBox1.getSelectedItem();
            NetworkStates ns = (NetworkStates) stateNameJComboBox1.getSelectedItem();
            NetworkCities networkCities = (NetworkCities) cityJComboBox1.getSelectedItem();
            PharmaciesEnterprise pe = (PharmaciesEnterprise) pharmaciesJComboBox.getSelectedItem();
            Drugs d = (Drugs) drugsJComboBox.getSelectedItem();
            if (nc == null || ns == null || networkCities == null || pharmaciesEnterprise == null
                    || d == null) {
                JOptionPane.showMessageDialog(null, "Encounter can not be added now");
                return;
            }
            Encounter encounter = new Encounter();
            encounter.setPatient(patient);
            encounter.setDoctor(doctor);
            encounter.setVitalSign(vs);
            encounter.getDrugs().add(d);
            encounter.setMedication(medication);

            if (yesJRadioButton.isSelected()) {
                if ("".equals(testName)) {
                    JOptionPane.showMessageDialog(null, "Please do not keep test name empty.");
                    return;
                } else {
                    ltwr = new LabTestWorkRequest();
                    ltwr.setMrNO(Integer.parseInt(mrNoJTextField.getText()));
                    ltwr.setPatientName(patientNameJTextField.getText());
                    ltwr.setSender(doctor);
                    ltwr.setMessage(testName);
                    ltwr.setPrescription(medication);
                    //ltwr.setLabResults(tes);
                    // ltwr.setPrescription();
                    ltwr.setStatus("Lab Test Requested/Not Assigned");
                    ltwr.setSenderEnterprise(enterprise);
                    ltwr.setResolveDate(new Date());
                    encounter.setLabTestWorkResquest(ltwr);
                }
            }
            if (noJRadioButton.isSelected()) {
                testNameJTextField.setText("Not Applicable");
            }

            pharmacyWorkRequest = new PharmacyWorkRequest();
            pharmacyWorkRequest.setPatient(patient);
            pharmacyWorkRequest.setSender(doctor);
            pharmacyWorkRequest.setMessage(medication);
            pharmacyWorkRequest.setEnterprise(enterprise);
            pharmacyWorkRequest.setPharmicistName(pharmacyName);
            pharmacyWorkRequest.setDrugs(d);
            pharmacyWorkRequest.setStatus("Sent list to Pharmacy.");

            doctor.getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);
            patient.getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);
            pharmaciesEnterprise.getWorkQueue().getWorkRequestList().add(pharmacyWorkRequest);

            for (Organization or : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (or instanceof LabOrganization) {
                    or.getWorkQueue().getWorkRequestList().add(ltwr);
                }
            }
            if (enterprise instanceof HospitalEnterprise) {
                HospitalEnterprise he = (HospitalEnterprise) enterprise;
                he.getEncounterList().add(encounter);
            }
            if (enterprise instanceof ClinicEnterprise) {
                ClinicEnterprise ce = (ClinicEnterprise) enterprise;
                ce.getEncounterList().add(encounter);
            }
            JOptionPane.showMessageDialog(null, "Encounter has been added successfully");
            doctor.getWorkQueue().getWorkRequestList().add(ltwr);
            patient.getWorkQueue().getWorkRequestList().add(ltwr);
            //enterprise.getWorkQueue().getWorkRequestList().add(ltwr);
            saveJButton.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please use numbers for Vital Signs");
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void yesJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesJRadioButtonActionPerformed

        testNameJTextField.setVisible(true);
        testNameJLabel.setVisible(true);
    }//GEN-LAST:event_yesJRadioButtonActionPerformed

    private void noJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noJRadioButtonActionPerformed

        testNameJTextField.setVisible(false);
        testNameJLabel.setVisible(false);
    }//GEN-LAST:event_noJRadioButtonActionPerformed

    private void prescribeDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeDrugsJButtonActionPerformed
        prescriptionJPanel.setVisible(true);
        populateCountryComboBox();
    }//GEN-LAST:event_prescribeDrugsJButtonActionPerformed

    private void countryJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryJComboBox1ActionPerformed

        NetworkCountries nc = (NetworkCountries) countryJComboBox1.getSelectedItem();
        if (nc != null) {
            populateStateComboBox(nc);
        }
    }//GEN-LAST:event_countryJComboBox1ActionPerformed

    private void stateNameJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateNameJComboBox1ActionPerformed

        NetworkStates ns = (NetworkStates) stateNameJComboBox1.getSelectedItem();
        if (ns != null) {
            populateCityComboBox(ns);
        }
    }//GEN-LAST:event_stateNameJComboBox1ActionPerformed

    private void cityJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBox1ActionPerformed

        NetworkCities nc = (NetworkCities) cityJComboBox1.getSelectedItem();
        if (nc != null) {
            populatePharmacies(nc);
        }
    }//GEN-LAST:event_cityJComboBox1ActionPerformed

    private void pharmaciesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaciesJComboBoxActionPerformed

        PharmaciesEnterprise pe = (PharmaciesEnterprise) pharmaciesJComboBox.getSelectedItem();
        if (pe != null) {
            pharmaciesEnterprise = pe;
            pharmacyName = pe.getName();
            populateDrugs(pe);
        }
    }//GEN-LAST:event_pharmaciesJComboBoxActionPerformed

    private void closeCaseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCaseJButtonActionPerformed

        int selectedValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the case?", "Warning", JOptionPane.YES_NO_OPTION);

        if (selectedValue == JOptionPane.YES_OPTION) {

            patient.setReferredDoctor(null);
            patient.setReferredDoctorEnterprise(null);
            closeCaseJButton.setEnabled(false);
            saveJButton.setEnabled(false);
        }


    }//GEN-LAST:event_closeCaseJButtonActionPerformed

    private void drugsJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsJComboBoxActionPerformed
        Drugs dlist = (Drugs) drugsJComboBox.getSelectedItem();
        if (dlist != null) {
            drugNameJLabel.setText(dlist.getDrugName());
        }
    }//GEN-LAST:event_drugsJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cityJComboBox1;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JButton closeCaseJButton;
    private javax.swing.JComboBox countryJComboBox1;
    private javax.swing.JLabel countryJLabel1;
    private javax.swing.JLabel drugNameJLabel;
    private javax.swing.JComboBox drugsJComboBox;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JTextField heartRateJTextField;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea medicationJTextArea;
    private javax.swing.JTextField mrNoJTextField;
    private javax.swing.JRadioButton noJRadioButton;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JComboBox pharmaciesJComboBox;
    private javax.swing.JButton prescribeDrugsJButton;
    private javax.swing.JPanel prescriptionJPanel;
    private javax.swing.JTextField respiartoryRateJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JComboBox stateNameJComboBox1;
    private javax.swing.JLabel stateNameJLabel;
    private javax.swing.JTextField systolicBPJTextField;
    private javax.swing.JTextField temperatureJTextField;
    private javax.swing.JLabel testNameJLabel;
    private javax.swing.JTextField testNameJTextField;
    private javax.swing.JTextField weightJTextField;
    private javax.swing.JRadioButton yesJRadioButton;
    // End of variables declaration//GEN-END:variables
}
