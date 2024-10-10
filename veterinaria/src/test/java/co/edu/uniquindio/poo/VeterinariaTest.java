package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());


    @Test
    public void testVeterinariaConstructor() {
        Veterinaria veterinaria = new Veterinaria("Veterinaria ABC", "Calle 123", "9:00 - 18:00");
        assertEquals("Veterinaria ABC", veterinaria.getNombre());
        assertEquals("Calle 123", veterinaria.getDireccion());
        assertEquals("9:00 - 18:00", veterinaria.getHorario());
    }


    @Test
    public void testAgregarGato() {
        Veterinaria veterinaria = new Veterinaria("Veterinaria ABC", "Calle 123", "9:00 - 18:00");
        Gato gato = new Gato("gojo", 6, "6kg", "concentrado", "Regular", "Domestico","cra18", "Juan", "315255555", "Juan@mail", "41907777", "tigrado", "nada", "nada"); // Supongamos que Gato tiene este constructor
        veterinaria.agregarGato(gato);
        assertTrue(veterinaria.getGatos().contains(gato));
}


}
