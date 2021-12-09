/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author yashwanthsridharan
 */
public class Volunteer {
    int id = 201;
    private String Name;
    private String UserName;
    private WorkQueue workqueue;
    
    //Getters and Setters
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
    public Volunteer(String userName) {
        this.UserName = userName;
    }
    
    public WorkQueue getWorkqueue() {
        if(workqueue==null)
        {
            workqueue=new WorkQueue();
        }
        return workqueue;
    }
}
