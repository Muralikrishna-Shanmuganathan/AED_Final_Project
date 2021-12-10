/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Contributor.ContributorDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgency.ClerkDirectory;
import Business.DeliveryAgency.DriverDirectory;
import Business.DeliveryAgency.FleetManagerDirectory;
import Business.DeliveryAgency.InspectionManagerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Distributor.DistributorDirectory;
import Business.Receiver.ReceiverDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.StoreAdmin.StoreAdminDirectory;
import Business.Volunteer.VolunteerDirectory;
import Business.DeliveryAgent.DeliveryAgentDirectory;
import java.util.ArrayList;
import Business.Contribution.Contribution;
import Business.WorkQueue.WorkQueue;
import Business.Store.Store;
import Business.Store.StoreDirectory;
import Business.DeliveryAdmin.DeliveryAdminDirectory;
import Business.Registration.RegistrationDirectory;


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
    private DriverDirectory driverDirectory;
    private ClerkDirectory clerkDirectory;
    private FleetManagerDirectory fleetManagerDirectory;
    private InspectionManagerDirectory inspectionManagerDirectory;
    private Contribution contribution;
    private StoreDirectory storeDirectory;
    private WorkQueue workQueue;
    private DeliveryAdminDirectory deliveryAdminDirectory;
    private RegistrationDirectory registrationDirectory;


    //Contructor
    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,
            VolunteerDirectory volunteerDirectory, ContributorDirectory contributorDirectory, StoreAdminDirectory storeAdminDirectory,
            DeliveryAgentDirectory deliveryAgentDirectory, DistributorDirectory distributorDirectory, ReceiverDirectory receiverDirectory, DriverDirectory driverDirectory, ClerkDirectory clerkDirectory,
            FleetManagerDirectory fleetManagerDirectory, InspectionManagerDirectory inspectionManagerDirectory, Contribution contribution, StoreDirectory storeDirectory, DeliveryAdminDirectory deliveryAdminDirectory, RegistrationDirectory registrationDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        //Project
        this.volunteerDirectory = volunteerDirectory;
        this.contributorDirectory = contributorDirectory;
        this.storeAdminDirectory = storeAdminDirectory;
        this.deliveryAgentDirectory = deliveryAgentDirectory;
        this.distributorDirectory = distributorDirectory;
        this.receiverDirectory = receiverDirectory;
        this.driverDirectory = driverDirectory;
        this.clerkDirectory = clerkDirectory;
        this.fleetManagerDirectory = fleetManagerDirectory;
        this.inspectionManagerDirectory = inspectionManagerDirectory;
        this.contribution = contribution;
        this.storeDirectory = storeDirectory;
        this.deliveryAdminDirectory = deliveryAdminDirectory;
        this.registrationDirectory = registrationDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public static void setInstance(EcoSystem business) {
        EcoSystem.business = business;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        if (volunteerDirectory == null) {
            volunteerDirectory = new VolunteerDirectory();
        }
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public ContributorDirectory getContributorDirectory() {
        if (contributorDirectory == null) {
            contributorDirectory = new ContributorDirectory();
        }
        return contributorDirectory;
    }

    public void setContributorDirectory(ContributorDirectory contributorDirectory) {
        this.contributorDirectory = contributorDirectory;
    }

    public StoreAdminDirectory getStoreAdminDirectory() {
        if (storeAdminDirectory == null) {
            storeAdminDirectory = new StoreAdminDirectory();
        }
        return storeAdminDirectory;
    }

    public void setStoreAdminDirectory(StoreAdminDirectory storeAdminDirectory) {
        this.storeAdminDirectory = storeAdminDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        if (deliveryAgentDirectory == null) {
            deliveryAgentDirectory = new DeliveryAgentDirectory();
        }
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public DistributorDirectory getDistributorDirectory() {
        if (distributorDirectory == null) {
            distributorDirectory = new DistributorDirectory();
        }
        return distributorDirectory;
    }

    public void setDistributorDirectory(DistributorDirectory distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public ReceiverDirectory getReceiverDirectory() {
        if (receiverDirectory == null) {
            receiverDirectory = new ReceiverDirectory();
        }
        return receiverDirectory;
    }

    public void setReceiverDirectory(ReceiverDirectory receiverDirectory) {
        this.receiverDirectory = receiverDirectory;
    }

    public DriverDirectory getDriverDirectory() {

        if (driverDirectory == null) {
            driverDirectory = new DriverDirectory();
        }
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public ClerkDirectory getClerkDirectory() {
        if (clerkDirectory == null) {
            clerkDirectory = new ClerkDirectory();
        }
        return clerkDirectory;
    }

    public void setClerkDirectory(ClerkDirectory clerkDirectory) {
        this.clerkDirectory = clerkDirectory;
    }

    public FleetManagerDirectory getFleetManagerDirectory() {
        if (fleetManagerDirectory == null) {
            fleetManagerDirectory = new FleetManagerDirectory();
        }
        return fleetManagerDirectory;
    }

    public void setFleetManagerDirectory(FleetManagerDirectory fleetManagerDirectory) {
        this.fleetManagerDirectory = fleetManagerDirectory;
    }

    public InspectionManagerDirectory getInspectionManagerDirectory() {
        if (inspectionManagerDirectory == null) {
            inspectionManagerDirectory = new InspectionManagerDirectory();
        }
        return inspectionManagerDirectory;
    }

    public void setInspectionManagerDirectory(InspectionManagerDirectory inspectionManagerDirectory) {
        this.inspectionManagerDirectory = inspectionManagerDirectory;
    }

    public StoreDirectory getStoreDirectory() {
        if (storeDirectory == null) {
            storeDirectory = new StoreDirectory();
        }
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public void setContribution(Contribution contribution) {
        this.contribution = contribution;
    }
    
     public DeliveryAdminDirectory getDeliveryAdminDirectory() {
        if (deliveryAdminDirectory == null) {
            deliveryAdminDirectory = new DeliveryAdminDirectory();
        }
        return deliveryAdminDirectory;
    }

    public void setDeliveryAdminDirectory(DeliveryAdminDirectory deliveryAdminDirectory) {
        this.deliveryAdminDirectory = deliveryAdminDirectory;
    }
    public RegistrationDirectory getRegistrationDirectory() {
        if(registrationDirectory == null){
            registrationDirectory = new RegistrationDirectory();
        }
        return registrationDirectory;
    }

    public void setRegistrationDirectory(RegistrationDirectory registrationDirectory) {
        this.registrationDirectory = registrationDirectory;
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
