/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAdmin;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class DeliveryAdminDirectory {

    private ArrayList<DeliveryAdmin> deliveryAdminDirectory;

    private DeliveryAdmin deliveryAdmin;

    public ArrayList<DeliveryAdmin> getDeliverAdmin() {
        return deliveryAdminDirectory;
    }

    public void setDeliverAdmin(ArrayList<DeliveryAdmin> deliveryAdminDirectory) {
        this.deliveryAdminDirectory = deliveryAdminDirectory;
    }

    public DeliveryAdmin getDeliveryAdmin() {
        return deliveryAdmin;
    }

    public void setDeliveryAdmin(DeliveryAdmin deliveryAdmin) {
        this.deliveryAdmin = deliveryAdmin;
    }

    public DeliveryAdminDirectory() {
        deliveryAdminDirectory = new ArrayList<DeliveryAdmin>();
    }

    public DeliveryAdmin createDeliveryAdmin(String uName) {
        deliveryAdmin = new DeliveryAdmin(uName);
        deliveryAdminDirectory.add(deliveryAdmin);
        return deliveryAdmin;
    }

    public void deleteDeliveryAdmin(String username) {
        for (int i = 0; i < deliveryAdminDirectory.size(); i++) {
            if (deliveryAdminDirectory.get(i).getUserName().equals(username)) {
                deliveryAdminDirectory.remove(i);
            }
        }
    }
}
