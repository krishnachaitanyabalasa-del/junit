package com.testing.junit;

import Calc.ReverseString;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseStringTest {

    @Test
    public void Test(){
        ReverseString rs = new ReverseString();
        assertEquals("olleH",rs.reverseString("Hello"));
    }


}
