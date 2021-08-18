/**
 * CS665 Final Project - Roominate
 * 
 * <p>Abstract class that contains necessary details for a object to be drawn 
 * in the GUI.
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

public abstract class Drawable {
    public int R_X; //Upper-left x coordinate to start painting object
    public int R_Y; //Upper-left x coordinate to start painting object
    public int R_WIDTH; //Width of object
    public int R_HEIGHT; //Height of object

    /**
     * Sets the dimension variables for the object. 
     * 
     * @param x Upper-left x coordinate to start painting object
     * @param y Upper-left x coordinate to start painting object
     * @param width Width of object
     * @param height Height of object
     * @param ori Orientation of the width and height, L means as is, anything else will flip the width and height
     */
    public void setDim(double x, double y,double width, double height,String ori) {
        // In order to keep numbers relatively understandable the dimensions will be 
        // scalled by 10
        R_X = (int)x*10;
        R_Y = (int)y*10;

        // Swap the width and height if the orientation is flipped
        if (ori.equals("L")) {
            R_WIDTH = (int)width*10;
            R_HEIGHT = (int)height*10;
        }
        else {
            R_WIDTH = (int)height*10;
            R_HEIGHT = (int)width*10; 
        }
    }
}
