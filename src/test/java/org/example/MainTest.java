package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void fibonacci_whenNIs0_resultShouldBe0() {
        //GIVEN
        int n = 0;
        int expected = 0;
        //WHEN
        int actual = Main.fibonacci(n);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void fibonacci_whenNIs1_resultShouldBe1() {
        //GIVEN
        int n = 1;
        int expected = 1;
        //WHEN
        int actual = Main.fibonacci(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_whenNIs6_resultShouldBe8() {
        //GIVEN
        int n = 6;
        int expected = 8;
        //WHEN
        int actual = Main.fibonacci(n);
        //THEN
        assertEquals(expected, actual);
    }

}