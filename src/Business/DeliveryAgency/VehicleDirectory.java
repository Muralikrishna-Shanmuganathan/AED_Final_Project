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
public class VehicleDirectory {
    
    ArrayList<Vehicle> vehicleList;
    int count=0;

    public VehicleDirectory() {
        vehicleList=new ArrayList<Vehicle>();
        count++;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    
    public void addVehicletoList(Vehicle vehicle)
    {
        vehicle.setVehicleID(count);
        vehicleList.add(vehicle);
        count++;
    }
    
    public void removeVehiclefromList(Vehicle vehicle)
    {
        vehicleList.remove(vehicle);
    }
}
