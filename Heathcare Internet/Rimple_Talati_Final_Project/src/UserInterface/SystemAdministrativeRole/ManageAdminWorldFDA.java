/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdministrativeRole;

import Business.Ecosystem;
import Business.Person.Person;
import Business.Role.WorldFDARole;
import Business.UserAccount.UserAccount;
import Business.WorldFDA;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rimple
 */
public class ManageAdminWorldFDA extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminWorldFDA
     */
     private JPanel userProcessContainer;
    private WorldFDA worldFDA;
    public ManageAdminWorldFDA(JPanel userProcessContainer, WorldFDA worldFDA) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
                this.worldFDA = worldFDA;
                populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) manageAdminWorldFDAJTable.getModel();
        model.setRowCount(0);
        for (UserAccount ua : worldFDA.getUserAccountDirectory().getUserAccountList()) {
            //check instance of admin world fda role
            if (ua.getRole()instanceof WorldFDARole ) {
               
                Object[] row = new Object[4];
                
                row[0] = ua.getPerson().getSsn();
                row[1] = ua.getPerson().getFirstName() + " "+ua.getPerson().getLastName();
                row[2] = ua;
                row[3] = ua.getPassword();

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageAdminWorldFDAJTable = new javax.swing.JTable();
        passwordJLabel = new javax.swing.JLabel();
        firstNameJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        usernameJTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        firstNameJTextField = new javax.swing.JTextField();
        usernameJLabel = new javax.swing.JLabel();
        memberIDJLabel = new javax.swing.JLabel();
        SSNJTextField = new javax.swing.JTextField();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();

        headingJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headingJLabel.setText("Manage Admin of World FDA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Create user account of admin of world's FDA to approve/ disapprove drugs");

        manageAdminWorldFDAJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SSN", "Name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageAdminWorldFDAJTable);

        passwordJLabel.setText("Password:");

        firstNameJLabel.setText("First Name:");

        lastNameJLabel.setText("Last Name:");

        usernameJLabel.setText("Username:");

        memberIDJLabel.setText("SSN:");

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(headingJLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameJLabel)
                            .addComponent(passwordJLabel)
                            .addComponent(firstNameJLabel)
                            .addComponent(lastNameJLabel)
                            .addComponent(memberIDJLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordjTextField)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(SSNJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(backJButton)
                        .addGap(63, 63, 63)
                        .addComponent(submitJButton)
                        .addGap(73, 73, 73)
                        .addComponent(refreshJButton)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingJLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameJLabel)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIDJLabel)
                    .addComponent(SSNJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton)
                    .addComponent(refreshJButton))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        populateTable();
        usernameJTextField.setText("");
        passwordjTextField.setText("");
        firstNameJTextField.setText("");
        lastNameJTextField.setText("");
        SSNJTextField.setText("");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameJTextField.getText().trim();
        String password = passwordjTextField.getText().trim();
        String firstName = firstNameJTextField.getText().trim();
        String lastName = lastNameJTextField.getText().trim();
        String ssn = SSNJTextField.getText().trim();
        
        if (("".equals(username))
            || ("".equals(password))
            || ("".equals(firstName))
            || ("".equals(lastName))||
                ("".equals(ssn))) {
            JOptionPane.showMessageDialog(null, "Please do not keep any values empty.");
            return;
        }

        //check instance of admin world fda role
                //check instance of admin authority role
        Pattern pattern;
        pattern = Pattern.compile("[a-zA-Z ]+");
        Matcher firstN = pattern.matcher(firstName);
        Matcher lastN = pattern.matcher(lastName);
        
        if (firstN.matches() && lastN.matches()) {
        boolean IsUserNameUnique = Ecosystem.checkIfUsernameIsUnique(username);
        if (IsUserNameUnique) {
            if (worldFDA.getPersonDirectory().getPersonList().size()>0){
                JOptionPane.showMessageDialog(null,"There can be only one admin");
                return;
            }
            Person person = worldFDA.getPersonDirectory().createPerson(firstName, lastName);
            person.setSsn(ssn);
            UserAccount userAccount = worldFDA.getUserAccountDirectory().createUserAccount(username, password, person, new WorldFDARole());
        } else {
            JOptionPane.showMessageDialog(null, "This username name already exists");
        }
        populateTable();
        usernameJTextField.setText("");
        passwordjTextField.setText("");
        firstNameJTextField.setText("");
        lastNameJTextField.setText("");
        SSNJTextField.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Only alphabets are allowed for name.");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SSNJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel headingJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTable manageAdminWorldFDAJTable;
    private javax.swing.JLabel memberIDJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
