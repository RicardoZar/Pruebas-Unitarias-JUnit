package com.generation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTddTest {
    CalculatorTdd calculatorTdd = new CalculatorTdd();

    @Test
    public void addTest()
    {
        assertEquals( 7, calculatorTdd.addNumbers( 5, 2 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculatorTdd.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculatorTdd.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 7, calculatorTdd.divideNumbers( 21, 3 ) );
    }
}
