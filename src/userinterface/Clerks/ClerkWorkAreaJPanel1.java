/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Clerks;

import Business.DeliveryAgency.Clerk;
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
public class ClerkWorkAreaJPanel1 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    WorkQueue workQueue;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    
    public ClerkWorkAreaJPanel1(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
      
        
        this.populateTable();
        
        valueLabel.setText(account.getName());
    }
    
    public void populateTable(){
        
        System.out.println("reached populate table in clerk work area");
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        System.out.println(system.getWorkQueue().getWorkQueue().size()+" system work que size clerk work area");  
        
        System.out.println(userAccount.getClerkList().getClerkList().size()+" clerk account --clerk directory size");
        System.out.println(system.getClerkDirectory().getClerkList().size()+" system account --clerk directory size");

       // for(Clerk user : system.getClerkDirectory().getClerkList())
        for (int i=0;i<system.getClerkDirectory().getClerkList().size();i++)
        {
            Clerk user=system.getClerkDirectory().getClerkList().get(i);
            System.out.println(user.getUserName()+ " "+userAccount.getUsername());
            if(user.getUserName().equals(userAccount.getUsername()))
            {
                for(WorkRequest wr : user.getWorkQueue().getWorkQueue()){
                System.out.println(user.getWorkQueue().getWorkQueue().size());   
                Object[] row = new Object[8];

                row[0] = wr.getWorkRequestID();
                row[1] = wr.getPickUptime();
                row[2] = wr.getDropOfftime();
                row[3] = wr.getPickUpLocation();
                row[4] = wr.getDropOffLocation();

                //row[5] = wr.getDriver().getFirstName();
                //row[6] = wr.getClerk().getFirstName();
                row[5] = wr.getStatus();
                row[6]=wr;

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
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Work ID", "Pickup time", "Dropoff time", "Pickup Location", "Drop off Location", "Status", "object", "driver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 780, 130));

        btnProcess.setText("PROCESS ORDER");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("CLERK PORTAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("WELCOME:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 158, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        
        int selectedRowIndex = workRequestJTable.getSelectedRow();
        
        if (selectedRowIndex < 0){
            return;
        }
        
        WorkRequest wr = (WorkRequest)workRequestJTable.getValueAt(selectedRowIndex, 6); 
        
        if(wr.getStatus().equals("Inspected")){
            JOptionPane.showMessageDialog(null," Order Already Inspected","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
        
        
        ProcessWorkRequestJPanel1 processWorkRequestJPanel = new ProcessWorkRequestJPanel1(userProcessContainer, wr,system);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        this.populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}