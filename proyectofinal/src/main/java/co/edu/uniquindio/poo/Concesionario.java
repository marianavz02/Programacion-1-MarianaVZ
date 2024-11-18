package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Vehiculo> vehiculos;
    private List<Empleado> empleados;
    private List<Cliente> clientes;
    private List<Transaccion> transacciones;




    public Concesionario(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.vehiculos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

//metodos
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    
    
}
