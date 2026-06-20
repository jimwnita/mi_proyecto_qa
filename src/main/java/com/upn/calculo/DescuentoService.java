package com.upn.calculo;

public class DescuentoService {

    // Lógica pura (Ideal para Pruebas Unitarias)
    public double calcularDescuentoMonto(double montoBase) {
        if (montoBase < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        if (montoBase >= 1000) {
            return montoBase * 0.15; // 15% descuento
        } else if (montoBase >= 500) {
            return montoBase * 0.10; // 10% descuento
        }
        return 0.0;
    }

    // Simulación de interacción con un sistema externo (Ideal para Integración)
    public boolean verificarConexionServidorLicencias() {
        // En un caso real aquí se conectaría a un API externo vía HTTP.
        // Simulamos un retraso de red y éxito.
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return true; 
    }
}