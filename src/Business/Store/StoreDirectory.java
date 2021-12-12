/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Store;

import Business.Contribution.Contribution;
import Business.Store.Store;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author murali
 */
public class StoreDirectory {
     private ArrayList<Store> storeDirectory;
    private Store store;
    private Contribution contribution;

    public ArrayList<Store> getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreAdminDirectory(ArrayList<Store> storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public Store getStore() {
        return store;

    }

    public void setStore(Store store) {
        this.store = store;
    }
    
    public Contribution AddContribution(Store store,String storeName, String item, String qty, String date, String status){
        contribution=new Contribution(storeName, item, qty, date, status);
        
        store.addContribution(contribution);
        return contribution;
    }
    
    //Constructor
        public StoreDirectory(){
        this.storeDirectory = new ArrayList<Store>();
    }
    
    //Create Contributor
    public Store createStore(String storeName, String uname, String password, String location){
        store = new Store(storeName, uname, password, location);
        storeDirectory.add(store);
        return store;
    }
    
    //Delete Contributor
    public void deleteVolunteer(String username){
        for(int i=0;i<storeDirectory.size();i++){
            if(storeDirectory.get(i).getUserName().equals(username)){
                storeDirectory.remove(i);
            }
        }
    }
    
}
