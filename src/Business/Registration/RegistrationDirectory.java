/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Registration;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author murali
 */
public class RegistrationDirectory {
    
    private ArrayList<Registration> registrationList;
    private Registration registration;
    
    //Getters and Setters

    public ArrayList<Registration> getRegistrationList() {
        return registrationList;
    }

    public void setRegistrationList(ArrayList<Registration> registrationList) {
        this.registrationList = registrationList;
    }
    

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
    
    public Registration AddRegistration( Registration registration , String name, String role, String username, String password, String email, String phone, String carrier,  String location, String imagePath, String status ){
        registration = new Registration(name, role, username, password, email, phone, carrier, location, imagePath, status);
        registrationList.add(registration);
        
        return registration;
    }
    
    //Contructors
    public RegistrationDirectory(){
        this.registrationList = new ArrayList<Registration>();
    }
    
}