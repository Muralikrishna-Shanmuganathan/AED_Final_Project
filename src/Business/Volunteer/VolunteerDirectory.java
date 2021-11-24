/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author murali
 */
public class VolunteerDirectory {
    
   private ArrayList<Volunteer> volunteerList;
    
    public VolunteerDirectory(){
        volunteerList = new ArrayList<Volunteer>();
    }
    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
        
    }
    
    public ArrayList<Volunteer> addVolunteer(Volunteer v){
       
        volunteerList.add(v);
        return volunteerList;
    }
     public ArrayList<Volunteer> removeVolunteer(Volunteer v){
       
        volunteerList.remove(v);
        return volunteerList;
     }
}
