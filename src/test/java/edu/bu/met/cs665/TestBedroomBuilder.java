package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.awt.*;

import edu.bu.met.cs665.Furnitures.*;

public class TestBedroomBuilder {
    /**
     * Test Case 1.
     * Test bedroom with default furniture is built
     */
    @Test
    public void TestBedroomBuilderDefaultFurniture() {
        BedroomBuilder bb = new BedroomBuilder();
        //bb.defFurniture();
        Room rm = bb.getRoom();

        List<Furniture> ft = rm.getFurniture();
        for (Furniture f : ft) {
            System.out.println(f.toString());
        }
        assertEquals(4,rm.getFurniture().size());
    }

    /**
     * Test Case 2.
     * Test room paint is added
     */
    @Test
    public void TestBedroomPaint() {
        BedroomBuilder bb = new BedroomBuilder();
        //bb.defFurniture();
        bb.addPaint(Color.GREEN);
        Room rm = bb.getRoom();
        assertEquals(Color.GREEN, rm.getPaint());
    }

    @Test
    public void TestBedroomAddFurniture() {
        BedroomBuilder bb = new BedroomBuilder();
        bb.clearFurnList();
        bb.addFurniture(new Bed(2,3,20,40,"L"));
        
        Room rm = bb.getRoom();

        assertEquals(1, rm.getFurniture().size());
    }
}
