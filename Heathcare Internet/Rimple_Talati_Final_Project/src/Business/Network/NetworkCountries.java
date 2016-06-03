/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class NetworkCountries {
    
    private String name;
    private ArrayList<NetworkStates> networkListStates;

    public NetworkCountries() {
        networkListStates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<NetworkStates> getNetworkListStates() {
        return networkListStates;
    }

    public void setNetworkListStates(ArrayList<NetworkStates> networkListStates) {
        this.networkListStates = networkListStates;
    }
    
    public NetworkStates createAndAddNetworkState() {
        NetworkStates networkStates = new NetworkStates();
        networkListStates.add(networkStates);
        return networkStates;
    }
    
    public boolean checkifStateUnique(String stateName){
        for(NetworkStates ns: networkListStates){
        if(ns.getName().equals(stateName)){
            return false;
            }
        }
        return true;
    }
    
    public void deleteNetworkState(NetworkStates networkStates){
        networkListStates.remove(networkStates);
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
