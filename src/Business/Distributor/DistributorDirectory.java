/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class DistributorDirectory {
    private ArrayList<Distributor> distributorDirectory;
    private Distributor distributor;

    public ArrayList<Distributor> getDistributorDirectory() {
        return distributorDirectory;
    }

    public void setDistributorDirectory(ArrayList<Distributor> distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
    //Construnctor
        public DistributorDirectory(){
        this.distributorDirectory = new ArrayList<Distributor>();
    }
    
    //Create
    public Distributor createDistributor(String uname){
        
        distributor = new Distributor(uname);
        distributorDirectory.add(distributor);
        return distributor;
    }
    
    //Delete
    public void deleteDistributor(String username){
        for(int i=0;i<distributorDirectory.size();i++){
            if(distributorDirectory.get(i).getUserName().equals(username)){
                distributorDirectory.remove(i);
            }
        }
    }
}
