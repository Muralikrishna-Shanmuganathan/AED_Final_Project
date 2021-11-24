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
public class Volunteer {
    
    private String volunteerName;
    private long volunteerPhoneNumber;
    private String volunteerDateOfBirth;
    private String volunteerPassportNumber;
    private String volunteerEmail;
    private String volunteerCity;
    private String volunteerPhoto;
    private String volunteerAddress;

    public String getVolunteerAddress() {
        return volunteerAddress;
    }

    public void setVolunteerAddress(String volunteerAddress) {
        this.volunteerAddress = volunteerAddress;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    private String UserName;

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public long getVolunteerPhoneNumber() {
        return volunteerPhoneNumber;
    }

    public void setVolunteerPhoneNumber(long volunteerPhoneNumber) {
        this.volunteerPhoneNumber = volunteerPhoneNumber;
    }

    public String getVolunteerDateOfBirth() {
        return volunteerDateOfBirth;
    }

    public void setVolunteerDateOfBirth(String volunteerDateOfBirth) {
        this.volunteerDateOfBirth = volunteerDateOfBirth;
    }

    public String getVolunteerPassportNumber() {
        return volunteerPassportNumber;
    }

    public void setVolunteerPassportNumber(String volunteerPassportNumber) {
        this.volunteerPassportNumber = volunteerPassportNumber;
    }

    public String getVolunteerEmail() {
        return volunteerEmail;
    }

    public void setVolunteerEmail(String volunteerEmail) {
        this.volunteerEmail = volunteerEmail;
    }

    public String getVolunteerCity() {
        return volunteerCity;
    }

    public void setVolunteerCity(String volunteerCity) {
        this.volunteerCity = volunteerCity;
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
