/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contributor;

import java.util.ArrayList;

/**
 *
 * @author yashwanthsridharan
 */
public class ContributorDirectory {
    private ArrayList<Contributor> contributorList;
    private Contributor contributor;
    
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
    
    //Contructors
    public ContributorDirectory(){
        this.contributorList = new ArrayList<Contributor>();
    }
    
    //Create Contributor
    public Contributor createContributor(String uName){
        contributor = new Contributor(uName);
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
