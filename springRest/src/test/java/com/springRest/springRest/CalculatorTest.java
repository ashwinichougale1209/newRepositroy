package com.springRest.springRest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.springTest.JunitEx.Calculator;

public class CalculatorTest {   
	
	
	Calculator calcObject;
@BeforeEach                                         
void setUp() {
    calcObject = new Calculator();
}
@Test                                               
@DisplayName("Add 2 numbers")   
void addTest() {
    assertEquals(15, calcObject.add(10, 5));  
}
@RepeatedTest(3)                                    
@DisplayName("Adding a number with zero to return the same number")
void testAddWithZero() {
    assertEquals(15, calcObject.add(0, 15));
}

@Test                                               
public void checkNumTest() {
    int num1 = 20;
    assertTrue(num1!=0,"Number is not equal to 0");
}

@Test                                               
public void checkNullTest() {
    int num1 = (Integer) null;
    assertNull(num1,"Number is null");
}

}