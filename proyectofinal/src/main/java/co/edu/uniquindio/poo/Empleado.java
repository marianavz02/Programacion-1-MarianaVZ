package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private List<Transaccion> transaccionesRealizadas;

    public Empleado(String nombre, String cedula, String email, String telefono) {
        super(nombre, cedula, email, telefono);

        this.transaccionesRealizadas = new ArrayList<>();
    }


    public List<Transaccion> getTransaccionesRealizadas() {
        return transaccionesRealizadas;
    }


    public static int solicitarEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, mensaje);
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    return -1; // Valor especial para cancelar
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

    public static String solicitarString(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, mensaje);
            if (input != null && !input.trim().isEmpty()) {
                return input;
            } else if (input == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
                return null; // Para indicar cancelación
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un texto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public static double solicitarDouble(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, mensaje);
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    return -1.0; // Valor especial para cancelar
                }
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número decimal válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }




    public static Vehiculo crearVehiculo() {
    // Selección del tipo de vehículo
    String[] opciones = {"Moto", "Sedan", "Deportivo", "Camioneta", "PickUp", "Van", "Bus", "Camion"};
    String tipoVehiculo = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione el tipo de vehículo:",
            "Tipo de Vehículo",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
    );

    if (tipoVehiculo == null) {
        JOptionPane.showMessageDialog(null, "Operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

        // Atributos comunes de Vehiculo
        String matricula = solicitarString("Ingrese la matrícula del vehículo:");
        if (matricula == null) return null;

        String marca = solicitarString("Ingrese la marca del vehículo:");
        if (marca == null) return null;

        String modelo = solicitarString("Ingrese el modelo del vehículo:");
        if (modelo == null) return null;

        int año = solicitarEntero("Ingrese el año del vehículo:");
        if (año == -1) return null;
        

        NuevoUsado nuevoUsado = (NuevoUsado) JOptionPane.showInputDialog(
        null,
        "Seleccione si el vehículo es nuevo o usado:",
        "Estado del Vehículo",
        JOptionPane.QUESTION_MESSAGE,
        null,
        NuevoUsado.values(), // Valores del Enum NuevoUsado
        NuevoUsado.NUEVO // Valor predeterminado
        );

// Selección de Transmisión
        Transmision transmision = (Transmision) JOptionPane.showInputDialog(
        null,
        "Seleccione el tipo de transmisión:",
        "Transmisión",
        JOptionPane.QUESTION_MESSAGE,
        null,
        Transmision.values(), // Valores del Enum Transmision
        Transmision.AUTOMATICA // Valor predeterminado
        );

// Selección de Combustible
        Combustible combustible = (Combustible) JOptionPane.showInputDialog(
        null,
        "Seleccione el tipo de combustible:",
        "Combustible",
        JOptionPane.QUESTION_MESSAGE,
        null,
        Combustible.values(), // Valores del Enum Combustible
        Combustible.GASOLINA // Valor predeterminado
        );

        
        int velocidadMax = solicitarEntero("Ingrese la velocidad máxima del vehículo:");
        if (velocidadMax == -1) return null;
        
        int numPasajeros = solicitarEntero("Ingrese el número de pasajeros del vehículo:");
        if (numPasajeros == -1) return null;
        
        int numPuertas = solicitarEntero("Ingrese el número de puertas del vehículo:");
        if (numPuertas == -1) return null;
        
        
        boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
        
        boolean camaraReversa = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
        
        boolean crucero = JOptionPane.showConfirmDialog(null, "¿Tiene control crucero?") == JOptionPane.YES_OPTION;
        
        int numBolsasAire = solicitarEntero("Ingrese el número de bolsas de aire del vehículo:");
        if (numBolsasAire == -1) return null;
        
        boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene frenos ABS?") == JOptionPane.YES_OPTION;
        
        boolean sensorColision = JOptionPane.showConfirmDialog(null, "¿Tiene sensores de colisión?") == JOptionPane.YES_OPTION;
        
        boolean sensorTraficoCruzado = JOptionPane.showConfirmDialog(null, "¿Tiene sensor de tráfico cruzado?") == JOptionPane.YES_OPTION;
        
        boolean asistentePermanencia = JOptionPane.showConfirmDialog(null, "¿Tiene asistente de permanencia en el carril?") == JOptionPane.YES_OPTION;
        
        int precioVehiculo = solicitarEntero("Ingrese el precio del vehículo:");
        if (precioVehiculo == -1) return null;


            // Solicitar atributos específicos del tipo de vehículo
    switch (tipoVehiculo) {
        case "Moto":
            int cilindraje = solicitarEntero("Ingrese el cilindraje de la moto:");
            if (cilindraje == -1) return null;

            int cambios = solicitarEntero("Ingrese los cambios de la moto:");
            if (cambios == -1) return null;

            return new Moto(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, cilindraje, cambios);

        case "Sedan":
        double capacidadMaletero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del maletero (litros):"));
            return new Sedan(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, capacidadMaletero);

        
        case "Deportivo":
            int caballosFuerza = solicitarEntero("Ingrese los caballos de fuerza del deportivo:");
            if (caballosFuerza == -1) return null;
            
            
            double tiempo100km = solicitarDouble("Ingrese el tiempo 0 a 100km:");
            if (tiempo100km == -1) return null;


            int cambiosDeportivo = solicitarEntero("Ingrese los cambios del deportivo:");
            if (cambiosDeportivo == -1) return null;
            
            return new Deportivo(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, caballosFuerza, tiempo100km, cambiosDeportivo);

        case "Camioneta":
            String traccion = solicitarString("Ingrese la traccion de la camioneta:");
            if (traccion == null) return null;
            return new Camioneta(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, traccion);

        case "PickUp":
            String traccionP = solicitarString("Ingrese la traccion de la pickup:");
            if (traccionP == null) return null;
            
            String capacidadCargaCaja = solicitarString("Ingrese la capacidad de carga de la pickup:");
            if (capacidadCargaCaja == null) return null;
            
            return new PickUp(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, traccionP, capacidadCargaCaja);


        case "Van":
             return new Van(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        

        case "Bus":
            int numEjes= solicitarEntero("Ingrese el numero de ejes del bus:");
            if (numEjes == -1) return null;

            int numSalidasEmergencia = solicitarEntero("Ingrese el numero de salidas de emergencia del bus:");
            if (numSalidasEmergencia == -1) return null;

             return new Bus(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
                    numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs,
                    sensorColision, sensorTraficoCruzado, asistentePermanencia, precioVehiculo, numEjes, numSalidasEmergencia);

        case "Camion":
            
            TipoCamion tipoCamion = (TipoCamion) JOptionPane.showInputDialog(
            null,
            "Seleccione si el vehículo es liviano, mediano o pesado:",
            "Tipo de camion",
            JOptionPane.QUESTION_MESSAGE,
            null,
            TipoCamion.values(), // Valores del Enum
            TipoCamion.LIVIANO // Valor predeterminado
            );

            String capacidadCarga = solicitarString("Ingrese la capacidad de carga del bus:");
            if (capacidadCarga == null) return null;
            
            boolean frenosAire = JOptionPane.showConfirmDialog(null, "¿Tiene frenos de aire?") == JOptionPane.YES_OPTION;
            int numEjesCamion = solicitarEntero("Ingrese el numero de ejes del camion:");
            if (año == -1) return null;

            return new Camion(matricula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax,
             numPasajeros, numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision, sensorTraficoCruzado,
              asistentePermanencia, precioVehiculo, tipoCamion, capacidadCarga, frenosAire, numEjesCamion);
        




        default:
            JOptionPane.showMessageDialog(null, "Tipo de vehículo no válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
    }
}

    










/* 
        // Métodos
        public void registrarVehiculo(Vehiculo vehiculo, List<Vehiculo> inventario) {
            if (vehiculo != null) {
                inventario.add(vehiculo);
                System.out.println("Vehículo registrado correctamente: " + vehiculo);
            } else {
                System.out.println("Error: el vehículo no es válido.");
            }
        }
    
        public void registrarCliente(Cliente cliente, List<Cliente> clientesRegistrados) {
            if (cliente != null) {
                clientesRegistrados.add(cliente);
                System.out.println("Cliente registrado correctamente: " + cliente);
            } else {
                System.out.println("Error: el cliente no es válido.");
            }
        }
    
        public void realizarTransaccion(String tipo, Vehiculo vehiculo, Cliente cliente) {
            if (vehiculo == null || cliente == null) {
                System.out.println("Error: Vehículo o cliente no válidos.");
                return;
            }
    
            Transaccion transaccion = new Transaccion(null, null, null, cliente, vehiculo);
            transaccionesRealizadas.add(transaccion);
    
            System.out.println("Transacción realizada con éxito:");
            System.out.println(transaccion);
        }
*/   
        @Override
        public String toString() {
            return "Empleado{" +
                    ", nombre='" + getNombre() + '\'' +
                    ", cédula='" + getCedula() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", teléfono='" + getTelefono() + '\'' +
                    '}';
        }

    


}
