package co.edu.uniquindio.poo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class TransaccionTest {
    @Test
    void testCrearTransaccion() {
        // Arrange
        TipoTransaccion tipo = TipoTransaccion.COMPRA;
        LocalDate fecha = LocalDate.now();
        Empleado empleado = new Empleado("juan", "4178927", "juan@", "31344");
        Cliente cliente = new Cliente("lina", "412736", "lina@", "3126", INDIVIDUAL);
        Vehiculo vehiculo = new Vehiculo(null, null, null, 0, null, null, null, 0, 0, 0, false, false, false, 0, false, false, false, false, 0);

        // Act
        Transaccion transaccion = new Transaccion(tipo, fecha, empleado, cliente, vehiculo);

        // Assert
        assertEquals(tipo, transaccion.getTipoTransaccion());
        assertEquals(fecha, transaccion.getFecha());
        assertEquals(empleado, transaccion.getEmpleado());
        assertEquals(cliente, transaccion.getCliente());
        assertEquals(vehiculo, transaccion.getVehiculo());
    }
}

