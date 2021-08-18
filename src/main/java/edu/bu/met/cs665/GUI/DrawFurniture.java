/**
 * CS665 Final Project - Roominate
 * 
 * <p>DrawFurniture draws all furnitures on a JPanel
 * 
 * @author Ryan Hsu
 */

package edu.bu.met.cs665.GUI;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import edu.bu.met.cs665.*;

public class DrawFurniture extends JPanel {

    private List<Furniture> furnList; //list of Furnitures to draw

    /**
     * DrawFurniture constructor
     * @param furns List of type Furniture to paint
     */
    public DrawFurniture(List<Furniture> furns) {
        this.furnList = furns;
    }

    /**
     * Paint all Furniture objects in furnList
     * @param g Graphics for paint
     */
    public void paintAllFurniture(Graphics g) {

        //Draw Room boundary
        g.setColor(Color.BLACK);
        g.drawRect(10,10,500,500);

        // For each furniture get the shape and prtin
        for(Furniture f : this.furnList) {
            if (f.getShape().equals(Options.Shape.RECTANGLE)) {
                System.out.println("Drawing " + f.toString());

                g.setColor(Color.BLUE);
                g.drawRect(f.R_X,f.R_Y,f.R_WIDTH,f.R_HEIGHT);
                g.drawString(f.toString(),f.R_X,f.R_Y);

            }
            else if (f.getShape() == Options.Shape.CIRCLE) {
                System.out.println("Drawing " + f.toString());

                g.setColor(Color.BLUE);
                g.fillOval(f.R_X,f.R_Y,f.R_WIDTH,f.R_HEIGHT);
                g.drawString(f.toString(), (f.R_WIDTH+f.R_X)/2, (f.R_HEIGHT+f.R_Y)/2);                
            }
            else {System.out.println("FAILING");}            
        }
    }

    /**
     * Override of JPanel paintComponet
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintAllFurniture(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100 + 2 * 10, 100 + 2 * 10);
    }
}
