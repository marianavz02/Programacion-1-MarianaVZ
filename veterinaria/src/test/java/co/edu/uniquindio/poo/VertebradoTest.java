package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VertebradoTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());


    @Test
    public void testGetTipo() {
        Vertebrado vertebrado = new Vertebrado("Tortuga", 5, "2kg", "Hojas", "8 horas", 
                                               "Doméstico", "Terrario", "Juan Pérez", 
                                               "123456789", "juan@example.com", "1234567890", 
                                               "Reptil", "Pequeño", "Sin datos extra", 
                                               "Cuidados básicos");
        assertEquals("Reptil", vertebrado.getTipo());
    }


    @Test
    public void testConstructorThrowsExceptionForNullNombre() {
        assertThrows(AssertionError.class, () -> {
            new Vertebrado(null, 5, "2kg", "Hojas", "8 horas", "Doméstico", "Terrario", 
                           "Juan Pérez", "123456789", "juan@example.com", "1234567890", 
                           "Reptil", "Pequeño", "Sin datos extra", "Cuidados básicos");
        });
    }




}
