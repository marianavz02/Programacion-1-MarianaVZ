package co.edu.uniquindio.poo;

import javax.swing.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        // Listas para el sistema
        List<Empleado> empleados = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Transaccion> transacciones = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>(); // Lista de vehículos disponibles
        List<Administrador> administradores = new ArrayList<>();

        // Crear un administrador
        Administrador administrador1 = new Administrador(
                "Carlos Rodríguez",
                "123456789",
                "admin@tucarro.com",
                "5551234567",
                "admin",
                "admin123",
                "nombre mascota",
                "flyka"
        );
        administradores.add(administrador1);
        

        // Menú principal
        while (true) {
            String[] opciones = {"1. Administrador", "2. Empleado", "3. Cliente", "4. Recuperar contraseña", "5. Salir"};
            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú Principal",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null || opcion.equals("5. Salir")) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                break;
            }

            switch (opcion) {
                case "1. Administrador":
                    ejecutarAdministrador(administrador1, empleados, vehiculos, transacciones);
                    break;
                case "2. Empleado":
                    ejecutarEmpleado(empleados, vehiculos, clientes, transacciones);
                    break;
                case "3. Cliente":
                    ejecutarCliente(vehiculos);
                    break;
                case "4. Recuperar contraseña":
                    String usuarioRecuperar = JOptionPane.showInputDialog(null, "Ingrese su usuario:", 
                                                                          "Recuperación de Contraseña", JOptionPane.QUESTION_MESSAGE);

                    if (usuarioRecuperar != null) {
                        Administrador administradorRecuperar = null;
                        for (Administrador administrador : administradores) {
                            if (administrador.getUsuario().equals(usuarioRecuperar)) {
                                administradorRecuperar = administrador;
                                break;
                            }
                        }
                        if (administradorRecuperar != null) {
                            administradorRecuperar.recuperarContrasena();
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    // Funcionalidades del administrador
    private static void ejecutarAdministrador(Administrador administrador, List<Empleado> empleados, List<Vehiculo> vehiculos, List<Transaccion> transacciones) {
        //  opciones para gestionar empleados y reportes
        if (administrador.verificarAcceso()) {
        while (true) {
            String[] opciones = {
                    "1. Gestionar empleados",
                    "2. Generar reportes",
                    "3. Recuperar contraseña",
                    "4. Volver al menú principal"
            };
            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una acción:",
                    "Menú del Administrador",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null || opcion.equals("4. Volver al menú principal")) {
                break;
            }

            switch (opcion) {
                case "1. Gestionar empleados":
                    gestionarEmpleados(administrador, empleados);
                    break;
                case "2. Generar reportes":
                    administrador.generarReporte(transacciones);
                    break;
                case "3. Recuperar contraseña":
                    administrador.recuperarContrasena();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }       
        }
    }
    }





    private static void gestionarEmpleados(Administrador administrador, List<Empleado> empleados) {
        String[] opciones = {"Agregar", "Eliminar", "Actualizar", "Ver empleados"};
        String accion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una acción:",
                "Gestión de Empleados",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (accion == null) return;

        switch (accion) {
            case "Agregar":
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                String email = JOptionPane.showInputDialog("Ingrese el email del empleado:");
                String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado:");

                Empleado nuevoEmpleado = new Empleado(nombre, cedula, email, telefono);
                empleados.add(nuevoEmpleado);
                gestionarEmpleados(administrador, empleados);
                JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente.");
                break;

            case "Eliminar":
                String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a eliminar:");
                Empleado empleadoEliminar = empleados.stream()
                        .filter(e -> e.getCedula().equals(cedulaEliminar))
                        .findFirst()
                        .orElse(null);

                if (empleadoEliminar != null) {
                    empleados.remove(empleadoEliminar);
                    gestionarEmpleados(administrador, empleados);
                    JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                }
                break;

            case "Actualizar":
                String cedulaActualizar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a actualizar:");
                Empleado empleadoActualizar = empleados.stream()
                        .filter(e -> e.getCedula().equals(cedulaActualizar))
                        .findFirst()
                        .orElse(null);

                if (empleadoActualizar != null) {
                    String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono del empleado:");
                    empleadoActualizar.setTelefono(nuevoTelefono);
                    gestionarEmpleados(administrador, empleados);
                    JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                }
                break;

            case "Ver empleados":
                StringBuilder listaEmpleados = new StringBuilder("Lista de empleados:\n");
                for (Empleado e : empleados) {
                    listaEmpleados.append(e).append("\n");
                }
                JOptionPane.showMessageDialog(null, listaEmpleados.toString());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Acción no válida.");
                break;
        }
    }









    // Funcionalidades del empleado
    private static void ejecutarEmpleado(List<Empleado> empleados, List<Vehiculo> vehiculos, List<Cliente> clientes, List<Transaccion> transacciones) {
        String cedula = JOptionPane.showInputDialog("Ingrese su cédula:");
        Empleado empleado = empleados.stream()
                .filter(e -> e.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);

        if (empleado == null) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            return;
        }

        while (true) {
            String[] opciones = {
                    "1. Registrar vehículo",
                    "2. Registrar cliente",
                    "3. Realizar transacción",
                    "4. Ver transacciones realizadas",
                    "5. Volver al menú principal"
            };
            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una acción:",
                    "Menú del Empleado",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null || opcion.equals("5. Volver al menú principal")) {
                break;
            }

            switch (opcion) {
                case "1. Registrar vehículo":
                    registrarVehiculo(vehiculos);
                    break;
                case "2. Registrar cliente":
                    registrarCliente(clientes);
                    break;
                case "3. Realizar transacción":
                    realizarTransaccion(empleado, vehiculos, clientes, transacciones);
                    break;
                case "4. Ver transacciones realizadas":
                    verTransacciones(empleado, transacciones);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    // Funcionalidades del cliente
    private static void ejecutarCliente(List<Vehiculo> vehiculos) {
        StringBuilder vehiculosDisponibles = new StringBuilder("Vehículos disponibles:\n");
        for (Vehiculo v : vehiculos) {
            vehiculosDisponibles.append(v).append("\n");
        }
        JOptionPane.showMessageDialog(null, vehiculosDisponibles.toString(), "Catálogo de Vehículos", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos auxiliares
    private static void registrarVehiculo (List<Vehiculo>vehiculos){
        Vehiculo nuevoVehiculo = Empleado.crearVehiculo();
        if (nuevoVehiculo != null) {
            vehiculos.add(nuevoVehiculo);
            JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente:\n" + nuevoVehiculo.toString());
        }
    }   




//registar cliente    
    private static void registrarCliente(List<Cliente> clientes) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cédula no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        String email = JOptionPane.showInputDialog("Ingrese el email del cliente:");
        if (email == null || email.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El email no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        if (telefono == null || telefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El teléfono no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        // Mostrar opciones para TipoCliente
        TipoCliente tipoCliente = (TipoCliente) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de cliente:",
                "Tipo de Cliente",
                JOptionPane.QUESTION_MESSAGE,
                null,
                TipoCliente.values(),
                TipoCliente.INDIVIDUAL
        );
    
        if (tipoCliente == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        // Crear y agregar el nuevo cliente
        Cliente nuevoCliente = new Cliente(nombre, cedula, email, telefono, tipoCliente);
        clientes.add(nuevoCliente);
    
        JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente:\n" + nuevoCliente.toString());
    }

//TRANSACCION
    private static void realizarTransaccion(Empleado empleado, List<Vehiculo> vehiculos, List<Cliente> clientes, List<Transaccion> transacciones) {
    // Selección del Cliente
    String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
    Cliente cliente = clientes.stream()
            .filter(c -> c.getCedula().equals(cedulaCliente))
            .findFirst()
            .orElse(null);

    if (cliente == null) {
        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        return;
    }

    // Selección del Vehículo
    String vehiculoId = JOptionPane.showInputDialog("Ingrese la matrícula del vehículo:");
    Vehiculo vehiculo = vehiculos.stream()
            .filter(v -> v.getMaticula().equals(vehiculoId))
            .findFirst()
            .orElse(null);

    if (vehiculo == null) {
        JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
        return;
    }

    // Selección del Tipo de Transacción
    TipoTransaccion tipoTransaccion = (TipoTransaccion) JOptionPane.showInputDialog(
            null,
            "Seleccione el tipo de transacción:",
            "Tipo de Transacción",
            JOptionPane.QUESTION_MESSAGE,
            null,
            TipoTransaccion.values(), // Enum con los valores posibles
            TipoTransaccion.COMPRA // Valor predeterminado
    );

    if (tipoTransaccion == null) {
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
        return;
    }

    // Fecha de la Transacción
    String fechaInput = JOptionPane.showInputDialog("Ingrese la fecha de la transacción (formato: YYYY-MM-DD):");
    LocalDate fecha;
    try {
        fecha = LocalDate.parse(fechaInput);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Fecha no válida. Operación cancelada.");
        return;
    }

    // Crear la Transacción
    Transaccion transaccion = new Transaccion(tipoTransaccion, fecha, empleado, cliente, vehiculo);

    // Registrar la Transacción y Actualizar Listas
    transacciones.add(transaccion);
    vehiculos.remove(vehiculo); // Eliminar el vehículo del inventario

    // Confirmación
    JOptionPane.showMessageDialog(null, "Transacción registrada exitosamente.");
}

    



    private static void verTransacciones(Empleado empleado, List<Transaccion> transacciones) {
        StringBuilder transaccionesEmpleado = new StringBuilder("Transacciones realizadas:\n");
        for (Transaccion t : transacciones) {
            if (t.getEmpleado().equals(empleado)) {
                transaccionesEmpleado.append(t).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, transaccionesEmpleado.toString());
    }
}
