/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryAgentRole;

import Business.Customer.Customer;
import Business.DeliveryAgency.Driver;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murali
 */

public class AssignDriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    WorkRequest workRequest;
    EcoSystem system;

    public AssignDriverJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest workRequest, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.workRequest = workRequest;
        this.system = system;
        initComponents();
        
        populateDriverTable();
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryPerson = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ASSIGN DRIVER PORTAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 34, -1, -1));

        tblDeliveryPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Devlivery Person Name", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 210, 161));

        btnAssign.setText("SELECT DELIVERY PERSON");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblDeliveryPerson.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a driver from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            Driver driver  = (Driver)tblDeliveryPerson.getValueAt(selectedRow, 0);   
            driver.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setDriver(driver);
            system.getDriverDirectory().addWorkRequesttoDriver(driver, workRequest);

            account.getDriverList().addWorkRequesttoDriver(driver, workRequest);
            //system.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setStatus("Assigned to Driver");
            System.out.println("Added to driver workqueue");
            System.out.println(driver.getWorkQueue().getWorkQueue().size()+" driver queue size in assign driver page " +driver.getUserName());


            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryPerson;
    // End of variables declaration//GEN-END:variables

    private void populateDriverTable() {
    DefaultTableModel model = (DefaultTableModel) tblDeliveryPerson.getModel();

        model.setRowCount(0);
        
          for (UserAccount admin : system.getUserAccountDirectory().getUserAccountList()) {
               
               if(admin.getUsername().equals(account.getUsername())) {
                  //System.out.println(admin.getUsername()+" "+user.getUsername());
    
                Object[] row = new Object[3];
                
                System.out.println(account.getDriverList().getDriverList().size()+" DRIVER LIST SIZE in assign driver page");
                for(Driver driver1: account.getDriverList().getDriverList())

                {
                //System.out.println(driver1.getFirstName());
                row[0] = driver1;
                row[1] = driver1.getUserName();
                row[2] = driver1.getStatus();

                model.addRow(row);
                
                }
            }

        }    
    }
}