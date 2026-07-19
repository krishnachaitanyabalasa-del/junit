package com.testing.junit;

import Calc.Shapes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
