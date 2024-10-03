package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Bibliotecario> bibliotecarios = new LinkedList<>();
    private LinkedList<Estudiante> estudiantes = new LinkedList<>();
    private LinkedList<Libro> libros = new LinkedList<>();
    private LinkedList<Prestamo> prestamos = new LinkedList<>();
    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void crearPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "\n Biblioteca [bibliotecarios=" + bibliotecarios + ", estudiantes=" + estudiantes + ", libros=" + libros
                + ", prestamos=" + prestamos + ", nombre=" + nombre + "]";
    }


    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }



    // consultar prestamos por libro
    public int consultarPrestamosPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.getPrestamo();
            }
        }
        return 0;
    }




    
    
}

