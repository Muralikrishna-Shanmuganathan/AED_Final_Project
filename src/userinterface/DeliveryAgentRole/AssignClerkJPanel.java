/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryAgentRole;

import Business.Customer.Customer;
import Business.DeliveryAgency.Clerk;
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

public class AssignClerkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    WorkRequest workRequest;
    EcoSystem system;

    public AssignClerkJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest workRequest, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.workRequest = workRequest;
        this.system = system;
        initComponents();
        
        populateClerkTable();
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
        tblClerkPerson = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ASSIGN CLERK PORTAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 34, -1, -1));

        tblClerkPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Devlivery Person Name", "Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblClerkPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 370, 161));

        btnAssign.setText("SELECT CLERK PERSON");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblClerkPerson.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a driver from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Clerk clerk  = (Clerk)tblClerkPerson.getValueAt(selectedRow, 0);   
            clerk.getWorkQueue().addWorkRequesttoQueue(workRequest);
            System.out.println("checking if the work added to clerk in assign clerk page "+clerk.getWorkQueue().getWorkQueue().size());
            workRequest.setClerk(clerk);
            system.getClerkDirectory().addWorkRequesttoClerk(clerk, workRequest);

            account.getClerkList().addWorkRequesttoClerk(clerk, workRequest);
            //system.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setStatus("Assigned to Clerk");
            //System.out.println("Added to driver workqueue");
            System.out.println(clerk.getWorkQueue().getWorkQueue().size()+" clerk queue size in assign clerk page " +clerk.getUserName());
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
    private javax.swing.JTable tblClerkPerson;
    // End of variables declaration//GEN-END:variables

    private void populateClerkTable() {
    DefaultTableModel model = (DefaultTableModel) tblClerkPerson.getModel();

        model.setRowCount(0);
        
          for (UserAccount admin : system.getUserAccountDirectory().getUserAccountList()) {
               
               if(admin.getUsername().equals(account.getUsername())) {
                  //System.out.println(admin.getUsername()+" "+user.getUsername());
    
                Object[] row = new Object[3];
                
                System.out.println(account.getClerkList().getClerkList().size()+" account DRIVER LIST SIZE in assign clerk page");
                for(Clerk clerk1: account.getClerkList().getClerkList())

                {
                //System.out.println(driver1.getFirstName());
                row[0] = clerk1;
                row[1] = clerk1.getUserName();
                row[2] = clerk1.getStatus();

                model.addRow(row);
                
                }
            }

        }    
    }
}
