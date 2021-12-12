/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Contributor.Contributor;
import Business.DeliveryAdmin.DeliveryAdmin;
import Business.DeliveryAgency.Clerk;
import Business.DeliveryAgency.Driver;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Distributor.Distributor;
import Business.EcoSystem;

import Business.Organization;
import Business.Receiver.Receiver;
import Business.Store.Store;
import Business.StoreAdmin.StoreAdmin;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.Registration.RegistrationJPanel;
import Business.DeliveryAgency.ClerkDirectory;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        populateTree();
    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode Contributor = new DefaultMutableTreeNode("Contributor");
        DefaultMutableTreeNode StoreAdmin = new DefaultMutableTreeNode("Store Admin");
        DefaultMutableTreeNode Store = new DefaultMutableTreeNode("Store");
        DefaultMutableTreeNode Volunteer = new DefaultMutableTreeNode("Volunteer");
        DefaultMutableTreeNode DeliveryAdmin = new DefaultMutableTreeNode("Delivery Admin");
        DefaultMutableTreeNode DeliveryAgent = new DefaultMutableTreeNode("Delivery Agent");
        DefaultMutableTreeNode Clerk = new DefaultMutableTreeNode("Clerk");
        DefaultMutableTreeNode Driver = new DefaultMutableTreeNode("Driver");
        DefaultMutableTreeNode Distributor = new DefaultMutableTreeNode("Distributor");
        DefaultMutableTreeNode Receiver = new DefaultMutableTreeNode("Receiver");

        ArrayList<Contributor> contList = ecosystem.getContributorDirectory().getContributorList();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(Contributor, 0);
        DefaultMutableTreeNode contributorNode;
        DefaultMutableTreeNode storeNode;
        DefaultMutableTreeNode storeAdminNode;
        DefaultMutableTreeNode volunteerNode;
        DefaultMutableTreeNode deliveryAdminNode;
        DefaultMutableTreeNode deliveryAgentNode;
        DefaultMutableTreeNode clerkNode;
        DefaultMutableTreeNode driverNode;
        DefaultMutableTreeNode distributorNode;
        DefaultMutableTreeNode receiverNode;

        //Contributor List
        Contributor contributor;

        for (int i = 0; i < contList.size(); i++) {
            contributor = contList.get(i);
            contributorNode = new DefaultMutableTreeNode(contributor.getUserName());
            Contributor.insert(contributorNode, i);
        }

        //StoreAdmin List
        ArrayList<StoreAdmin> storeAdminList = ecosystem.getStoreAdminDirectory().getStoreAdminDirectory();
        root.insert(StoreAdmin, 1);

        StoreAdmin storeAdmin;

        for (int i = 0; i < storeAdminList.size(); i++) {
            storeAdmin = storeAdminList.get(i);
            storeAdminNode = new DefaultMutableTreeNode(storeAdmin.getUserName());
            StoreAdmin.insert(storeAdminNode, i);
        }

        //Store List
        ArrayList<Store> storeList = ecosystem.getStoreDirectory().getStoreDirectory();
        root.insert(Store, 2);

        Store store;

        for (int i = 0; i < storeList.size(); i++) {
            store = storeList.get(i);
            storeNode = new DefaultMutableTreeNode(store.getUserName());
            Store.insert(storeNode, i);
        }

        //Volunteer List
        ArrayList<Volunteer> volunteerList = ecosystem.getVolunteerDirectory().getVolunteerList();
        root.insert(Volunteer, 3);

        Volunteer volunteer;

        for (int i = 0; i < volunteerList.size(); i++) {
            volunteer = volunteerList.get(i);
            volunteerNode = new DefaultMutableTreeNode(volunteer.getUserName());
            Volunteer.insert(volunteerNode, i);
        }

        //DeliveryAdmin List
        ArrayList<DeliveryAdmin> deliveryAdminList = ecosystem.getDeliveryAdminDirectory().getDeliverAdmin();
        root.insert(DeliveryAdmin, 4);

        DeliveryAdmin deliveryAdmin;

        for (int i = 0; i < deliveryAdminList.size(); i++) {
            deliveryAdmin = deliveryAdminList.get(i);
            deliveryAdminNode = new DefaultMutableTreeNode(deliveryAdmin.getUserName());
            DeliveryAdmin.insert(deliveryAdminNode, i);
        }

        //DeliveryAgent List
        ArrayList<DeliveryAgent> deliveryAgentList = ecosystem.getDeliveryAgentDirectory().getDeliveryAgentDirectory();
        root.insert(DeliveryAgent, 5);

        DeliveryAgent deliveryAgent;

        for (int i = 0; i < deliveryAgentList.size(); i++) {
            deliveryAgent = deliveryAgentList.get(i);
            deliveryAgentNode = new DefaultMutableTreeNode(deliveryAgent.getUserName());
            DeliveryAgent.insert(deliveryAgentNode, i);
        }

        //Clerk List
        ArrayList<Clerk> clerkList = ecosystem.getClerkDirectory().getClerkList();
        root.insert(Clerk, 6);

        Clerk clerk;

        for (int i = 0; i < clerkList.size(); i++) {
            clerk = clerkList.get(i);
            clerkNode = new DefaultMutableTreeNode(clerk.getUserName());
            Clerk.insert(clerkNode, i);
        }

        //Driver List
        ArrayList<Driver> driverList = ecosystem.getDriverDirectory().getDriverList();
        root.insert(Driver, 7);
        
        Driver driver;
        
        for ( int i = 0; i<driverList.size(); i++){
             driver = driverList.get(i);
             driverNode = new DefaultMutableTreeNode(driver.getUserName());
             Driver.insert(driverNode,i);
        }

        //Distributor List
        ArrayList<Distributor> distributorList = ecosystem.getDistributorDirectory().getDistributorDirectory();
        root.insert(Distributor, 8);

        Distributor distributor;

        for (int i = 0; i < distributorList.size(); i++) {
            distributor = distributorList.get(i);
            distributorNode = new DefaultMutableTreeNode(distributor.getUserName());
            Distributor.insert(distributorNode, i);
        }

        //Receiver List
        ArrayList<Receiver> receiverList = ecosystem.getReceiverDirectory().getReceiverList();
        root.insert(Receiver, 9);

        Receiver receiver;

        for (int i = 0; i < receiverList.size(); i++) {
            receiver = receiverList.get(i);
            receiverNode = new DefaultMutableTreeNode(receiver.getUserName());
            Receiver.insert(receiverNode, i);
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnManageVolunteer = new javax.swing.JButton();
        btnManageContributor = new javax.swing.JButton();
        btnManageStoreAdmin = new javax.swing.JButton();
        btnManageDeliveryAgent = new javax.swing.JButton();
        btnManageDistributor = new javax.swing.JButton();
        btnManageReceiver = new javax.swing.JButton();
        btnManageRegistration = new javax.swing.JButton();
        btnManageDeliveryAdmin = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        btnManageVolunteer.setText("Manage Volunteer");
        btnManageVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVolunteerActionPerformed(evt);
            }
        });

        btnManageContributor.setText("Manage Contributor");
        btnManageContributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageContributorActionPerformed(evt);
            }
        });

        btnManageStoreAdmin.setText("Manage Store Admin");
        btnManageStoreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStoreAdminActionPerformed(evt);
            }
        });

        btnManageDeliveryAgent.setText("Manage Delivery Agent");
        btnManageDeliveryAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryAgentActionPerformed(evt);
            }
        });

        btnManageDistributor.setText("Manage Distributor");
        btnManageDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDistributorActionPerformed(evt);
            }
        });

        btnManageReceiver.setText("Manage Receiver");
        btnManageReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReceiverActionPerformed(evt);
            }
        });

        btnManageRegistration.setText("Manage Registration");
        btnManageRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRegistrationActionPerformed(evt);
            }
        });

        btnManageDeliveryAdmin.setText("Manage Delivery Admin");
        btnManageDeliveryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageStoreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(btnManageDistributor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageContributor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageReceiver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDeliveryAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDeliveryAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageVolunteer)
                    .addComponent(btnManageContributor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageStoreAdmin)
                    .addComponent(btnManageDeliveryAdmin))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageDistributor)
                    .addComponent(btnManageReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageRegistration)
                    .addComponent(btnManageDeliveryAgent))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

