package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class GatoTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());



    @Test
    public void testGetPelaje() {
        Gato gato = new Gato("Miau", 2, "4kg", "Croquetas", "12 horas", 
                          "Doméstico", "Casa", "Juan Pérez", 
                          "123456789", "juan@example.com", 
                          "987654321", "Corto", "Sin datos extra", 
                          "Cuidados básicos");

    assertEquals("Corto", gato.getPelaje());
    }


    @Test
    public void testGetDatosExtra() {
        Gato gato = new Gato("Miau", 2, "4kg", "Croquetas", "12 horas", 
                          "Doméstico", "Casa", "Juan Pérez", 
                          "123456789", "juan@example.com", 
                          "987654321", "Corto", "Sin datos extra", 
                          "Cuidados básicos");

    assertEquals("Sin datos extra", gato.getDatosExtra());
}




}    