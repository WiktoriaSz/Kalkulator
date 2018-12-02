package com.exercise.calculator.model;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SimpleCalculationTest {

    private Data data;
    private SimpleCalculation simpleCalculation = new SimpleCalculation();;

    @Test
    public void testMath(){
        data = new Data(9,4);
        assertEquals(13, simpleCalculation.add(data.getA(), data.getB()));
        assertEquals(5, simpleCalculation.subtraction(data.getA(), data.getB()));
        assertEquals(36, simpleCalculation.multiplication(data.getA(), data.getB()));
        assertEquals(2.25,simpleCalculation.division(data.getA(), data.getB()), 0.0001);
        assertEquals(1, simpleCalculation.modulo(data.getA(), data.getB()));
        assertEquals(6561.0, simpleCalculation.powerOf(data.getA(), data.getB()), 0.0001);
        assertEquals(0.36, simpleCalculation.percentOf(data.getA(), data.getB()), 0.0001);


    }
}
