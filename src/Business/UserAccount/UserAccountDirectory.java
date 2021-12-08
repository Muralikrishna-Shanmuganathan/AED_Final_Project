/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    //Check if user is authentic
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    //Create a new user account
    public UserAccount createUserAccount(String name, String username, String password, Employee employee, Role role) {
        System.out.println("reached create user account function");
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    //Delet an useraccount
    public void deleteUserAccount(UserAccount user) {
        userAccountList.remove(user);
    }

    //Update an useraccount
    public void updateUserAccount(UserAccount user, String name, String username, String password) {

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
    }

    //Check if username is unique
    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    
    public UserAccount searchUser(String username)
    {
        UserAccount uaccnt=null;
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                uaccnt=ua;
            }
        }
        return uaccnt;
    }
}
