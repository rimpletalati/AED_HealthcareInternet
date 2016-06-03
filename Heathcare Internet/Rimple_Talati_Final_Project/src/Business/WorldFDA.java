/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.WorldFDARole;
import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class WorldFDA extends Organization {

    private static WorldFDA worldFDA;

    public WorldFDA() {
        super(null);
    }

    public static WorldFDA getWorldFDA() {
        return worldFDA;
    }

    public static void setWorldFDA(WorldFDA worldFDA) {
        WorldFDA.worldFDA = worldFDA;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new WorldFDARole());
        return roleList;
    }
    
    
}
