package com.grigorian.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void shouldAddTwoNumbersCorrectly() {
        // arrange
        int a = 10;
        int b = 20;

        // act
        int result = calculatorService.add(a, b);

        // assert
        assertEquals(30, result, "10 + 20 = 30");
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(10, 0)
        );
        assertEquals("Division by zero is not allowed!", exception.getMessage());
    }
}
