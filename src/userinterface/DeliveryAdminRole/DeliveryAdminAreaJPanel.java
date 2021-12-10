/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryAdminRole;

import Business.Contribution.Contribution;
import Business.EcoSystem;
import Business.Store.Store;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashwanthsridharan
 */
public class DeliveryAdminAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public DeliveryAdminAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.user = account;
        this.system = system;

        populateContributionTable();
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
        tblStoreContribution = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStoreContribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Store Name", "Item", "Quantity", "Expiry Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblStoreContribution);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 580, 110));

        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStoreContribution.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Contribution contribution = (Contribution) tblStoreContribution.getValueAt(selectedRow, 0);
            if (contribution.getStatus().equals("Assigned to Agency")) {
                JOptionPane.showMessageDialog(null, "Already Assigned ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                UpdateDetailsJPanel udjp = new UpdateDetailsJPanel(userProcessContainer, user, contribution, system);
                userProcessContainer.add("UpdateDetailsJPanel", udjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStoreContribution;
    // End of variables declaration//GEN-END:variables

    private void populateContributionTable() {
         DefaultTableModel model = (DefaultTableModel) tblStoreContribution.getModel();

        model.setRowCount(0);

        for (Store admin : system.getStoreDirectory().getStoreDirectory()) {

            if ("Business.Role.DeliveryAdminRole".equals(user.getRole().getClass().getName())) {
                for (Contribution contribution : admin.getContribution()) {
                    Object[] row = new Object[5];
                    row[0] = contribution;
                    row[1] = contribution.getItem();
                    row[2] = contribution.getQuantity();
                    row[3] = contribution.getExpiryDate();
                    row[4] = contribution.getStatus();
                    model.addRow(row);
                }

            }
        }
    }
}
