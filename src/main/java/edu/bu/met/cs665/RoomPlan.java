package edu.bu.met.cs665;

import java.util.ArrayList;

public class RoomPlan {
    private ArrayList<String> furniture;
    private ArrayList<String> appliances;
    private String paint;
    String roomName;

    public RoomPlan(String roomName) {
        this.roomName = roomName;
    }

    public void addFurniture(ArrayList<String> furniture) {
        this.furniture = furniture;
    }

    public void addAppliances(ArrayList<String> appliances) {
        this.appliances = appliances;
    }

    public void addPaint(String paint) {
        this.paint = paint;
    }

    public ArrayList<String> getFurniture() {
        return this.furniture;
    }

    public ArrayList<String> getAppliances() {
        return this.appliances;
    }

    public String getPaint() {
        return this.paint;
    }

}
