/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author murali
 */
public class VolunteerAdmin extends UserAccount {
    
    private String volunteerName;
    private String volunteerPhoneNumber;
    private String volunteerEmail;
    private String volunteerPhoto;

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerPhoneNumber() {
        return volunteerPhoneNumber;
    }

    public void setVolunteerPhoneNumber(String volunteerPhoneNumber) {
        this.volunteerPhoneNumber = volunteerPhoneNumber;
    }

    public String getVolunteerEmail() {
        return volunteerEmail;
    }

    public void setVolunteerEmail(String volunteerEmail) {
        this.volunteerEmail = volunteerEmail;
    }

    public String getVolunteerPhoto() {
        return volunteerPhoto;
    }

    public void setVolunteerPhoto(String volunteerPhoto) {
        this.volunteerPhoto = volunteerPhoto;
    }
    
    @Override
    public String toString() {
        return volunteerName;
    }
    
}
