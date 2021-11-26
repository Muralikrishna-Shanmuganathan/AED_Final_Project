/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreAdmin;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class StoreAdminDirectory {
     private ArrayList<StoreAdmin> storeAdminDirectory;
    private StoreAdmin storeAdmin;

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
    
    //Construnctor
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
