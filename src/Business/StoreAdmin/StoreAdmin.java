/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreAdmin;

/**
 *
 * @author yashwanthsridharan
 */
public class StoreAdmin {
    int id = 301;
    private String Name;
    private String UserName;

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
    
    //Constructor
    public StoreAdmin(String userName) {
        this.UserName = userName;
    }
}
