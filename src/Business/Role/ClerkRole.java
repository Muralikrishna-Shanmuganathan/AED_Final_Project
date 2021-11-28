/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author ANIRUDH
 */
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Clerks.ClerkWorkArea;
import userinterface.DeliveryAgentRole.DeliveryAgentWorkArea;
import userinterface.Driver.DriverWorkArea;

/**
 *
 * @author ANIRUDH
 */
public class ClerkRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new ClerkWorkArea(userProcessContainer, account, business);
    
}

    public ClerkRole() {
    }
    
}