/**
 * CS665 Final Project - Roominate
 * 
 * <p> Room class
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Room {
    private List<Furniture> furnList; //list of all furnitures in the room
    private ArrayList<String> appliances; //future release will add appliances
    private Color paint; //paint color of the room

    /**
     * Room Object Constructor.
     */
    public Room() {
        //instantiate appliance and furniture lists
        appliances = new ArrayList<String>();
        furnList = new ArrayList<Furniture>();
    }

    /**
     * Adds one piece of furniture to the room.
     * @param furniture Furniture to add
     */
    public void addFurniture(Furniture furniture) {
        this.furnList.add(furniture);
    }
    
    /**
     * Adds one appliance to the room.
     * This will be implemeneted in a future release.
     * @param appliances Applicance to add to the room
     */
    public void setAppliances(String appliances) {
        this.appliances.add(appliances);
    }

    /**
     * Sets the paint color of the room.
     * @param paint Color of paint 
     */
    public void setPaint(Color paint) {
        this.paint = paint;
    }

    /**
     * Returns list of furniture.
     * @return List<Furniture> furnList
     */
    public List<Furniture> getFurniture() {
        return furnList;
    }

    /**
     * Returns the paint color of the room.
     * @return String paint
     */
    public Color getPaint() {
        return paint;
    }

    /**
     * Clears the furniture list to start over
     */
    public void clearList() {
        furnList.clear();
    }
}
