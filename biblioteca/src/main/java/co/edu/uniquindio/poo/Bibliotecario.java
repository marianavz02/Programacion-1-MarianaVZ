package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private double salario;
    private int antiguedad;
    private LinkedList<Prestamo> prestamosGestionados;


    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.prestamosGestionados = new LinkedList<>();
        
    }
    





        public double getSalario() {
        return salario;
    }






    public void setSalario(double salario) {
        this.salario = salario;
    }






    public int getAntiguedad() {
        return antiguedad;
    }






    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }






        // Agregar un préstamo gestionado por este bibliotecario
        public void agregarPrestamo(Prestamo prestamo) {
            prestamosGestionados.add(prestamo);
        }






    public int prestamosPorBibliotecario() {
        return prestamosGestionados.size();
    }









    @Override
    public String toString() {
        return "\nEl bibliotecario: " + nombre + " \n tiene un salario de: " + salario + " \n su cedula es: " + cedula + "\n tiene una antiguedad de: "
                + antiguedad + " años,\n su telefono es:" + telefono + "\n su correo es :" + correo+ 
                "\n PRESTAMOS GESTIONADOS: " +prestamosPorBibliotecario();
    }


    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
}

    
