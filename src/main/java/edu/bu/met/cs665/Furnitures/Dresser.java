/**
 * CS665 Final Project - Roominate
 * 
 * <p>Dresser Furniture Class
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665.Furnitures;

import edu.bu.met.cs665.*;

public class Dresser extends Furniture {

    /**
     * Dresser Constructor.
     * The Chair width and height is restricted to 4 and 4 for easier planning during drawing.
     * @param x Upper-left x coordinate to start painting object
     * @param y Upper-left x coordinate to start painting object
     * @param width Width of object
     * @param height Height of object
     * @param ori Orientation of the width and height, L means as is, anything else will flip the width and height* 
     */
    public Dresser(int x,int y,int width, int length,String ori) {
        super.SHAPES.add(Options.Shape.RECTANGLE);
        //default shape is Rectangle
        super.setShape(Options.Shape.RECTANGLE);
        super.setDim(x, y,width,length,ori);
    }

    /**
     * Tag of the object to print on the GUI.
     * This appears at the upper-left corner of the object
     */
    public String toString() {
        String str = String.format("Dresser (%d in x %d in)",super.R_WIDTH/10,super.R_HEIGHT/10);
        return str;
    }
}