package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumWith1() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testSumWith3() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testSumWith0ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
    //some changes
}