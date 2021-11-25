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
public class VolunteerAdminDirectory {
    
   private ArrayList<VolunteerAdmin> volunteerList;
    
    public VolunteerAdminDirectory(){
        volunteerList = new ArrayList<VolunteerAdmin>();
    }
    public ArrayList<VolunteerAdmin> getVolunteerList() {
        return volunteerList;
        
    }
    
    public ArrayList<VolunteerAdmin> addVolunteer(VolunteerAdmin v){
       
        volunteerList.add(v);
        return volunteerList;
    }
     public ArrayList<VolunteerAdmin> removeVolunteer(VolunteerAdmin v){
       
        volunteerList.remove(v);
        return volunteerList;
     }
}
