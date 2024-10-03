package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private ArrayList<Libro> libros = new ArrayList<>();
    private String fechaPrestamo;

    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario, String fechaPrestamo) {
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.fechaPrestamo = fechaPrestamo;
    }

    //GETTERS

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }


    //SETTERS

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }




// Método para agregar libros al préstamo
public boolean adicionarLibro(Libro libro) {
    if (libro.getUnidadesDisponibles() > 0) {
        libros.add(libro); // Agregar el libro a la lista del préstamo
        libro.setPrestamo(libro.getPrestamo() + 1); // Incrementar el contador de préstamos del libro
        libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1); // Reducir las unidades disponibles
        return true; // El libro fue añadido
    } else {
        System.out.println("No hay unidades disponibles del libro: " + libro.getTitulo());
        return false; // No se pudo añadir el libro porque no hay unidades disponibles
    }
}





    @Override
    public String toString() {
        return "\n Prestamo [estudiante=" + estudiante + ", bibliotecario=" + bibliotecario + ", libros=" + libros
                + ", fechaPrestamo=" + fechaPrestamo + "]";
    }


    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }





    
}
