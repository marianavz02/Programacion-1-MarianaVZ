package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona{

    private LinkedList<Prestamo> prestamosRealizados;

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        //TODO Auto-generated constructor stub
        this.prestamosRealizados = new LinkedList<>();
    }




        // Método para agregar un préstamo
        public void agregarPrestamo(Prestamo prestamo) {
            prestamosRealizados.add(prestamo);
        }
    
        // Método para contar los préstamos del estudiante actual
        public int contarPrestamos() {
            return prestamosRealizados.size();
        }








    @Override
    public String toString() {
        return "\n [nombre=" + nombre +  "\n cedula=" + cedula + 
                "\n telefono=" + telefono + "\n correo=" + correo + 
                "\n Cantidad de Préstamos:" + contarPrestamos() + "]";
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
}