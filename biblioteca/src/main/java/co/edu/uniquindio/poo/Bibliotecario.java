package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona{

    private double salario;
    private double antiguedad;


    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario,
            double antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.antiguedad = antiguedad;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getAntiguedad() {
        return antiguedad;
    }


    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", antiguedad="
                + antiguedad + ", telefono=" + telefono + ", correo=" + correo + "]";
    }

    




}
