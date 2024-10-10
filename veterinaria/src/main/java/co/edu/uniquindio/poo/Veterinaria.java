package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String horario;
    private LinkedList<Gato>gatos;
    private LinkedList<Perro>perros;
    private LinkedList<Invertebrado>invertebrados;
    private LinkedList <Vertebrado>vertebrados;


    public Veterinaria(String nombre, String direccion, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        gatos= new LinkedList<>();
        perros=new LinkedList<>();
        invertebrados=new LinkedList<>();
        vertebrados=new LinkedList<>();
    }



    //getters
    public String getNombre() {
        return nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getHorario() {
        return horario;
    }


    public LinkedList<Gato> getGatos() {
        return gatos;
    }


    public LinkedList<Perro> getPerros() {
        return perros;
    }


    public LinkedList<Invertebrado> getInvertebrados() {
        return invertebrados;
    }


    public LinkedList<Vertebrado> getVertebrados() {
        return vertebrados;
    }


    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }


    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }


    public void setInvertebrados(LinkedList<Invertebrado> invertebrados) {
        this.invertebrados = invertebrados;
    }


    public void setVertebrados(LinkedList<Vertebrado> vertebrados) {
        this.vertebrados = vertebrados;
    }

    


    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + "\n direccion=" + direccion + "\n horario=" + horario + "\n\n gatos="
                + gatos + "\n\n perros=" + perros + "\n\n invertebrados=" + invertebrados + "\n\n vertebrados=" + vertebrados
                + "]";
    }



    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }



    public void agregarGato (Gato gato){
        gatos.add(gato);
    }

    public void agregarPerro (Perro perro){
        perros.add(perro);
    }

    public void agregarInvertebrado (Invertebrado invertebrado){
        invertebrados.add(invertebrado);
    }

    public void agregarVertebrado (Vertebrado vertebrado){
        vertebrados.add(vertebrado);
    }


    
}
