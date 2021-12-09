/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author ANIRUDH
 */
public class DriverDirectory {
    
    ArrayList<Driver> driverList;
    int count=0;

    public DriverDirectory() {
        driverList=new ArrayList<Driver>();
        count++;
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    
    public void addDrivertoList(Driver driver){
        driver.setDriverID(count);
        driverList.add(driver);
        count++;
    }
    
     public void removeDriverfromList(Driver driver)
    {
        driverList.remove(driver);
    }
    
    public Driver createDriver(String name,String uname, String password){
        Driver driver=new Driver();
        driver.setUserName(uname);
        driver.setFirstName(name);
        driver.setPassword(password);
        driverList.add(driver);
        return driver;
    }
    
   
    
    public void deleteDriver(String username){
        for(int i=0;i<driverList.size();i++){
            if(driverList.get(i).getUserName().equals(username)){
                driverList.remove(i);
            }
        }
    }
    
    
    public boolean checkifUserNameExists(String username)
    {
        for(Driver driver:driverList)
        {
            if(driver.getUserName().equals(username))
            {
                return true;
            }
        }
        return false;
    }
    
    
    public Driver ReturnexistingDriver(String username)
    {
        for(Driver driver:driverList)
        {
            if(driver.getUserName().equals(username))
            {
                return driver;
            }
        }
        return null;
    }
    
    
    
    
    public void updateDriverAccount(String oldusername, String name, String username, String password) {
        
        Driver driver=null;
        for(Driver dri:driverList)
        {
            if(dri.getUserName().equals(oldusername))
            {
                driver=dri;
            }
        }

        driver.setFirstName(name);
        driver.setUserName(username);
        driver.setPassword(password);
    }
    
    
    public void addWorkRequesttoDriver(Driver driver,WorkRequest workreq)
    {
        for(int i=0;i<driverList.size();i++)
        {
            if(driverList.get(i).getUserName().equals(driver.getUserName()))
            {
                driverList.get(i).getWorkQueue().addWorkRequesttoQueue(workreq);
            }
                
        }
    }
    
    
}
