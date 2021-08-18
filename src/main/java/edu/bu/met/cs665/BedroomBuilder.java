/**
 * CS665 Final Project - Roominate
 * 
 * <p>Builder class to build a bedroom
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.Furnitures.*;
import java.awt.*;

public class BedroomBuilder implements RoomBuilder {
    private Room bedroom; //bedroom built by builder

    /**
     * Constructor
     */
    public BedroomBuilder() {
        bedroom = new Room();

        //default furniture step
        this.defFurniture();

        //default paint step
        this.addPaint(Color.WHITE);
    }

    /**
     * Add one Furniture object to the Room.
     */
    public void addFurniture(Furniture furn) {
        bedroom.addFurniture(furn);
    }

    /**
     * Sets the paint color of the room.
     * @param c Color object to paint the room
     */
    public void addPaint(Color c) {
        bedroom.setPaint(c);
    }

    /**
     * Return the builded room.
     */
    public Room getRoom() {
        return this.bedroom;
    }
    
    /**
     * Default furniture to add to room. 
     */
    public void defFurniture() {
        bedroom.addFurniture(new Bed(2,3,30,15,"L"));
        bedroom.addFurniture(new Dresser(42,3,25,7,"H"));
        Table tb = new Table(2,30,9,15,"L");
        tb.setShape(Options.Shape.RECTANGLE);
        bedroom.addFurniture(tb);
        bedroom.addFurniture(new Chair(12,35));
    }

    /**
     * Clear furniture list
     */
    public void clearFurnList() {
        bedroom.clearList();
    }
}


/************************************************************************
 * Examples of furniture to add to a room
 * These can be copied and pasted into the defFurniture() funtion and 
 * called when creating the builder object to add them to the room.
 ************************************************************************/
/**     
 *      //BEDROOM with Bed,Dresser,Table,Chair
 * 
 *      BedRoom 1
 *      bedroom.addFurniture(new Bed(2,3,30,15,"L"));
        bedroom.addFurniture(new Dresser(42,3,25,7,"H"));
        Table tb = new Table(2,30,9,15,"L");
        tb.setShape(Options.Shape.RECTANGLE);
        bedroom.addFurniture(tb);
        bedroom.addFurniture(new Chair(12,35));
 */

 
/**
 *      //BEDROOM with 2 Beds,2 Dressers,Table
 * 
 *      BedRoom 2
        bedroom.addFurniture(new Bed(2,3,30,15,"L"));
        bedroom.addFurniture(new Bed(2,30,30,15,"L"));
        bedroom.addFurniture(new Dresser(42,3,13,7,"H"));
        bedroom.addFurniture(new Dresser(42,30,13,7,"H"));
        Table tb = new Table(2,19,7,9,"L");
        tb.setShape(Options.Shape.RECTANGLE);
        bedroom.addFurniture(tb);
 */
