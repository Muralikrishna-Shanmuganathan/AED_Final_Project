/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DeliveryAgency.Clerk;
import Business.DeliveryAgency.Driver;
import java.util.Date;

/**
 *
 * @author ANIRUDH
 */


public class WorkRequest {
    
    int workRequestID=(int)(Math.random()*1000)+1;
    //check for repetetion of workRequestID
    
    String volunteerName;
    String DeliveryAgencyName;
    String Status;
    String pickUpLocation;
    String dropOffLocation;
    Date pickUptime;
    Date dropOfftime;
    String VehicleNumber;  
    Driver driver;
    Clerk clerk;
   
    public WorkRequest() {
    }

    public int getWorkRequestID() {
        return workRequestID;
    }

    public void setWorkRequestID(int workRequestID) {
        this.workRequestID = workRequestID;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getDeliveryAgencyName() {
        return DeliveryAgencyName;
    }

    public void setDeliveryAgencyName(String DeliveryAgencyName) {
        this.DeliveryAgencyName = DeliveryAgencyName;
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
    
    
}
