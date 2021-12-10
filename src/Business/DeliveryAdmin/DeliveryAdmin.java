/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAdmin;

import Business.Contribution.Contribution;
import Business.Products.Product;
import Business.Products.ProductList;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yashwanthsridharan
 */
public class DeliveryAdmin {
    private String Name;
    private String UserName;
    private String pickupTime;
    private String pickupLocation;
    private ArrayList<Contribution> contributionList;
    private ArrayList<WorkRequest> workRequestList;

    public DeliveryAdmin(String UserName) {
        this.UserName = UserName;
    }

    public void addWorkRequest(String storeName, String item, Date expDate, Date pickupTime, String pickupLocation) {
        WorkRequest workRequest = new WorkRequest();
        Product product = new Product();
        ProductList productList = new ProductList();
        product.setProductName(item);
        product.setExpiryDate(expDate.toString());
        productList.addProducttoList(product);
        workRequest.setPickUptime(pickupTime);
        workRequest.setPickUpLocation(pickupLocation);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void addContribution(String storeName, String item, String qty, String expDate, String status) {
        Contribution contribution = new Contribution(storeName, item, qty, expDate, status);
        contribution.setStoreName(storeName);
        contribution.setItem(item);
        contribution.setQuantity(qty);
        contribution.setExpiryDate(expDate);
        contribution.setStatus(status);
        contributionList.add(contribution);
    }

}
