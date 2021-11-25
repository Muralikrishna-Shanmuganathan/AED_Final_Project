/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Volunteer.VolunteerAdmin;
import Business.Volunteer.VolunteerAdminDirectory;
import Business.EcoSystem;
import static Business.Organization.Type.Volunteer;
import static Business.Role.Role.RoleType.Volunteer;
import Business.Role.VolunteerRole;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murali
 */
public class ManageVolunteerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVolunteerJPanel
     */
    JPanel userProcessContainer;
    VolunteerAdmin volunteer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    VolunteerAdmin v = new VolunteerAdmin();
    
    public ManageVolunteerJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        
        populateVolunteerTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteers = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Manage Volunteer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 48, -1, -1));

        tblVolunteers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteers);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 123, -1, 150));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 391, 99, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 396, -1, -1));

        txtConfirmPassword.setText("Confirm Password:");
        add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 528, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 435, 99, -1));

        jLabel4.setText("UserName:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        txtPassword.setText("Password:");
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 484, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 435, 99, -1));

        jLabel5.setText("Email:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 440, -1, -1));

        txtPassword1.setText("Full Face Photo:");
        add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 488, -1, -1));

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyPressed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 391, 99, -1));

        jLabel3.setText("Phone Number:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 396, -1, -1));

        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 483, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 315, -1, -1));

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 315, -1, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 315, -1, -1));
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 526, 197, 135));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 479, 103, -1));
        add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 523, 105, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
    
        char ch = evt.getKeyChar();
        if ( Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch)){
            txtName.setEditable(true);
        }
        else{
            txtName.setEditable(false);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyPressed
        // TODO add your handling code here:
        String number = txtPhoneNumber.getText();

        char ch = evt.getKeyChar();
        
        if(ch >= '0' && ch<='9'){
            if(number.length()<10){
               txtPhoneNumber.setEditable(true);
            }
            else{
               txtPhoneNumber.setEditable(false);              
        }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                txtPhoneNumber.setEditable(true);
            else
                txtPhoneNumber.setEditable(false);   
        }   
    }//GEN-LAST:event_txtPhoneNumberKeyPressed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         String password = String.valueOf(passwordField.getPassword());
         String cpassword = String.valueOf(confirmPasswordField.getPassword());
         
        if( txtName.getText().isEmpty()||txtUsername.getText().isEmpty()|| password.isEmpty() || cpassword.isEmpty() ||  txtPhoneNumber.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Some field are empty");
            return;
        }
        else if ( !(passwordField.equals(confirmPasswordField)) ){
            JOptionPane.showMessageDialog(null, "Passwords don't match");
            return;
        }
        else if(!checkPhoneNumber(txtPhoneNumber.getText())){
            JOptionPane.showMessageDialog(null, "Phone Number format is incorrect");
        }
        else if(!checkEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(null, "Email format is incorrect");
        }
        else{
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername.getText())){
            
            
            v.setVolunteerName(txtName.getText());
            v.setVolunteerPhoneNumber(txtPhoneNumber.getText());
            v.setVolunteerEmail(txtEmail.getText());
            v.setVolunteerName(txtName.getText());
            v.setUsername(txtUsername.getText());
            v.setPassword(String.valueOf(txtPassword.getText()));
            v.setRole( new VolunteerRole());
            
            ecosystem.getUserAccountDirectory().addUserAccount(v);
            ecosystem.getVolunteerAdminDirectory().addVolunteer(v);
            
            populateVolunteerTable();
            
            txtName.setText("");
            txtPhoneNumber.setText("");
            txtEmail.setText("");
            txtName.setText("");
         }
        else{
            JOptionPane.showMessageDialog(null, "Username " + txtUsername.getText() + " exists");
         }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser uploadImageFile = new JFileChooser();
        //Filter image extension
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        uploadImageFile.addChoosableFileFilter(filter);
        try{
        int showOpenDialogue = uploadImageFile.showOpenDialog(null);
        if ( showOpenDialogue == JFileChooser.APPROVE_OPTION ){
           File selectedImageFile = uploadImageFile.getSelectedFile();
           String selectedImagePath = selectedImageFile.getAbsolutePath();
           v.setVolunteerPhoto(selectedImagePath);
           
           JOptionPane.showMessageDialog(null, selectedImagePath);
           
           //display image on label
           ImageIcon icon = new ImageIcon(selectedImagePath);
//           backend.setImage(icon);
           //resizing image to fit the jframe
           Image image = icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
           lblPhoto.setIcon(new ImageIcon(image));
//           JOptionPane.showMessageDialog(null, image); 

            if(selectedImageFile.getAbsolutePath()==null)
                JOptionPane.showMessageDialog(null, "No Image uploaded");
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No Image uploaded;");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteers.getSelectedRow();

        if (selectedRow >= 0) {
            VolunteerAdmin admin = (VolunteerAdmin) tblVolunteers.getValueAt(selectedRow, 0);
            VolunteerAdminDirectory volunteerAdminDirectory = ecosystem.getVolunteerAdminDirectory();
            volunteerAdminDirectory.removeVolunteer(admin);
            JOptionPane.showMessageDialog(null, "Volunteer "  + txtName.getText() + " deleted");
            
            populateVolunteerTable();
            
            txtName.setText("");
            txtUsername.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            txtPhoneNumber.setText("");
            txtEmail.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Which volunteer do you want to remove?");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteers.getSelectedRow();
        if (selectedRow >= 0) {
            VolunteerAdmin volunteer = (VolunteerAdmin) tblVolunteers.getValueAt(selectedRow, 0);
                    
            volunteer.setUsername(txtUsername.getText());
            volunteer.setPassword(txtPassword.getText());
            volunteer.setVolunteerName(txtName.getText());
            volunteer.setVolunteerPhoneNumber(txtPhoneNumber.getText());
            volunteer.setVolunteerEmail(txtEmail.getText());
           
            
            JFileChooser uploadImageFile = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
            uploadImageFile.addChoosableFileFilter(filter);
            try{
            int showOpenDialogue = uploadImageFile.showOpenDialog(null);
            if ( showOpenDialogue == JFileChooser.APPROVE_OPTION ){
               File selectedImageFile = uploadImageFile.getSelectedFile();
               String selectedImagePath = selectedImageFile.getAbsolutePath();
               volunteer.setVolunteerPhoto(selectedImagePath);

               JOptionPane.showMessageDialog(null, selectedImagePath);
               ImageIcon icon = new ImageIcon(selectedImagePath);
               Image image = icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
               lblPhoto.setIcon(new ImageIcon(image));
            }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No Image uploaded;");
            }
            
            volunteer.setRole(new VolunteerRole());
         
            populateVolunteerTable();
            
            txtName.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtEmail.setText("");
            txtPhoneNumber.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Select a volunteer");
        }
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTable tblVolunteers;
    private javax.swing.JLabel txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtPassword1;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
public Boolean checkPhoneNumber(String phNumber) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phNumber);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
public static boolean checkEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
public static boolean checkPassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }

    private void populateVolunteerTable() {
        
        VolunteerAdminDirectory volunteerAdminDirectory = ecosystem.getVolunteerAdminDirectory();
        DefaultTableModel model = (DefaultTableModel) tblVolunteers.getModel();
        
        model.setRowCount(0);
        
        for (VolunteerAdmin volunteerAdmin : volunteerAdminDirectory.getVolunteerList()) {
                    Object[] row = new Object[3];
                    row[0] = volunteerAdmin;
                    row[1] = volunteerAdmin.getUsername();
                    row[2] = volunteerAdmin.getPassword();
                    model.addRow(row);
        }
    }
}