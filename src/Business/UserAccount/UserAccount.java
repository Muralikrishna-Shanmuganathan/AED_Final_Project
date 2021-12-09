/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.DeliveryAgency.ClerkDirectory;
import Business.DeliveryAgency.DriverDirectory;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String name;
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private DriverDirectory driverList;
    private ClerkDirectory clerkList;

    

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        if(workQueue==null)
        {
            workQueue=new WorkQueue();
        }
        return workQueue;
    }
    
    
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public DriverDirectory getDriverList() {
        if(driverList==null)
        {
            driverList=new DriverDirectory();
        }
        return driverList;
    }

    public void setDriverList(DriverDirectory driverList) {
        this.driverList = driverList;
    }


    public ClerkDirectory getClerkList() {
        if(clerkList==null)
        {
            clerkList=new ClerkDirectory();
        }
        return clerkList;
    }

    public void setClerkList(ClerkDirectory clerkList) {
        this.clerkList = clerkList;
    }
    
    
    /*@Override
    public String toString() {
        return username;
    }*/
    
}