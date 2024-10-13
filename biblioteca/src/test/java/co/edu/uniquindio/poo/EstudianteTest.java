package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testDatosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        // Crear una nueva instancia para probar
        Estudiante estudiante = new Estudiante("Martinelli", "10912026", "316226", "MartinelliGunner@email.com");
        // Verificar que el nombre del libro coincide
        assertEquals("Martinelli", estudiante.getNombre());
        assertEquals("10912026", estudiante.getCedula());
        assertEquals("316226", estudiante.getTelefono());
        assertEquals("MartinelliGunner@email.com", estudiante.getCorreo());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void testDatosNulos() {
        LOG.info("Iniciado test datos Nulos");

        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null));

        LOG.info("Finalizando test datos Nulos");
    }
}
