package edu.bu.met.cs665;

public class BedroomBuilder implements RoomBuilder {
    private Room bedroom = new Room();

    public void addFurniture() {
        //diningRoom.setFurniture(furniture);
    }

    public void addAppliances() {

    }

    public void addPaint() {

    }

    public Room getRoom() {
        return this.bedroom;
    }
}
