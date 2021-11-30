/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contribution;

/**
 *
 * @author murali
 */
public class Contribution {
    
    private String item;
    private String quantity;
    private String expiryDate;
    private String storeName;
    private String status;
    
    public Contribution(String storeName, String item, String qty, String date, String status){
        this.storeName = storeName;
        this.item=item;
        this.quantity=qty;
        this.expiryDate=date;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    @Override
    public String toString(){
        return storeName;
    }
    
    
}
