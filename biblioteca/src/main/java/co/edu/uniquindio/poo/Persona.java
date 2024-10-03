package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String cedula;
    public String telefono;
    public String correo;

    //CONSTRUCTOR
    public Persona(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }


    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCedulo() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }


    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCedulo(String cedula) {
        this.cedula = cedula;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
    
}
