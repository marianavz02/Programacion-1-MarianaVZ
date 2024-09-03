package co.edu.uniquindio.poo;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;
    
    
    //constructor 
    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;

    }


    // getters
    public String getNombre() {
        return nombre;
    }



    public String getAlias() {
        return alias;
    }



    public String getDireccion() {
        return direccion;
    }



    public String getTelefono() {
        return telefono;
    }



    public String getEmail() {
        return email;
    }



    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono);
    }



    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }


    //toString
    @Override
    public String toString() {
        return "Contacto \n[nombre=" + nombre + "   alias=" + alias + "\ndireccion=" + direccion + "   telefono=" + telefono
                + "\nemail=" + email + "]";
    }

 
}
