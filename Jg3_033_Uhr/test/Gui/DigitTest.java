/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.time.LocalTime;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author User
 */
@RunWith(value = Parameterized.class)
public class DigitTest
{
    @Parameterized.Parameter(value = 0)
        public LocalTime time;
    @Parameterized.Parameter(value = 1)
        public int max;
    @Parameterized.Parameter(value = 2)
        public int startNumber;
    @Parameterized.Parameter(value = 3)
        public boolean ergPlus;
    
    @Parameterized.Parameters(name = "")
    public static Iterable<Object[]> data1()
    {
        
        return Arrays.asList(new Object[][]
        {
            {LocalTime.now(), 10,5,false}  
        });
                 
    }  
    
    public DigitTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of setIcon method, of class Digit.
     */


    /**
     * Test of addOne method, of class Digit.
     */
    @Test
    public void testAddOne()
    {
        
        Digit instance = new Digit(max);
        instance.setNumber(startNumber);
        
        boolean expResult = ergPlus;
        boolean result = instance.addOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetNumber()
    {
        System.out.println("getNumber");
        Digit instance = new Digit(max);
        instance.setNumber(startNumber);
        int expResult = startNumber;
        
        int result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Digit.
     */
    @Test
    public void testSetNumber()
    {
        System.out.println("setNumber");
        int number = 0;
        Digit instance = new Digit(max);
        instance.setNumber(startNumber);
        assertEquals(instance.getNumber(), startNumber);
    }
    
}
