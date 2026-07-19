package com.testing.junit;

import Calc.Shapes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {
    Shapes shape = new Shapes();
    @Test
    public void testSquareArea(){

        assertEquals(4,shape.squareArea(2));
    }

    @Test
    public void testCircleArea(){
        assertEquals(3.14,shape.circleArea(1),0.01,"Calculation is wrong");
    }

    @Test
    public void testWrongSquareArea(){
        assertNotEquals(575,shape.squareArea(24));
    }

    @Test
    public void test_true(){
        String s = "junit";
        assertTrue(s.equals("junit"));

    }
}
