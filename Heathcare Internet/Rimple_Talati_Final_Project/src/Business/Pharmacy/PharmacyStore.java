/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Pharmacy;

/**
 *
 * @author Rimple
 */
public class PharmacyStore {
    
    private int storeID;
    private String storeName;
    private String address;
    private String city;
    private String state;
    private String country;
    private static int count = 1;
    
    public PharmacyStore(){
        storeID = count;
        count++;
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PharmacyStore.count = count;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(storeID);
    }
    
}
