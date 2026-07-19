package com.testing.junit;

import Calc.Shapes;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBeforeAfter {

    @BeforeAll
    void beforeAll(){  //here no need to set static here because we set TestInstance lifecycle as perClass
        System.out.println("Before All tests");
    }

    @AfterAll
    void afterAll(){
        System.out.println("After all tests");
    }

    Shapes shape;

    @BeforeEach //before each test it executes and creates an object
    void init(){
        this.shape = new Shapes();
        System.out.println("Before Test");
    }

    @Test
    public void testSquareArea(){
        assertEquals(4,shape.squareArea(2));
        System.out.println("Actual Test");
    }

    @Test
    public void testCircleArea(){
        assertEquals(3.14,shape.circleArea(1),0.01,"Calculation is wrong");
        System.out.println("Actual Test");
    }

    @AfterEach
    void destroy(){
        System.out.println("we are destroying the object");
        shape = null;
    }
}
