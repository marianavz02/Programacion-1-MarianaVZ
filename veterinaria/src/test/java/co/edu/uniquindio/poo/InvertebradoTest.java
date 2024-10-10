package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class InvertebradoTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());


    @Test
    public void testGetTipo() {
        Invertebrado invertebrado = new Invertebrado("Escorpión", 5, "200g", "Insectos", "7 horas", "Doméstico", "Terrario", 
                                                 "Pedro", "321654987", "pedro@example.com", "1234567890", 
                                                 "Arácnido", "Mediano", "Veneno fuerte", "Cuidados especiales");
    assertEquals("Arácnido", invertebrado.getTipo());
}

    @Test
    public void testInvertebradoEsDomestico() {
        Invertebrado invertebrado = new Invertebrado("Grillo", 2, "100g", "Plantas", "5 horas", "Doméstico", "Terrario", 
                                                 "Elena", "741852963", "elena@example.com", "9638527410", 
                                                 "Insecto", "Mediano", "No", "Cuidados moderados");
    assertTrue(invertebrado.getDomesticoNoDomestico().equals("Doméstico"));
}

    @Test
    public void testConstructorThrowsAssertionErrorForBlankPeso() {
        assertThrows(AssertionError.class, () -> {
            new Invertebrado("Hormiga", 1, "", "Azúcar", "4 horas", "No doméstico", "Colonia", 
                        "Ana", "987654321", "ana@example.com", "0987654321", 
                        "Insecto", "Pequeño", "No", "Cuidados básicos");
    });
}

}
