/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerList;
    private Volunteer volunteer;

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    
    //Construnctor
        public VolunteerDirectory(){
        this.volunteerList = new ArrayList<Volunteer>();
    }
    
    //Create Contributor
    public Volunteer createVolunteer(String name, String role, String userName, String password, String email,String phone,String carrier,String location,String imgPath){
        volunteer = new Volunteer(name, role, userName, password, email, phone, carrier, location, imgPath);
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    //Delete Contributor
    public void deleteVolunteer(String username){
        for(int i=0;i<volunteerList.size();i++){
            if(volunteerList.get(i).getUserName().equals(username)){
                volunteerList.remove(i);
            }
        }
    }
}
