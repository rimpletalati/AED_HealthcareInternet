/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Forum;

import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PatientForum {
    private ArrayList<Stories>storiesList;

    public PatientForum(){
        storiesList = new ArrayList<>();
    }
    public ArrayList<Stories> getStoriesList() {
        return storiesList;
    }

    public void setStoriesList(ArrayList<Stories> storiesList) {
        this.storiesList = storiesList;
    }
   
}
