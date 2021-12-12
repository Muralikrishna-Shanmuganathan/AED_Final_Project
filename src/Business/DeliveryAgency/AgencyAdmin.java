/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ANIRUDH
 */
public class AgencyAdmin extends Person {
    
    String UserName; 
    String password; 
    EmployeeDirectory employeeList;
    DriverDirectory driverList;
    ClerkDirectory clerkList;
    WorkQueue workQueue;
    int workRequestCount=0;
    // add workRequestID

    public AgencyAdmin() {
        employeeList=new EmployeeDirectory();
        driverList=new DriverDirectory();
        clerkList=new ClerkDirectory();
        workQueue=new WorkQueue();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

    public DriverDirectory getDriverList() {
        return driverList;
    }

    public void setDriverList(DriverDirectory driverList) {
        this.driverList = driverList;
    }

    public ClerkDirectory getClerkList() {
        return clerkList;
    }

    public void setClerkList(ClerkDirectory clerkList) {
        this.clerkList = clerkList;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

}
