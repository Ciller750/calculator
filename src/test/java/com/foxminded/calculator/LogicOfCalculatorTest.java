package com.foxminded.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicOfCalculatorTest {
    private final static LogicOfCalculator cal = new LogicOfCalculator();

    @Test
    public void testResultOfAddition() {
        assertEquals(12, cal.calculation(9, 3, "+"));
    }

    @Test
    public void testResultOfSubtraction() {
        assertEquals(6, cal.calculation(9, 3, "-"));
    }

    @Test
    public void testResultOfMultiplication() {
        assertEquals(27, cal.calculation(9, 3, "*"));
    }

    @Test
    public void testResultOfDivision() {
        assertEquals(3, cal.calculation(9, 3, "/"));
    }

    @Test
    public void testShouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> cal.calculation(5, 0, "/"));
    }

    @Test
    public void testShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> cal.calculation(5, 0, "z"));
    }
}
