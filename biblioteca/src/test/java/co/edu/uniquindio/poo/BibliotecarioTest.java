package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testDatosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        // Crear una nueva instancia para probar
        Bibliotecario bibliotecario = new Bibliotecario("Gabriel", "10924555", "314366", "Gabrielyisus@email.com", 0,
                2);
        // Verificar que el nombre del libro coincide
        assertEquals("Gabriel", bibliotecario.getNombre());
        assertEquals("10924555", bibliotecario.getCedula());
        assertEquals("314366", bibliotecario.getTelefono());
        assertEquals("Gabrielyisus@email.com", bibliotecario.getCorreo());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void testDatosNulos() {
        LOG.info("Iniciado test datos Nulos");

        assertThrows(Throwable.class, () -> new Bibliotecario(null, null, null, null, 0, 0));

        LOG.info("Finalizando test datos Nulos");
    }
}
