package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PerroTest {
    private static final Logger LOG = Logger.getLogger(PerroTest.class.getName());


        @Test
    public void testConstructorThrowsExceptionForEmptyRaza() {
        assertThrows(AssertionError.class, () -> {
            new Perro("Bobby", 3, "15kg", "Croquetas", "8 horas", "Doméstico", "Casa",
                "Juan Pérez", "123456789", "juan@example.com", "1234567890", 
                "", "Sin datos", "Cuidados generales");
        });
    }



    @Test
    public void testConstructorThrowsExceptionForNullNombre() {
        assertThrows(AssertionError.class, () -> {
            new Perro(null, 3, "15kg", "Croquetas", "8 horas", "Doméstico", "Casa",
                "Juan Pérez", "123456789", "juan@example.com", "1234567890", 
                "Labrador", "Sin datos", "Cuidados generales");
        });
    }
    
}
