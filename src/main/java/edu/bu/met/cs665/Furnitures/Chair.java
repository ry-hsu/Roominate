/**
 * CS665 Final Project - Roominate
 * 
 * <p>Chair Furniture Class
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665.Furnitures;

import edu.bu.met.cs665.*;

public class Chair extends Furniture {
    
    /**
     * Chair Constructor.
     * The Chair width and height is restricted to 4 and 4 for easier planning during drawing.
     * @param x Upper-left x coordinate to start painting object
     * @param y Upper-left x coordinate to start painting object
     */
    public Chair(int x, int y) {
        super.SHAPES.add(Options.Shape.RECTANGLE);

        //default shape is Rectangle
        super.setShape(Options.Shape.RECTANGLE);
        //default width and height of 4 is set here
        super.setDim(x, y,4,4,"L");
    }

    /**
     * Tag of the object to print on the GUI.
     * This appears at the upper-left corner of the object
     */
    public String toString() {
        String str = String.format("Chair (%d in x %d in)",super.R_WIDTH/10,super.R_HEIGHT/10);
        return str;
    }
}
