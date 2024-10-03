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
    public double calcularPagoBibliotecario(Bibliotecario bibliotecario) {
        int cantidadPrestamos = prestamosPorBibliotecario(bibliotecario);
        double total = cantidadPrestamos * 20; // Suponiendo que cada préstamo tiene un valor de 100
        double bonificacion = total * 0.02 * bibliotecario.getAntiguedad();
        return total + bonificacion;
    }


    


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





    @Override
    public String toString() {
        return "\n Reporte [ estudianteConMasPrestamos=" + estudianteConMasPrestamos() ;
    }



    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }



    

}
