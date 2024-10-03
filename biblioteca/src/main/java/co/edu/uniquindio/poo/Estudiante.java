package co.edu.uniquindio.poo;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre +  ", cedula=" + cedula + 
                ", telefono=" + telefono + ", correo=" + correo + "]";
    }




    
}
