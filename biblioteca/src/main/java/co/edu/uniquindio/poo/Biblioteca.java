package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Bibliotecario> bibliotecarios = new LinkedList<>();
    private LinkedList<Estudiante> estudiantes = new LinkedList<>();
    private LinkedList<Libro> libros = new LinkedList<>();
    private LinkedList<Prestamo> prestamos = new LinkedList<>();
    private String nombre;



    public Biblioteca() {
        this.bibliotecarios = new LinkedList<>();
        this.prestamos = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
        this.libros = new LinkedList<>();
    }



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

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }





// Estudiante con más préstamos (sin recibir parámetros)
public Estudiante estudianteConMasPrestamos() {
    Estudiante estudianteConMasPrestamos = null;
    int maxPrestamos = 0;

    // Recorre la lista de estudiantes
    for (Estudiante estudiante : estudiantes) {
        int prestamosEstudiante = 0;

        // Cuenta los préstamos para el estudiante actual
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getEstudiante().equals(estudiante)) {
                prestamosEstudiante++;
            }
        }

        // Si este estudiante tiene más préstamos que el máximo actual, actualiza
        if (prestamosEstudiante > maxPrestamos) {
            maxPrestamos = prestamosEstudiante;
            estudianteConMasPrestamos = estudiante;
        }
    }

    return estudianteConMasPrestamos;
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
    






       
    


//En el tostring nombre+  da el nombre de la biblioteca 

    
    @Override
    public String toString() {
        Estudiante estudiante = estudianteConMasPrestamos();
        return   nombre+  "\n\n [bibliotecarios=" + bibliotecarios + "\n \n estudiantes=" + estudiantes + "\n \n libros=" + libros+
       "\n Prestamos: "+ prestamos+
       "\n Estudiante con más préstamos: " + (estudiante != null ? estudiante.getNombre() : "Ninguno");
                
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }


    
}
   

