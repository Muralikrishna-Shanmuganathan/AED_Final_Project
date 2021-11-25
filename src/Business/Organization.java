/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.StoreAdmin.StoreAdminDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Volunteer.VolunteerAdminDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private VolunteerAdminDirectory volunteerAdminDirectory;
    private StoreAdminDirectory storeAdminDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Volunteer("Volunteer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        StoreAdmin("StoreAdmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        volunteerAdminDirectory = new VolunteerAdminDirectory();
        storeAdminDirectory = new StoreAdminDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public VolunteerAdminDirectory getVolunteerAdminDirectory() {
        return volunteerAdminDirectory;
    }

    public void setVolunteerAdminDirectory(VolunteerAdminDirectory volunteerAdminDirectory) {
        this.volunteerAdminDirectory = volunteerAdminDirectory;
    }

    public StoreAdminDirectory getStoreAdminDirectory() {
        return storeAdminDirectory;
    }

    public void setStoreAdminDirectory(StoreAdminDirectory storeAdminDirectory) {
        this.storeAdminDirectory = storeAdminDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
