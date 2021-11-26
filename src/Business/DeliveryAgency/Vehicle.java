/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import java.util.Date;

/**
 *
 * @author ANIRUDH
 */
public class Vehicle {
    
     public int VehicleID;
     public String VehicleNumber;
     public String ModelNumber;
     public String VehicleName;
     public String Manufacturer;
     public String InsuranceNumber;
     public Date LastMaintenanceDate;

    public Vehicle() {
    }

    public int getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(int VehicleID) {
        this.VehicleID = VehicleID;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String VehicleName) {
        this.VehicleName = VehicleName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getInsuranceNumber() {
        return InsuranceNumber;
    }

    public void setInsuranceNumber(String InsuranceNumber) {
        this.InsuranceNumber = InsuranceNumber;
    }

    public Date getLastMaintenanceDate() {
        return LastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date LastMaintenanceDate) {
        this.LastMaintenanceDate = LastMaintenanceDate;
    }
     
     
     
}
