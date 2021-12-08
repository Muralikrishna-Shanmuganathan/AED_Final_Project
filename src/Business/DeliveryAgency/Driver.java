/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.WorkQueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author ANIRUDH
 */

public class Driver extends Person {
    
    public long ssn;
    public int DriverID;
    public String DriverLicenseNumber;
    String UserName;
    String password;
    String photo;
    Date JoiningDate;
    Date SeperationDate;
    WorkQueue workQueue;
    String status = "available";
    //add timesheet
    //add workque


    public Driver() {
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getDriverID() {
        return DriverID;
    }

    public void setDriverID(int DriverID) {
        this.DriverID = DriverID;
    }

    public String getDriverLicenseNumber() {
        return DriverLicenseNumber;
    }

    public void setDriverLicenseNumber(String DriverLicenseNumber) {
        this.DriverLicenseNumber = DriverLicenseNumber;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(Date JoiningDate) {
        this.JoiningDate = JoiningDate;
    }

    public Date getSeperationDate() {
        return SeperationDate;
    }

    public void setSeperationDate(Date SeperationDate) {
        this.SeperationDate = SeperationDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
}
