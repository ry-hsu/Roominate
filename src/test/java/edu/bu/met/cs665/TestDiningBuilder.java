package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class TestDiningBuilder {
    /**
     * Test Case 1.
     * Test dining room with default furniture is built
     */
    @Test
    public void TestDiningRoomBuilderSetup() {
        DiningRoomBuilder db = new DiningRoomBuilder();
        db.defFurniture();
        Room rm = db.getRoom();


        List<Furniture> ft = rm.getFurniture();
        for (Furniture f : ft) {
            System.out.println(f.toString());
        }
        assertEquals(8,rm.getFurniture().size());
    }
}
