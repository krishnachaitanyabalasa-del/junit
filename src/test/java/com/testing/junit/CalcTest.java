package com.testing.junit;

import Calc.Calc;
import org.junit.Test;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    public void test(){
        Calc c = new Calc();
        assertEquals(2,c.divide(10,2));
    }
}
