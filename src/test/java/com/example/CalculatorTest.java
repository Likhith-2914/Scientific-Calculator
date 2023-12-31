package com.example;

import com.example.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */

    private Main calculator;

    @Test
    public void test_add_positive()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void test_add_negative()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    
    }

    @Test
    public void test_sub_positive()
    {
        int a = 1;
        int b = 2;
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, calculator.sub(a, b));
    }

    @Test
    public void test_sub_negative()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 1;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    
    }

    @Test
    public void test_mul_positive()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.mul(a, b));
    } 

    @Test
    public void test_mul_negative()
    {
        int a = 1;
        int b = 2;
        int expectedResult = 3;
    
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b));
    }

    @Test
    public void test_div_positive()
    {
        int a = 4;
        int b = 2;
        int expectedResult = 2;
    
        Assert.assertEquals(expectedResult, calculator.div(a, b));
    }

    @Test
    public void test_div_negative()
    {
        int a = 4;
        int b = 2;
        int expectedResult = 3;
    
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}
