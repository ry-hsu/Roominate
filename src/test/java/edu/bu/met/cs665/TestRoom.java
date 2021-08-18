package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.Furnitures.*;

public class TestRoom {
    /**
     * Test Case 1.
     * Test Room object creation
     */
    @Test
    public void TestRoomSetup() {
        Room myroom = new Room();

        Chair ch1 = new Chair(2,2);
        myroom.addFurniture(ch1);

        assertEquals(1,myroom.getFurniture().size());
    }
    
}
