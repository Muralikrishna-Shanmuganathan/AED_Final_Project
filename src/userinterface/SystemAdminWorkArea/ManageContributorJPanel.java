/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Contributor.Contributor;
import Business.EcoSystem;
import Business.Role.ContributorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murali
 */
public class ManageContributorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageContributorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    private String imgPath;
    public ManageContributorJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateContributorsTable();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContributors = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboLocation = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cPasswordField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnUploadPhoto = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        comboCarrier = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblContributors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContributors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 404, 110));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setText("Confirm Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setText("Carrier");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 111, -1));

        jLabel10.setText("Email");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 107, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 107, -1));

        jLabel11.setText("Phone Number");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        add(cPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 117, -1));

        jLabel12.setText("Location");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel13.setText("Photo");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        btnUploadPhoto.setText("Upload Image");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });
        add(btnUploadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel14.setText("Location");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        add(comboCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 111, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 137, -1));

        jLabel1.setText("Password");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel3.setText("UserName");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

//        String name = txtName.getText();
//        String uname = txtUserName.getText();
//        String password = String.valueOf(txtPassword.getPassword());
//
//        try {
//            if (name == null || name.isEmpty()) {
//                throw new NullPointerException(" Name field is Empty");
//
//            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
//                throw new Exception("Please enter valid  Name");
//
//            }
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, " Name is Empty");
//
//            return;
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "  Name is invalid");
//
//            return;
//        }
//
//        try {
//            if (uname == null || uname.isEmpty()) {
//                throw new NullPointerException("User Name field is Empty");
//
//            } else if (uname.length() < 5) {
//                throw new Exception("Please enter valid User Name");
//
//            }
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, "User Name is Empty");
//
//            return;
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, " User Name is invalid");
//
//            return;
//        }
//
//        try {
//
//            if (password == null || password.isEmpty()) {
//                throw new NullPointerException("Pwd field is Empty");
//            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
//                throw new Exception("Invalid Password");
//            }
//
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, "Password is Empty");
//
//            return;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");
//
//            return;
//        }
//
//        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname) == false) {
//            JOptionPane.showMessageDialog(null, "  User Name already exists ");
//        } else {
//
//            UserAccount ua1 = system.getUserAccountDirectory().createUserAccount(name, uname, password, null, new ContributorRole());
//            Contributor contributor = system.getContributorDirectory().createContributor(uname);
//
//            txtName.setText("");
//            txtUserName.setText("");
//            txtPassword.setText("");


        String name = txtName.getText();
        String userName = txtUserName.getText();
        
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        char[] passwordCharArray1 = cPasswordField.getPassword();
        String cpassword = String.valueOf(passwordCharArray1);
        
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String role = "Contributor";
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
            UserAccount ua1 = system.getUserAccountDirectory().createUserAccount(name, userName, password, null, new ContributorRole());
            Contributor contributor = system.getContributorDirectory().createContributor(name, role, userName, password, email, phone, carrier, location, imgPath);


        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        cPasswordField.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        populateCarrier();
        populateLocation();

        populateContributorsTable();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectRow = tblContributors.getSelectedRow();
        txtUserName.setEditable(false);
        
        if (selectRow >= 0) {
            String username = (String) tblContributors.getValueAt(selectRow, 1);
            String pwd = (String) tblContributors.getValueAt(selectRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);
            
            
            for( Contributor con : system.getContributorDirectory().getContributorList()){
            if( username.equals(con.getUserName())){
            txtName.setText(con.getName());
            txtUserName.setText(con.getUserName());
            txtPassword.setText(con.getPassword());
            cPasswordField.setText(con.getPassword());
            txtEmail.setText(con.getEmail());
            txtPhone.setText(con.getPhone());
            comboCarrier.setSelectedItem(con.getCarrier());
            comboLocation.setSelectedItem(con.getLocation());
            }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblContributors.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        String name = txtName.getText();
        String uname = txtUserName.getText();
        
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        char[] passwordCharArray1 = cPasswordField.getPassword();
        String cpassword = String.valueOf(passwordCharArray1);
        
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String role = "Contributor";
        String carrier = String.valueOf(comboCarrier.getSelectedItem());
        String location = String.valueOf(comboLocation.getSelectedItem());
        
        txtUserName.setEditable(false);

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
            if (uname == null || uname.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (uname.length() < 5) {
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
        
        system.getUserAccountDirectory().updateUserAccount(user, name, uname, password);
        for( Contributor con : system.getContributorDirectory().getContributorList()){
            if( uname.equals(con.getUserName())){
                
            con.setName(name);
            con.setCarrier(carrier);
            con.setEmail(email);
            con.setLocation(location);
            con.setPassword(password);
            con.setPhone(phone);
            con.setPhoto(phone);
            }
            }
        
        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        cPasswordField.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        populateCarrier();
        populateLocation();

        populateContributorsTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblContributors.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblContributors.getValueAt(selectedRow, 1);
                String pwd = (String) tblContributors.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getContributorDirectory().deleteContributor(user.getUsername());

                populateContributorsTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

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

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error uploading photo");
        }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JButton btnView;
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JComboBox<String> comboCarrier;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContributors;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateContributorsTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblContributors.getModel();

        model.setRowCount(0);

        // Updating the contributorTable
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if ("Business.Role.ContributorRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];

                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();

                model.addRow(row);
            }

        }    
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
        comboLocation.addItem("Chinatown");
        comboLocation.addItem("Roxbury");
    }
}
