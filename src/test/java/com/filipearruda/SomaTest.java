package com.filipearruda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomaTest {

    @Test
    void somar() {
        //Given
        float expected = 2;

        //When
        float result = Soma.somar(1, 1);

        //Then
        assertEquals(expected, result);
    }
}