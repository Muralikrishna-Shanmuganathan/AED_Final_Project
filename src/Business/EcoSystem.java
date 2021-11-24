/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Contributor.ContributorDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Distributor.DistributorDirectory;
import Business.Receiver.ReceiverDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.StoreAdmin.StoreAdminDirectory;
import Business.Volunteer.VolunteerDirectory;
import BusinessDeliveryAgent.DeliveryAgentDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    //Project
    private VolunteerDirectory volunteerDirectory;
    private ContributorDirectory contributorDirectory;
    private StoreAdminDirectory storeAdminDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private DistributorDirectory distributorDirectory;
    private ReceiverDirectory receiverDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, 
            VolunteerDirectory volunteerDirectory, ContributorDirectory contributorDirectory, StoreAdminDirectory storeAdminDirectory, 
            DeliveryAgentDirectory deliveryAgentDirectory, DistributorDirectory distributorDirectory, ReceiverDirectory receiverDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        //Project
        this.volunteerDirectory = volunteerDirectory;
        this.contributorDirectory = contributorDirectory;
        this.storeAdminDirectory = storeAdminDirectory;
        this.deliveryAgentDirectory = deliveryAgentDirectory;
        this.distributorDirectory = distributorDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        // networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
}
