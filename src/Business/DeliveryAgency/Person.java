/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author ANIRUDH
 */
public class Person {
    
    public String FirstName; 
    public String LastName; 
    public String AptNumber;
    public String UserName;
    public String StreetName; 
    public String CommunityName; 
    public String City; 
    public String State;
    public String PhoneNumber;
    public String role;
    UserAccount admin;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    

    public Person() {
        //this.admin=superadmin;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAptNumber() {
        return AptNumber;
    }

    public void setAptNumber(String AptNumber) {
        this.AptNumber = AptNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    /*

    public AgencyAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(AgencyAdmin admin) {
        this.admin = admin;
    }
    */
    
    
    /*  to get the workqueue of the delivery agency organisation from managers 
    
    public static void main(String[] args) {
        AgencyAdmin superadmin=new AgencyAdmin();
        Person person=new Person(superadmin);
        WorkRequest work=person.getAdmin().getWorkQueue().getWorkQueue().get(1);
    }
    
    */
    
}


