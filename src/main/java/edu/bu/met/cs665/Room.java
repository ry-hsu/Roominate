package edu.bu.met.cs665;

import java.util.ArrayList;

public class Room {
    private ArrayList<String> furniture;
    private ArrayList<String> appliances;
    private String paint;

    public Room() {}

    public void setFurniture(ArrayList<String> furniture) {
        this.furniture = furniture;
    }
    
    public void setAppliances(ArrayList<String> appliances) {
        this.appliances = appliances;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }
}
