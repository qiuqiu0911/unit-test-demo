package cn.qiudev.unittest.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("计算器测试类")
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

    @DisplayName("加法测试")
    @Test
    void add() {
        assertEquals(100, this.calculator.add(100L));
    }

    @DisplayName("减法测试")
    @Test
    void sub() {
        assertEquals(-100, this.calculator.sub(100));
    }
}