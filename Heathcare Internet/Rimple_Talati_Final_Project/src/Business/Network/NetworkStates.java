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
public class NetworkStates {
    private String name;
    private ArrayList<NetworkCities> networkListCities;

    public NetworkStates() {
        this.networkListCities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<NetworkCities> getNetworkListCities() {
        return networkListCities;
    }

    public void setNetworkListCities(ArrayList<NetworkCities> networkListCities) {
        this.networkListCities = networkListCities;
    }
    
    public NetworkCities createAndAddNetworkCity() {
        NetworkCities networkCities = new NetworkCities();
        networkListCities.add(networkCities);
        return networkCities;
    }
    
    public boolean checkifCityUnique(String cityName){
        for(NetworkCities nc: networkListCities){
        if(nc.getName().equals(cityName)){
            return false;
            }
        }
        return true;
    }
    
    public void deleteNetworkState(NetworkCities networkCities){
        networkListCities.remove(networkCities);
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
