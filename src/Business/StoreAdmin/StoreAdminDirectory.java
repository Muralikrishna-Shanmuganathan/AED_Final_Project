/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreAdmin;

import Business.Contribution.Contribution;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yashwanthsridharan
 */
public class StoreAdminDirectory {
    private ArrayList<StoreAdmin> storeAdminDirectory;
    private StoreAdmin storeAdmin;
    private Contribution contribution;

    public ArrayList<StoreAdmin> getStoreAdminDirectory() {
        return storeAdminDirectory;
    }

    public void setStoreAdminDirectory(ArrayList<StoreAdmin> storeAdminDirectory) {
        this.storeAdminDirectory = storeAdminDirectory;
    }

    public StoreAdmin getStoreAdmin() {
        return storeAdmin;

    }

    public void setStoreAdmin(StoreAdmin storeAdmin) {
        this.storeAdmin = storeAdmin;
    }
    
    public Contribution AddContribution(StoreAdmin storeAdmin,String storeName, String item, String qty, String date, String status){
        contribution=new Contribution(storeName, item, qty, date, status);
        
        storeAdmin.addContribution(contribution);
        JOptionPane.showMessageDialog(null, "inside store admin direcotry");
        return contribution;
    }
    
    //Constructor
        public StoreAdminDirectory(){
        this.storeAdminDirectory = new ArrayList<StoreAdmin>();
       
    }
    
    //Create Contributor
    public StoreAdmin createStoreAdmin(String uName){
        storeAdmin = new StoreAdmin(uName);
        storeAdminDirectory.add(storeAdmin);
        return storeAdmin;
    }
    
    //Delete Contributor
    public void deleteVolunteer(String username){
        for(int i=0;i<storeAdminDirectory.size();i++){
            if(storeAdminDirectory.get(i).getUserName().equals(username)){
                storeAdminDirectory.remove(i);
            }
        }
    }
}
