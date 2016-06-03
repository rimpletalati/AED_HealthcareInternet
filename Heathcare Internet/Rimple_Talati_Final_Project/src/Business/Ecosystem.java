/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Forum.PatientForum;
import Business.Network.NetworkCities;
import Business.Network.NetworkCountries;
import Business.Network.NetworkStates;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class Ecosystem extends Organization {

    private static Ecosystem ecosystem;
    private ArrayList<NetworkCountries> networkListsCountries;
    private AdminAuthority adminAuthority;
    private WorldFDA worldFDA;
    private ManageDiseaseAdmin manageDiseaseAdmin;
    private PatientForum patientForum;
    private static Ecosystem sys2;

    public static Ecosystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();

        }
        return ecosystem;
    }

    private Ecosystem() {
        super(null);
        networkListsCountries = new ArrayList<>();
        adminAuthority = new AdminAuthority();
        worldFDA = new WorldFDA();
        manageDiseaseAdmin = new ManageDiseaseAdmin();
        patientForum = new PatientForum();
    }

    public AdminAuthority getAdminAuthority() {
        return adminAuthority;
    }

    public void setAdminAuthority(AdminAuthority adminAuthority) {
        this.adminAuthority = adminAuthority;
    }

    public WorldFDA getWorldFDA() {
        return worldFDA;
    }

    public void setWorldFDA(WorldFDA worldFDA) {
        this.worldFDA = worldFDA;
    }

    public ManageDiseaseAdmin getManageDiseaseAdmin() {
        return manageDiseaseAdmin;
    }

    public void setManageDiseaseAdmin(ManageDiseaseAdmin manageDiseaseAdmin) {
        this.manageDiseaseAdmin = manageDiseaseAdmin;
    }

    public PatientForum getPatientForum() {
        return patientForum;
    }

    public void setPatientForum(PatientForum patientForum) {
        this.patientForum = patientForum;
    }

    public ArrayList<NetworkCountries> getNetworkListsCountries() {
        return networkListsCountries;
    }

    public void setNetworkListsCountries(ArrayList<NetworkCountries> networkListsCountries) {
        this.networkListsCountries = networkListsCountries;
    }

    public NetworkCountries createAndAddNetworkCountry() {
        NetworkCountries networkCountries = new NetworkCountries();
        networkListsCountries.add(networkCountries);
        return networkCountries;
    }

    public void deleteNetworkCountry(NetworkCountries networkCountries) {
        networkListsCountries.remove(networkCountries);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkifCountryUnique(String countryName) {
        for (NetworkCountries nc : networkListsCountries) {
            if (nc.getName().equals(countryName)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        sys2 = DB4OUtil.getInstance().retrieveSystem();

        if (sys2.getAdminAuthority() != null) {
            for (UserAccount ua : sys2.getAdminAuthority().getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    return false;
                }
            }
        }

        if (sys2.getManageDiseaseAdmin() != null) {
            for (UserAccount ua : sys2.getManageDiseaseAdmin().getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    return false;
                }
            }
        }

        if (sys2.getWorldFDA() != null) {
            for (UserAccount ua : sys2.getWorldFDA().getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    return false;
                }
            }
        }

        for (NetworkCountries networkCountries : sys2.getNetworkListsCountries()) {
            for (NetworkStates networkStates : networkCountries.getNetworkListStates()) {
                for (NetworkCities networkCities : networkStates.getNetworkListCities()) {
                    for (Enterprise e : networkCities.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUsername().equals(username)) {
                                return false;
                            }
                        }
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                if (ua.getUsername().equals(username)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void getSystem(Ecosystem syss) {
        sys2 = syss;
    }


}
