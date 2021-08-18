package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertArrayEquals;

import edu.bu.met.cs665.Furnitures.*;

public class TestFurniture {
    /**
     * Test Case 1.
     * Test creation of all types of furnitures
     */
    @Test
    public void TestFurnTypes() {
        Bed b = new Bed(2,2,20,20,"L");
        Chair c = new Chair(2,2);
        Dresser d = new Dresser(2,2,20,20,"L");
        Rug r = new Rug(2,2,20,20,"L");
        Table t = new Table(2,2,20,20,"L");

        String[] expected = {"Bed (20 in x 20 in)",
                             "Chair (4 in x 4 in)",
                             "Dresser (20 in x 20 in)",
                             "Rug (20 in x 20 in)",
                             "Table (20 in x 20 in)"};
        String[] actual = new String[5];
        actual[0] = b.toString();
        actual[1] = c.toString();
        actual[2] = d.toString();
        actual[3] = r.toString();
        actual[4] = t.toString();

        assertArrayEquals(expected, actual);
    }

    /**
     * Test Case 2.
     * Test prientation argument
     */
    @Test
    public void TestFurnOrientation() {
        Bed b = new Bed(2,2,10,20,"L");
        Bed b2 = new Bed(2,2,10,20,"H");

        String[] expected = {"Bed (10 in x 20 in)",
                             "Bed (20 in x 10 in)"};
        String[] actual = new String[2];
        actual[0] = b.toString();
        actual[1] = b2.toString();

        assertArrayEquals(expected, actual);
    }

    /**
     * Test Case 3.
     * Test setting a shape
     */
    @Test
    public void TestSetShape() {
        Table t = new Table(2,2,10,20,"L");

        t.setShape(Options.Shape.SQUARE);

        assertEquals(Options.Shape.SQUARE,t.getShape());
    }    

    /**
     * Test Case 4.
     * Test invalid shape setting
     */
    @Test
    public void TestInvalidSetShape() {
        Dresser d = new Dresser(2,2,10,20,"L");

        d.setShape(Options.Shape.SQUARE);

        assertNotEquals(Options.Shape.SQUARE, d.getShape());
    }   
    
}
