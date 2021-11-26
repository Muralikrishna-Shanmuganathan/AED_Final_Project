/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgent;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class DeliveryAgentDirectory {
    private ArrayList<DeliveryAgent> deliveryAgentDirectory;
    private DeliveryAgent deliveryAgent;

    public ArrayList<DeliveryAgent> getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(ArrayList<DeliveryAgent> deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }
    
    //Construnctor
        public DeliveryAgentDirectory(){
        this.deliveryAgentDirectory = new ArrayList<DeliveryAgent>();
    }
    
    //Create Delivery Agent
    public DeliveryAgent createDeliveryAgent(String uName){
        deliveryAgent = new DeliveryAgent(uName);
        deliveryAgentDirectory.add(deliveryAgent);
        return deliveryAgent;
    }
    
    //Delete Delivery Agent
    public void deleteDeliveryAgent(String username){
        for(int i=0;i<deliveryAgentDirectory.size();i++){
            if(deliveryAgentDirectory.get(i).getUserName().equals(username)){
                deliveryAgentDirectory.remove(i);
            }
        }
    }
}
