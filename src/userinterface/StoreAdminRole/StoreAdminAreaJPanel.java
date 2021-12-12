/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashwanthsridharan
 */
public class StoreAdminAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreAdminAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    public StoreAdminAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        
        jLabel1.setText(" Welcome "+account.getUsername());
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
        btnDeleteStoreAdmin = new javax.swing.JButton();
        btnUpdateStoreAdmin = new javax.swing.JButton();
        btnViewAllStoreAdmin = new javax.swing.JButton();
        btnAddStoreAdmin = new javax.swing.JButton();

        jLabel1.setText("Welcom Store Admin");

        btnDeleteStoreAdmin.setText("Delete Store");
        btnDeleteStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStoreAdminActionPerformed(evt);
            }
        });

        btnUpdateStoreAdmin.setText("Update Store");
        btnUpdateStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStoreAdminActionPerformed(evt);
            }
        });

        btnViewAllStoreAdmin.setText("View All Stores");
        btnViewAllStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllStoreAdminActionPerformed(evt);
            }
        });

        btnAddStoreAdmin.setText("Add Store");
        btnAddStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStoreAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewAllStoreAdmin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnUpdateStoreAdmin)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeleteStoreAdmin)
                                    .addComponent(btnAddStoreAdmin))))))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(btnAddStoreAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteStoreAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateStoreAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnViewAllStoreAdmin)
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteStoreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStoreAdminActionPerformed
        // TODO add your handling code here:
        DeleteStoreJPanel acjp = new DeleteStoreJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Add Store", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeleteStoreAdminActionPerformed

    private void btnUpdateStoreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStoreAdminActionPerformed
        // TODO add your handling code here:
        UpdateStoreJPanel acjp = new UpdateStoreJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Add Store", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateStoreAdminActionPerformed

    private void btnAddStoreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStoreAdminActionPerformed

        AddStoreJPanel acjp = new AddStoreJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Add Store", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddStoreAdminActionPerformed

    private void btnViewAllStoreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllStoreAdminActionPerformed
        ViewStoreJPanel acjp = new ViewStoreJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("View Store", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAllStoreAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStoreAdmin;
    private javax.swing.JButton btnDeleteStoreAdmin;
    private javax.swing.JButton btnUpdateStoreAdmin;
    private javax.swing.JButton btnViewAllStoreAdmin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
