package org.experis.learning.java_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add() {
       assertEquals(8f, calc.add(3, 5));

       assertThrows(IllegalArgumentException.class, ()-> calc.add(Float.parseFloat("a"), 2));
       assertThrows(IllegalArgumentException.class, ()-> calc.add(2, Float.parseFloat("b")));
    }

    @Test
    void subtract() {
        assertEquals(10f, calc.subtract(14, 4));

        assertThrows(IllegalArgumentException.class, ()-> calc.add(Float.parseFloat("a"), 2));
        assertThrows(IllegalArgumentException.class, ()-> calc.add(2, Float.parseFloat("b")));
    }

    @Test
    void divide() {
        assertEquals(2f, calc.divide(10, 5));

        assertThrows(IllegalArgumentException.class, ()-> calc.divide(2, 0));
        assertThrows(IllegalArgumentException.class, ()-> calc.add(Float.parseFloat("a"), 2));
        assertThrows(IllegalArgumentException.class, ()-> calc.add(2, Float.parseFloat("b")));
    }

    @Test
    void multiply() {
        assertEquals(12, calc.multiply(3, 4));

        assertThrows(IllegalArgumentException.class, ()-> calc.add(Float.parseFloat("a"), 2));
        assertThrows(IllegalArgumentException.class, ()-> calc.add(2, Float.parseFloat("b")));
    }
}