package com.testing.junit;

import Calc.Shapes;
import org.junit.Test;

import java.time.Duration;
import java.util.Arrays;

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

    @Test
    public void arrayTesting(){
        int[] ex = {1,2,4,3};
        int[] act = {1,2,3,4};

        Arrays.sort(ex);
        assertArrayEquals(ex,act);
    }

    @Test
    public void durationTesting(){
        int[] ex = {1,2,4,3};
        int[] act = {1,2,3,4};

        assertTimeout(Duration.ofMillis(2),()->Arrays.sort(ex)); //if the process takes extra time it fails
    }
}
