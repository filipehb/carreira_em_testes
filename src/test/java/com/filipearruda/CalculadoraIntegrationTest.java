package com.filipearruda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIntegrationTest {
    @Test
    public void testSomarESubtrair() {
        float num1 = 5.0f;
        float num2 = 3.0f;

        float resultadoSoma = Calculadora.somar(num1, num2);
        float resultadoSubtracao = Calculadora.subtrair(num1, num2);

        assertEquals(8.0f, resultadoSoma, 0.001f);
        assertEquals(2.0f, resultadoSubtracao, 0.001f);
    }

    @Test
    public void testSomarNegativoSubtrairPositivo() {
        float num1 = -5.0f;
        float num2 = 3.0f;

        float resultadoSoma = Calculadora.somar(num1, num2);
        float resultadoSubtracao = Calculadora.subtrair(num1, num2);

        assertEquals(-2.0f, resultadoSoma, 0.001f);
        assertEquals(-8.0f, resultadoSubtracao, 0.001f);
    }
}
