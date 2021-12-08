/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryAgency;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */


public class AgencyAdminDirectory {
    
    ArrayList<AgencyAdmin> deliveryagencyAdminList;

    public AgencyAdminDirectory() {
        deliveryagencyAdminList=new ArrayList<AgencyAdmin>();
    }

    public ArrayList<AgencyAdmin> getDeliveryagencyAdminList() {
        if(deliveryagencyAdminList==null)
        {
            deliveryagencyAdminList=new ArrayList<AgencyAdmin>();
        }
        return deliveryagencyAdminList;
    }

    public void setDeliveryagencyAdminList(ArrayList<AgencyAdmin> deliveryagencyAdminList) {
        this.deliveryagencyAdminList = deliveryagencyAdminList;
    }
    
    
    public void addAgencyAdmintoList(AgencyAdmin admin)
    {
        deliveryagencyAdminList.add(admin);
    }
    
    public void removeAgencyAdminfromList(AgencyAdmin admin)
    {
        deliveryagencyAdminList.remove(admin);
    }
    
}
