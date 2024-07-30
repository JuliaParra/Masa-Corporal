package dev.julia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {

    @Test
    public void testCalcularIMCBajoPeso() {
        IMCCalculator calculator = new IMCCalculator(50, 1.75);
        assertEquals(16.33, calculator.calcularIMC(), 0.01);
        assertEquals("Bajo peso", calculator.obtenerCategoriaIMC());
    }

    @Test
    public void testCalcularIMCPesoNormal() {
        IMCCalculator calculator = new IMCCalculator(68, 1.75);
        assertEquals(22.20, calculator.calcularIMC(), 0.01);
        assertEquals("Peso normal", calculator.obtenerCategoriaIMC());
    }

    @Test
    public void testCalcularIMCSobrepeso() {
        IMCCalculator calculator = new IMCCalculator(80, 1.75);
        assertEquals(26.12, calculator.calcularIMC(), 0.01);
        assertEquals("Sobrepeso", calculator.obtenerCategoriaIMC());
    }

    @Test
    public void testCalcularIMCObesidad() {
        IMCCalculator calculator = new IMCCalculator(100, 1.75);
        assertEquals(32.65, calculator.calcularIMC(), 0.01);
        assertEquals("Obesidad", calculator.obtenerCategoriaIMC());
    }

   

   
}

