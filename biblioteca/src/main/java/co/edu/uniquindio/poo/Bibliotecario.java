package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private boolean salario;
    private boolean antiguedad;
    private LinkedList<Prestamo> prestamosGestionados;


    public Bibliotecario(String nombre, String cedula, String telefono, String correo, boolean salario,
            boolean antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.prestamosGestionados = new LinkedList<>();
        
    }





        public boolean isSalario() {
        return salario;
    }





    public void setSalario(boolean salario) {
        this.salario = salario;
    }





    public boolean isAntiguedad() {
        return antiguedad;
    }





    public void setAntiguedad(boolean antiguedad) {
        this.antiguedad = antiguedad;
    }





        // Agregar un préstamo gestionado por este bibliotecario
        public void agregarPrestamo(Prestamo prestamo) {
            prestamosGestionados.add(prestamo);
        }



            // Calcular el pago del bibliotecario basado en los préstamos gestionados
    public double calcularPago() {
        int cantidadPrestamos = prestamosGestionados.size();
        double totalPrestamos = cantidadPrestamos * 5000; // Suponiendo que cada préstamo vale 5000 pesos

        double pago = 0;

        // Si el bibliotecario no tiene salario base
        if (!salario) {
            pago = totalPrestamos;

            // Si tiene antigüedad, se añade una bonificación del 2%
            if (antiguedad) {
                double bonificacion = totalPrestamos * 0.02;
                pago += bonificacion;
            }
        } else {
            // Si tiene salario base, se le asigna un salario fijo
            pago = 1000000; // Ejemplo de salario base fijo
        }

        return pago;
    }



    public int prestamosPorBibliotecario() {
        return prestamosGestionados.size();
    }









    @Override
    public String toString() {
        return "\nEl bibliotecario: " + nombre + " \n tiene un salario de: " + salario + " \n su cedula es: " + cedula + "\n tiene una antiguedad de: "
                + antiguedad + " años,\n su telefono es:" + telefono + "\n su correo es :" + correo+ 
                "\n PAGO POR BIBLIOTECARIO: " +calcularPago()+ "\n PRESTAMOS GESTIONADOS: " +prestamosPorBibliotecario();
    }


    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
}

    
