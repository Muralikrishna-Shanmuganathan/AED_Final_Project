/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryAgency;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ANIRUDH
 */
public class EmployeeDirectory {
    
    ArrayList<Person> employeeList;

    public EmployeeDirectory() {
        employeeList=new ArrayList<Person>();
    }

    public ArrayList<Person> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Person> employeeList) {
        this.employeeList = employeeList;
    }
    
    public void addPersontoEmployeeList(Person person)
    {
        employeeList.add(person);
    }
    
    
    public void removePersonfromEmployeeList(Person person)
    {
        employeeList.remove(person);
    }
    
    public Person createPerson(String uname)
    {
        Person person =new Person();
        person.setFirstName(uname);
        return person;
    }
    
    
    public void deletePerson(String username){
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getUserName().equals(username)){
                employeeList.remove(i);
            }
        }
    }
    
}
