package com.mavendemo.designpatterns;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
	 {
	     /**
	      * Create the test case
	      *
	      * @param testName name of the test case
	      */
	     public AppTest( String testName )
	     {
	         super(testName);
	     }
	     public static TestSuite Suite()
	     {
	         return new TestSuite(AppTest.class);
	     }
	     /**
	      * @return the suite of tests being tested
	      */
	     

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
