package co.edu.uniquindio.poo;


import java.util.LinkedList;

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private LinkedList<Libro> libros = new LinkedList<>();
    private String fechaPrestamo;
    
    
    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario,
            String fechaPrestamo) {
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.fechaPrestamo = fechaPrestamo;
        this.libros = new LinkedList<>();
    }
    





    public Estudiante getEstudiante() {
        return estudiante;
    }


    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }


    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    




    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }




    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


        // Método para agregar libros al préstamo
    public boolean adicionarLibro(Libro libro) {
        if (libro.getUnidadesDisponibles() > 0) {
            libros.add(libro); // Añadir libro al préstamo
            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1); // Decrementar unidades disponibles
            libro.incrementarPrestamo(); // Incrementar el número de veces que ha sido prestado
            return true; // Libro añadido correctamente
        } else {
            System.out.println("No hay unidades disponibles del libro: " + libro.getTitulo());
            return false; // No se puede adicionar el libro porque no hay unidades disponibles
        }
    }












    @Override
    public String toString() {
        return "\n Prestamo [estudiante=" + estudiante + "\n bibliotecario=" + bibliotecario + "\n libros=" + libros
                + "\n fechaPrestamo=" + fechaPrestamo + "]";
    }


    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }





    
}

