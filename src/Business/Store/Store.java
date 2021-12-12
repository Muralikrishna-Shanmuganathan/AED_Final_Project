/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Store;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Business.Contribution.Contribution;

/**
 *
 * @author murali
 */
public class Store {
    int id = 301;
    private String Name;
    private String UserName;
    private String storeName;
    private String location;
    private String password;
    private ArrayList<Contribution> Contribution;
    
    //Constructor
    public Store(String storeName, String uname, String password, String location) {
        this.UserName = uname;
        this.location = location;
        this.storeName = storeName;
        this.password = password;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    public void addContribution(Contribution contribution){
        if (Contribution == null ){
             this.Contribution=new ArrayList<>();
            this.Contribution.add(contribution);
        }else{
            Contribution.add(contribution);
        }
        
    }
    @Override
    public String toString(){
        return storeName;
    }
    
}
