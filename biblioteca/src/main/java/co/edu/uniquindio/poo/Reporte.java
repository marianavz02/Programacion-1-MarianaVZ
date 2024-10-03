package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Reporte {
    private LinkedList<Bibliotecario> bibliotecarios = new LinkedList<>();
    private LinkedList<Estudiante> estudiantes = new LinkedList<>();
    private LinkedList<Libro> libros = new LinkedList<>();
    private LinkedList<Prestamo> prestamos = new LinkedList<>();
    

//PRESTAMOS POR BIBLIOTECARIO
    public int prestamosPorBibliotecario(Bibliotecario bibliotecario) {
        int contador = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getBibliotecario().equals(bibliotecario)) {
                contador++;
            }
        }
        return contador;
    }



    // PAGOS POR BIBLIOTECARIO

    


    //Estudiante con mas prestamos
    public Estudiante estudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;
    
        // Recorre la lista de estudiantes
        for (Estudiante estudiante : estudiantes) {
            int prestamosEstudiante = 0;
    
            // Couenta los préstamos para el estudiante actual
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


// prestamos por libro
    public int consultarPrestamosPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.getPrestamo();
            }
        }
        return 0;
    }

}
