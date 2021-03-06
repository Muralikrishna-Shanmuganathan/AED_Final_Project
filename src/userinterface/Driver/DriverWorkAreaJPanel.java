/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Driver;

import Business.DeliveryAgency.Driver;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DriverWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    WorkQueue workQueue;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DriverWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;

        populateDriverTable();

        valueLabel.setText(account.getName());
    }

    public void populateDriverTable() {


        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (Driver user : system.getDriverDirectory().getDriverList()) {
            if (user.getUserName().equals(userAccount.getUsername())) {
                for (WorkRequest wr : user.getWorkQueue().getWorkQueue()) {
                    //System.out.println(user.getWorkQueue().getWorkQueue().size());
                    Object[] row = new Object[4];

                    row[0] = wr;
                    row[1] = wr.getPickUpLocation();
                    row[2] = wr.getDropOffLocation();
                    row[3] = wr.getStatus();

                    model.addRow(row);

                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Work ID", "Pickup Location", "Drop off Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 580, 130));

        btnProcess.setBackground(new java.awt.Color(67, 0, 163));
        btnProcess.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process Order");
        btnProcess.setToolTipText("");
        btnProcess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Driver Work Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Driver:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 70, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 158, 26));

        btnRefresh1.setBackground(new java.awt.Color(67, 0, 163));
        btnRefresh1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/refresh.png"))); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        add(btnRefresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRowIndex = workRequestJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            return;
        }

        WorkRequest wr = (WorkRequest) workRequestJTable.getValueAt(selectedRowIndex, 0);

        if (wr.getStatus().equals("Delivered")) {
            JOptionPane.showMessageDialog(null, " Order Already Delivered", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (wr.getStatus().equals("Assigned to Clerk")) {
            JOptionPane.showMessageDialog(null, "Not Approved by Clerk", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (wr.getStatus().equals("Req to Clerk sent")) {
            JOptionPane.showMessageDialog(null, "Not Approved by Clerk", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, wr, system);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        populateDriverTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
