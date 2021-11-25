/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.VolunteerRole.VolunteerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author murali
 */
public class VolunteerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account);
    }
    
    
}