//        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
//        if (selectedNode != null) {
//            lblSelectedNode.setText(selectedNode.toString());
//        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManageContributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageContributorActionPerformed
        // TODO add your handling code here:
        ManageContributorJPanel mcjp = new ManageContributorJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Contributors", mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageContributorActionPerformed

    private void btnManageVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVolunteerActionPerformed
        // TODO add your handling code here:
        ManageVolunteerJPanel mvjp = new ManageVolunteerJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Volunteers", mvjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVolunteerActionPerformed

    private void btnManageStoreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStoreAdminActionPerformed
        // TODO add your handling code here:
        ManageStoreAdminJPanel msajp = new ManageStoreAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Store Admins", msajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStoreAdminActionPerformed

    private void btnManageDeliveryAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryAgentActionPerformed
        // TODO add your handling code here:
        ManageDeliveryAgentJPanel mdajp = new ManageDeliveryAgentJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Delivery Agents", mdajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryAgentActionPerformed

    private void btnManageDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDistributorActionPerformed
        // TODO add your handling code here:
        ManageDistributorJPanel mdjp = new ManageDistributorJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Distributors", mdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDistributorActionPerformed

    private void btnManageRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRegistrationActionPerformed

        ManageRegistrationsJPanel rjp = new ManageRegistrationsJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Registrations", rjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRegistrationActionPerformed

    private void btnManageDeliveryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryAdminActionPerformed
        // TODO add your handling code here:
        ManageDeliveryAdminJPanel mdajp = new ManageDeliveryAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage DeliveryAdminJPanel", mdajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryAdminActionPerformed

    private void btnManageReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReceiverActionPerformed
        // TODO add your handling code here:
        ManageReceiverJPanel mrjp = new ManageReceiverJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Receiver JPanel", mrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageReceiverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageContributor;
    private javax.swing.JButton btnManageDeliveryAdmin;
    private javax.swing.JButton btnManageDeliveryAgent;
    private javax.swing.JButton btnManageDistributor;
    private javax.swing.JButton btnManageReceiver;
    private javax.swing.JButton btnManageRegistration;
    private javax.swing.JButton btnManageStoreAdmin;
    private javax.swing.JButton btnManageVolunteer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables
}
