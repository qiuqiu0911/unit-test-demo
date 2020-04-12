package cn.qiudev.unittest.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add() {
        assertEquals(100, this.calculator.add(100L));
    }

    @Test
    void sub() {
        assertEquals(-100, this.calculator.sub(100));
    }
}