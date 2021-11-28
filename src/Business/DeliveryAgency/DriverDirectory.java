/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

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
    
    public Driver createDriver(String uname){
        Driver driver=new Driver();
        driver.setFirstName(uname);
        return driver;
    }
    
   
    
    public void deleteDriver(String username){
        for(int i=0;i<driverList.size();i++){
            if(driverList.get(i).getUserName().equals(username)){
                driverList.remove(i);
            }
        }
    }
    
    
}
