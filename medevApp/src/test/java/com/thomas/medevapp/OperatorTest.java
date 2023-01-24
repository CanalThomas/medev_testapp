/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thomas.medevapp;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

/**
 *
 * @author mouche66
 */
public class OperatorTest {
    
    public OperatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        System.out.println("Hello Test");
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
  
    /**
     * Test of sum method, of class Operator.
     * @param argument entier
     */
    @org.junit.jupiter.api.Test
    @ParameterizedTest
    @ValueSource(ints = { 0,1,2,3,4,5 })
    public void testSum(int argument) {
        System.out.println("sum");
        int a = argument;
        int b = 7;
        int expResult = a+b;
        int result = Operator.sum(a, b);
        assertEquals(expResult, result);
        assertTrue(expResult==result);
        assertFalse(result!=expResult);
    }
    
    

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radare", "able was I ere I saw elba" })
    void test(String candidate) {
        boolean test = true;
        
        for (int i = 0; i < candidate.length(); i++) {
            if(candidate.charAt(i)!=candidate.charAt(candidate.length() -1 -i)){
                test=false;
                break;
            }
                
        }
        assertTrue(test);
    }



    /**
     * Test of multiplication method, of class Operator.
     */
    //@Disabled
    @org.junit.jupiter.api.Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 0;
        int b = 0;
        Operator instance = new Operator();
        int expResult = a*b;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of helloWorld method, of class Operator.
     */
    @org.junit.jupiter.api.Test
    public void testHelloWorld() {
        System.out.println("helloWorld");
        Operator instance = new Operator();
        String expResult = "Hello World";
        String result = instance.helloWorld();
        assertEquals(expResult, result);
    }
    
}
