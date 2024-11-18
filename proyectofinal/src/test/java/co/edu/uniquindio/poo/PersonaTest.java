package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
        @Test
    void testSetNombre() {
        // Arrange
        Persona persona = new Persona("", "", "", "");
        String nuevoNombre = "Carlos Ramírez";

        // Act
        persona.setNombre(nuevoNombre);

        // Assert
        assertEquals(nuevoNombre, persona.getNombre());
    }

    
}
