/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receiver;

/**
 *
 * @author Yash
 */
import Business.EcoSystem;
import Business.Receiver.Receiver;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ReceiverAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceiverAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    public ReceiverAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        populateReceiverTable();
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
        tblReceiver = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReceiver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Expiry Date"
            }
        ));
        jScrollPane1.setViewportView(tblReceiver);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 580, 110));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Received Items");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReceiver;
    // End of variables declaration//GEN-END:variables

    private void populateReceiverTable() {
        DefaultTableModel model = (DefaultTableModel) tblReceiver.getModel();
        model.setRowCount(0);
        for (Receiver admin : ecosystem.getReceiverDirectory().getReceiverList()) {
            if (admin.getUserName().equals(userAccount.getUsername())) {
                Object[] row = new Object[2];
                int i = 0;
                for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkQueue()) {
                    row[0] = workRequest.getProductList().getProductList().get(i).getProductName();
                    row[1] = workRequest.getProductList().getProductList().get(i).getExpiryDate();
                    model.addRow(row);
                    i++;
                }
            }
        }
    }
}
