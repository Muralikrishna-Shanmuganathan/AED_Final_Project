/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author ANIRUDH
 */

public class ClerkDirectory {
    
    ArrayList<Clerk> clerkList;
    int count=0;

    public ClerkDirectory() {
        clerkList=new ArrayList<Clerk>();
        count++;
    }

    public ArrayList<Clerk> getClerkList() {
        return clerkList;
    }

    public void setClerkList(ArrayList<Clerk> clerkList) {
        this.clerkList = clerkList;
    }
    
    public void addClerktoList(Clerk clerk)
    {
        clerk.setClerkID(count);
        clerkList.add(clerk);
        count++;
    }
    
    public void removeclerkfromList(Clerk clerk)
    {
        clerkList.remove(clerk);
    }
    
    
    public Clerk createClerk(String uname){
      Clerk clerk=new Clerk();
      clerk.setFirstName(uname);
      return clerk;
    }
    
   
    
    public void deleteClerk(String username){
        for(int i=0;i<clerkList.size();i++){
            if(clerkList.get(i).getUserName().equals(username)){
                clerkList.remove(i);
            }
        }
    }
    
    
    public Clerk createClerk(String name,String uname, String password){
        Clerk clerk=new Clerk();
        clerk.setUserName(uname);
        clerk.setFirstName(name);
        clerk.setPassword(password);
        clerkList.add(clerk);
        return clerk;
    }
    
   
   
    public boolean checkifUserNameExists(String username)
    {
        for(Clerk clerk:clerkList)
        {
            if(clerk.getUserName().equals(username))
            {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    public void updateClerkAccount(String oldusername, String name, String username, String password) {
        
        Clerk clerk=null;
        for(Clerk cle:clerkList)
        {
            if(cle.getUserName().equals(oldusername))
            {
                clerk=cle;
            }
        }

        clerk.setFirstName(name);
        clerk.setUserName(username);
        clerk.setPassword(password);
    }
    
    
    public void addWorkRequesttoClerk(Clerk clerk,WorkRequest workreq)
    {
        for(int i=0;i<clerkList.size();i++)
        {
            if(clerkList.get(i).getUserName().equals(clerk.getUserName()))
            {
                clerkList.get(i).getWorkQueue().addWorkRequesttoQueue(workreq);
            }
                
        }
    }
    
    
    
    
    
}
