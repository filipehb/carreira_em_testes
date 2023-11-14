package com.filipearruda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtraiTest {

    @Test
    public void testSubtrairNumerosPositivos() {
        float resultado = Subtrai.subtrair(5.0f, 3.0f);
        assertEquals(2.0f, resultado, 0.001f); // 0.001f é a margem de erro permitida
    }

    @Test
    public void testSubtrairNumerosNegativos() {
        float resultado = Subtrai.subtrair(-5.0f, -3.0f);
        assertEquals(-2.0f, resultado, 0.001f);
    }

    @Test
    public void testSubtrairZero() {
        float resultado = Subtrai.subtrair(0.0f, 0.0f);
        assertEquals(0.0f, resultado, 0.001f);
    }
}