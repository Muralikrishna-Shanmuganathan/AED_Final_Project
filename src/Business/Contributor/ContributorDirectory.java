/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contributor;

import Business.Contribution.Contribution;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yashwanthsridharan
 */
public class ContributorDirectory {
    private ArrayList<Contributor> contributorList;
    private Contributor contributor;
    private Contribution contribution;
    
    //Getters and Setters
    public ArrayList<Contributor> getContributorList() {
        return contributorList;
    }

    public void setContributorList(ArrayList<Contributor> contributorList) {
        this.contributorList = contributorList;
    }

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }
    
    public Contribution AddContribution( Contributor contributor,String storeName, String item, String qty, String date, String status){
        contribution=new Contribution(storeName, item, qty, date, status);
        
        contributor.addContribution(contribution);
        return contribution;
    }
    
    //Contructors
    public ContributorDirectory(){
        this.contributorList = new ArrayList<Contributor>();
    }
    
    //Create Contributor
    public Contributor createContributor(String name, String role, String userName, String password, String email,String phone,String carrier,String location,String imgPath){
        contributor = new Contributor(name, role, userName, password, email, phone, carrier, location, imgPath);
        contributorList.add(contributor);
        return contributor;
    }
    
    //Delete Contributor
    public void deleteContributor(String username){
        for(int i=0;i<contributorList.size();i++){
            if(contributorList.get(i).getUserName().equals(username)){
                contributorList.remove(i);
            }
        }
    }
}
