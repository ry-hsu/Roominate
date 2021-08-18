/**
 * CS665 Final Project - Roominate
 * 
 * <p> Interface for all Builders for different rooms
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

import java.awt.*;

public interface RoomBuilder {
    public void addFurniture(Furniture furn);
    public void addPaint(Color c);
    public Room getRoom();
}
