/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.EcoSystem;

/**
 *
 * @author ANIRUDH
 */
public abstract class Role {
    
    public enum RoleType{
        DeliveryAgencyAdmin("DeliveryAgencyAdmin"),
        FleetManager("FleetManager"),
        Driver("Driver"),
        InspectionManager("InspectionManager"),
        Clerk("Clerk"),
        //Project
        Volunteer("Volunteer"),
        Contributor("Contributor"),
        Distributor("Distributor"),
        StoreAdmin("StoreAdmin"),
        StoreManager("StoreManager"),
        DeliveryAdmin("DeliveryAdmin"),
        DeliveryAgent("DeliveryAgent"),
        Receiver("Receiver");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value; 
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
