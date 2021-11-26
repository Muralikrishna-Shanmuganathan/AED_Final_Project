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
    
}
