/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryAgentRole;

import Business.DeliveryAgency.Clerk;
import Business.DeliveryAgency.Driver;
import userinterface.SystemAdminWorkArea.*;
import Business.DeliveryAgent.DeliveryAgent;
import Business.EcoSystem;
import Business.Role.ClerkRole;
import Business.Role.DeliveryAgentRole;
import Business.Role.DriverRole;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashwanthsridharan
 */
public class ManageWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryAgentJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    WorkQueue workQueue;
    WorkRequest workRequest;

    public ManageWorkRequestsJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        populateWorkRequests();
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
        tblWorkRequests = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAssignDriver = new javax.swing.JButton();
        btnAssignClerk = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Work Request ID", "pickUp Location", "dropOff Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 640, 190));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        btnAssignDriver.setText("ASSIGN A DRIVER");
        btnAssignDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDriverActionPerformed(evt);
            }
        });
        add(btnAssignDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        btnAssignClerk.setText("ASSIGN A CLERK");
        btnAssignClerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignClerkActionPerformed(evt);
            }
        });
        add(btnAssignClerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DeliveryAgentWorkArea sysAdminwjp = (DeliveryAgentWorkArea) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDriverActionPerformed
        // TODO add your handling code here:

//        int selectedRow = tblWorkRequests.getSelectedRow();
        int selectedRow = tblWorkRequests.getSelectedRow();

        WorkRequest workreq = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);

        if (workreq.getStatus().equals("Assigned to Driver")) {
            JOptionPane.showMessageDialog(null, "Already Assigned Work", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AssignDriverJPanel AssignDriver = new AssignDriverJPanel(userProcessContainer, user, workreq, system);
            userProcessContainer.add("Assign Driver", AssignDriver);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            workreq.setStatus("Req to Driver sent");
            populateWorkRequests();

        }


    }//GEN-LAST:event_btnAssignDriverActionPerformed

    private void btnAssignClerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignClerkActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();
        WorkRequest workreq = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);

        if (workreq.getStatus().equals("Assigned to Clerk")) {
            JOptionPane.showMessageDialog(null, "Already Assigned Work", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            //System.out.println("Reached else in assign driver button managing workreqs");
            AssignClerkJPanel AssignClerk = new AssignClerkJPanel(userProcessContainer, user, workreq, system);
            userProcessContainer.add("Assign Driver", AssignClerk);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            workreq.setStatus("Request to Clerk sent");
            populateWorkRequests();
        }
    }//GEN-LAST:event_btnAssignClerkActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateWorkRequests();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignClerk;
    private javax.swing.JButton btnAssignDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateWorkRequests() {
        WorkRequest workreq = new WorkRequest();

        workreq.setDeliveryAgencyAdminName("pavan");
        workreq.setDropOffLocation("curry center");
        workreq.setPickUpLocation("stop and shop");
        workreq.setPickUptime(null);
        workreq.setDropOfftime(null);

        if (user.getUsername().equals("pavan")) {
            user.getWorkQueue().addWorkRequesttoQueue(workreq);
        }

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();

//        for (UserAccount admin : system.getUserAccountDirectory().getUserAccountList()) {
//               
//           if(admin.getUsername().equals(user.getUsername())) {
//          
//             for(WorkRequest wr : user.getWorkQueue().getWorkQueue())
//             {
//                Object[] row = new Object[4];
//
//                row[0] = wr;
//                row[1] = wr.getPickUpLocation();
//                row[2] = wr.getDropOffLocation();
//                row[3] = wr.getStatus();
//
//                model.addRow(row);
//            
//              }
//        }       
//       } 
        int i = 0;
        for (WorkRequest admin : system.getWorkQueue().getWorkQueue()) {
            Object[] row = new Object[7];

            row[0] = admin;
            row[1] = admin.getProductList().getProductList().get(i).getProductName();
            row[2] = admin.getProductList().getProductList().get(i).getExpiryDate();
            row[3] = admin.getPickUpLocation();
            row[4] = admin.getDropOffLocation();
            row[5] = admin.getReceiver();
            row[6] = admin.getStatus();

            model.addRow(row);
            //i++;
        }
    }
}
