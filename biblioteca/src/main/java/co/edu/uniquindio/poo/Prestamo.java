package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private ArrayList<Libro> libros = new ArrayList<>();
    private LocalDate fechaPrestamo;

    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario, LocalDate fechaPrestamo) {
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

    public LocalDate getFechaPrestamo() {
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

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


    //AGREGAR LIBRO
    public void adicionarLibro(Libro libro) {
        libros.add(libro);
        libro.setPrestamo(libro.getPrestamo() + 1);
    }


// CONSULTA POR TITULO
    public int consultarPrestamosPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.getPrestamo();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Prestamo [estudiante=" + estudiante + ", bibliotecario=" + bibliotecario + ", libros=" + libros
                + ", fechaPrestamo=" + fechaPrestamo + "]";
    }




    
}
