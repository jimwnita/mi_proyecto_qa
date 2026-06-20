package com.upn.calculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoServiceUnitTest {

    private final DescuentoService servicio = new DescuentoService();

    //Testea el % de descuento para 1000
    @Test
    public void testDescuentoMaximo() {
        double descuento = servicio.calcularDescuentoMonto(1000);
        assertEquals(150.0, descuento, "El descuento para 1000 debería ser el 15% (150)");
    }

  //Testea el % de descuento para montos menores a 500
    @Test
    public void testSinDescuento() {
        double descuento = servicio.calcularDescuentoMonto(100);
        assertEquals(0.0, descuento, "Montos menores a 500 no tienen descuento");
    }

    @Test
    public void testMontoNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            servicio.calcularDescuentoMonto(-50);
        }, "Debería lanzar una excepción si el monto es negativo");
    }
}