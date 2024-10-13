package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class LibroTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testDatosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        // Crear una nueva instancia para probar
        Libro libroTest = new Libro("002", "978-0-14-134896-2", "George Orwell", "1984", "Penguin", "1949", 20, 7);

        // Verificar que el nombre del libro coincide
        assertEquals("002", libroTest.getCodigo());
        assertEquals("978-0-14-134896-2", libroTest.getIsbn());
        assertEquals("George Orwell", libroTest.getAutor());
        assertEquals("1984", libroTest.getTitulo());
        assertEquals("Penguin", libroTest.getEditorial());
        assertEquals(20, libroTest.getUnidadesDisponibles());
        assertEquals(7, libroTest.getPrestamo());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void testDatosNulos() {
        LOG.info("Iniciado test datos Nulos");

        assertThrows(Throwable.class, () -> new Libro(null, null, null, null, null, null, 20, 7));

        LOG.info("Finalizando test datos Nulos");
    }
}
