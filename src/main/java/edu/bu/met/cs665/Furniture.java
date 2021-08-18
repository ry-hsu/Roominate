/**
 * CS665 Final Project - Roominate
 * 
 * <p>Furniture abstract class for all furniture types to be added.
 * The Furniture class extends Drawable which allows these objects to
 * be drawn in the GUI
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.awt.*;

public abstract class Furniture extends Drawable {

    //Possible shapes for the furniture
    public ArrayList<Options.Shape> SHAPES = new ArrayList<Options.Shape>();
    public Color color;
    public Options.Shape currentShape;

    /**
     * Returns list of possible shapes. 
     * This should be set in the default constructor of the furniture
     * @return ArrayList<Options.Shape> of possible shapes
     */
    public ArrayList<Options.Shape> getShapes() {
        return SHAPES;
    }

    /**
     * Return the current shape of the furniture.
     * @return Options.Shape of current shape
     */
    public Options.Shape getShape() {
        return currentShape;
    }

    /**
     * Sets the current shape of the furniture.
     * @return Options.Shape of current shape
     */
    public void setShape(Options.Shape shape) {
        if (SHAPES.contains(shape)) {
            currentShape = shape;
        }
    }

    /**
     * Returns the color of the furniture.
     * @return Color current color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Text to add to the GUI paint of the furniture.
     * The text is added to the upper-left hand of the 
     * furniture.
     * 
     * Suggested print is "Name ( width x height )"
     */
    public abstract String toString();
}
