package com.upn.calculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoServiceIntegrationIT {

    private final DescuentoService servicio = new DescuentoService();

    @Test
    public void testIntegracionConServidorExterno() {
        System.out.println("[QA INFO] Iniciando prueba de integración de conectividad...");
        
        boolean estaConectado = servicio.verificarConexionServidorLicencias();
        
        assertTrue(estaConectado, "La prueba de integración falló: El servidor de licencias no responde.");
        System.out.println("[QA INFO] Prueba de integración completada exitosamente.");
    }
}