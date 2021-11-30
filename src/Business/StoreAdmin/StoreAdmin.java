/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreAdmin;

import Business.Contribution.Contribution;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yashwanthsridharan
 */
public class StoreAdmin {
    int id = 301;
    private String Name;
    private String UserName;
    private String storeName;
    private ArrayList<Contribution> Contribution;
    
    //Constructor
    public StoreAdmin(String userName) {
        this.UserName = userName;
        Contribution=new ArrayList<>();
    }

    public ArrayList<Contribution> getContribution() {
        return Contribution;
    }

    public void setContribution(ArrayList<Contribution> Contribution) {
        this.Contribution = Contribution;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public void addContribution(Contribution contribution){
        if (Contribution == null ){
             this.Contribution=new ArrayList<>();
            this.Contribution.add(contribution);
            
            JOptionPane.showMessageDialog(null, "inside null");
        }else{
            Contribution.add(contribution);
            JOptionPane.showMessageDialog(null, "outside null");
        }
        
    }
    
    
}
