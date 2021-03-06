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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Welcom Store Admin");

        btnDeleteStoreAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteStoreAdmin.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnDeleteStoreAdmin.setText("Delete Store");
        btnDeleteStoreAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeleteStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStoreAdminActionPerformed(evt);
            }
        });

        btnUpdateStoreAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateStoreAdmin.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnUpdateStoreAdmin.setText("Update Store");
        btnUpdateStoreAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdateStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStoreAdminActionPerformed(evt);
            }
        });

        btnViewAllStoreAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnViewAllStoreAdmin.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnViewAllStoreAdmin.setText("View All Stores");
        btnViewAllStoreAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewAllStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllStoreAdminActionPerformed(evt);
            }
        });

        btnAddStoreAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnAddStoreAdmin.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnAddStoreAdmin.setText("Add Store");
        btnAddStoreAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewAllStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnDeleteStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnAddStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateStoreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAllStoreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
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
