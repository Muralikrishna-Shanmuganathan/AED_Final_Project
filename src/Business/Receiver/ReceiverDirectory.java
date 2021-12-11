/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Receiver;

import Business.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class ReceiverDirectory {
     private ArrayList<Receiver> receiverList;
    private Receiver receiver;

    public ArrayList<Receiver> getReceiverList() {
        return receiverList;
    }

    public void setReceiverList(ArrayList<Receiver> receiverList) {
        this.receiverList = receiverList;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    
    public ReceiverDirectory() {
        receiverList = new ArrayList<Receiver>();
    }
    
    //Create Receiver
    public Receiver createReceiver(String name, String role, String userName, String password, String email,String phone,String carrier,String location,String imgPath){
        receiver = new Receiver(name, role, userName, password, email, phone, carrier, location, imgPath);
        receiverList.add(receiver);
        return receiver;
    }
    
    //Delete Receiver
    public void deleteVolunteer(String username){
        for(int i=0;i<receiverList.size();i++){
            if(receiverList.get(i).getUserName().equals(username)){
                receiverList.remove(i);
            }
        }
    }
}
