/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Volunteer.VolunteerAdminDirectory;


import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Volunteer.VolunteerAdmin;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private VolunteerAdminDirectory volunteerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private WorkQueue workQueue;

    public EcoSystem(RestaurantDirectory restaurantDirectory,VolunteerAdminDirectory volunteerDirectory , DeliveryManDirectory deliveryManDirectory, WorkQueue workQueue) {

        this.restaurantDirectory = restaurantDirectory;
        this.volunteerDirectory = volunteerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        
        this.workQueue = workQueue;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
       return true;
    }
}
