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
    WorkQueue workqueue;
    
    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkQueue getWorkqueue() {
        if(workqueue==null)
        {
            workqueue=new WorkQueue();
        }
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
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
}
