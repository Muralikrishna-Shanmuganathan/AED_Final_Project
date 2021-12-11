/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Registration;

import Business.Contributor.Contributor;
import Business.Distributor.Distributor;
import Business.EcoSystem;
import Business.Registration.Registration;
import Business.Role.ContributorRole;
import Business.Role.DistributorRole;
import Business.Role.VolunteerRole;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.MainJFrame;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import Business.Registration.Registration;

/**
 *
 * @author murali
 */
public class RegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private String imgPath;
    
    public RegistrationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateRole();
        populateCarrier();
        populateLocation();
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
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        comboRole = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboLocation = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        cPasswordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnUploadPhoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        comboCarrier = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Manage Registrations");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 96, -1));

        jLabel3.setText("Confirm Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel5.setText("User Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 107, -1));

        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });
        add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 132, -1));

        jLabel6.setText("Role");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel7.setText("Carrier");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 111, -1));

        jLabel8.setText("Email");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 107, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 107, -1));

        jLabel9.setText("Phone Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 117, -1));
        add(cPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 117, -1));

        jLabel10.setText("Location");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel11.setText("Photo");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        btnUploadPhoto.setText("Upload Image");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });
        add(btnUploadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel12.setText("Location");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        add(comboCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 111, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        String name = txtName.getText();
        String userName = txtUserName.getText();
        
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        char[] passwordCharArray1 = cPasswordField.getPassword();
        String cpassword = String.valueOf(passwordCharArray1);
        
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String role = String.valueOf(comboRole.getSelectedItem());
        String carrier = String.valueOf(comboCarrier.getSelectedItem());
        String location = String.valueOf(comboLocation.getSelectedItem());
        
        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
                throw new Exception("Please enter valid  Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if (userName == null || userName.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (userName.length() < 5) {
                throw new Exception("Please enter valid User Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if (password == null || password.isEmpty()) {
                throw new NullPointerException("Pwd field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        if ( password.equals(cpassword)){
            
        }else{
            JOptionPane.showMessageDialog(null, "Passwords dont match");
            return;
        }
        
        try {

            if (email == null || email.isEmpty()) {
                throw new NullPointerException("Email field is Empty");
            } else if (Pattern.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", email) == false) {
                throw new Exception("Invalid email format");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "email is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "email is of invalid pattern");

            return;
        }
        
        try {

            if (phone == null || phone.isEmpty()) {
                throw new NullPointerException("phone field is Empty");
            } else if (Pattern.matches("^[0-9]{10}$", phone) == false) {
                throw new Exception("Invalid phone format");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "phone is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "phone is of invalid pattern");

            return;
        }
        
        if (imgPath == null){
                   JOptionPane.showMessageDialog(null, "Please upload a photo");
                   return;
               }
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName) == false) {
             JOptionPane.showMessageDialog(null, "  User Name already exists ");
         } 
        else{
         Registration registration = new Registration(name, role, userName, password, email, phone, carrier, location, imgPath, "New Request");
         system.getRegistrationDirectory().AddRegistration( registration, name, role, userName, password, email, phone, carrier, location, imgPath, "New Request");


        txtName.setText("");
        txtUserName.setText("");
        passwordField.setText("");
        cPasswordField.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        populateRole();
        populateCarrier();
        populateLocation();

        JOptionPane.showMessageDialog(null, "Registration Done. Welcome to the team!");
     }
        


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        
        JFileChooser uploadImageFile = new JFileChooser();
            //Filter image extension
            FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
            uploadImageFile.addChoosableFileFilter(filter);
            try{
            int showOpenDialogue = uploadImageFile.showOpenDialog(null);
            if ( showOpenDialogue == JFileChooser.APPROVE_OPTION ){
               File selectedImageFile = uploadImageFile.getSelectedFile();
               String selectedImagePath = selectedImageFile.getAbsolutePath();
               if (selectedImagePath == null){
                   JOptionPane.showMessageDialog(null, "Please upload a photo");
                   return;
               }
               else
                    imgPath = selectedImagePath;

               JOptionPane.showMessageDialog(null, selectedImagePath);
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error uploading photo");
            }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JComboBox<String> comboCarrier;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateRole() {
        comboRole.removeAllItems();
        comboRole.addItem("Volunteer");
        comboRole.addItem("Contributor");
        comboRole.addItem("Distributor");
        comboRole.addItem("Receiver");
    }

    private void populateCarrier() {
        comboCarrier.removeAllItems();
        comboCarrier.addItem("ATT");
        comboCarrier.addItem("Sprint");
        comboCarrier.addItem("TMobile");
        comboCarrier.addItem("Verizon");
    }

    private void populateLocation() {
        comboLocation.removeAllItems();
        comboLocation.addItem("Back Bay");
        comboLocation.addItem("Cambridge");
    }
}