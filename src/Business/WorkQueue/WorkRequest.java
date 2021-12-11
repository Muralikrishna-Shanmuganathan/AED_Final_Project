/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DeliveryAgency.Clerk;
import Business.DeliveryAgency.Driver;
import Business.Products.ProductList;
import java.util.Date;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ANIRUDH
 */


public class WorkRequest {
    
    int workRequestID=(int)(Math.random()*1000)+1;
    //check for repetetion of workRequestID
    
    private String volunteerUName;
    private String DeliveryAgencyAdminName;
    private String Status;
    private String pickUpLocation;
    private String dropOffLocation;
    private Date pickUptime;
    private Date dropOfftime;
    private String VehicleNumber;  
    private Driver driver;
    private Clerk clerk;
    private ProductList productList;

    
    
     
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
   

    public WorkRequest() {
        productList=new ProductList();
        requestDate = new Date();
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public void setDeliveryAgencyAdminName(String DeliveryAgencyName) {
        this.DeliveryAgencyAdminName = DeliveryAgencyName;
    }

   

    public int getWorkRequestID() {
        return workRequestID;
    }

    public void setWorkRequestID(int workRequestID) {
        this.workRequestID = workRequestID;
    }

    public String getVolunteerUName() {
        return volunteerUName;
    }

    public void setVolunteerUName(String volunteerName) {
        this.volunteerUName = volunteerName;
    }

    public String getDeliveryAgencyAdminName() {
        return DeliveryAgencyAdminName;
    }


    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Date getPickUptime() {
        return pickUptime;
    }

    public void setPickUptime(Date pickUptime) {
        this.pickUptime = pickUptime;
    }

    public Date getDropOfftime() {
        return dropOfftime;
    }

    public void setDropOfftime(Date dropOfftime) {
        this.dropOfftime = dropOfftime;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }
    
    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

       @Override
    public String toString(){
        return String.valueOf(workRequestID);
    }
    
    
}
