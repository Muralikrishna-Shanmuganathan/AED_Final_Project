/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreAdmin;

import java.util.ArrayList;

/**
 *
 * @author murali
 */
public class StoreAdminDirectory {
    
    private ArrayList<StoreAdmin> storeList;
    
    public StoreAdminDirectory(){
        storeList = new ArrayList<StoreAdmin>();
    }
    public ArrayList<StoreAdmin> getStoreAdminList() {
        return storeList;   
    }
    
    public ArrayList<StoreAdmin> addStoreAdmin(StoreAdmin store){
       
        storeList.add(store);
        return storeList;
    }
     public ArrayList<StoreAdmin> removeStoreAdmin(StoreAdmin store){
       
        storeList.remove(store);
        return storeList;
     }   
}