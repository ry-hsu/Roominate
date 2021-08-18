/**
 * CS665 Final Project - Roominate
 * 
 * <p>Builder class to build a dining room
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.Furnitures.*;
import java.awt.*;

public class DiningRoomBuilder implements RoomBuilder {
    private Room diningRoom; //dining room built by builder

    /**
     * Constructor.
     */
    public DiningRoomBuilder() {
        diningRoom = new Room();
    }

    /**
     * Add one Furniture object to the Room.
     */
    public void addFurniture(Furniture furn) {
        diningRoom.addFurniture(furn);
    }

    /**
     * Sets the paint color of the room.
     * @param c Color object to paint the room
     */
    public void addPaint(Color c) {
        diningRoom.setPaint(c);
    }

    /**
     * Return the builded room.
     */
    public Room getRoom() {
        return this.diningRoom;
    }

    /**
     * Default furniture to add to room. 
     */
    public void defFurniture() {
        diningRoom.addFurniture(new Table(15,14,20,27,"L"));
        diningRoom.addFurniture(new Chair(8,15));
        diningRoom.addFurniture(new Chair(8,25));
        diningRoom.addFurniture(new Chair(8,35));
        diningRoom.addFurniture(new Chair(37,15));
        diningRoom.addFurniture(new Chair(37,25));
        diningRoom.addFurniture(new Chair(37,35));
        diningRoom.addFurniture(new Dresser(2,2,30,5,"L"));
    }    
}
