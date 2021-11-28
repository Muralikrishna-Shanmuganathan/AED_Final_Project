/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

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
    
    
    
    
    
}
