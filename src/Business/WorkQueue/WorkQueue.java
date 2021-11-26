/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author ANIRUDH
 */
public class WorkQueue {
    ArrayList<WorkRequest> workQueue;
    //add workRequestID

    public WorkQueue() {
        workQueue=new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(ArrayList<WorkRequest> workQueue) {
        this.workQueue = workQueue;
    }
    
    public void addWorkRequesttoQueue(WorkRequest workRequest)
    {
        workQueue.add(workRequest);
    }
    
    public void removeWorkRequestfromQueue(WorkRequest workRequest)
    {
        workQueue.remove(workRequest);
    }
    
    
}
