package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private String editorial;
    private String fecha;
    private int unidadesDisponibles;
    private int prestamo;


    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, String fecha,
            int unidadesDisponibles, int prestamo) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        this.prestamo = prestamo;

        
    }

    //GETTERS


    public String getCodigo() {
        return codigo;
    }


    public String getIsbn() {
        return isbn;
    }


    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getEditorial() {
        return editorial;
    }


    public String getFecha() {
        return fecha;
    }


    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public int getPrestamo() {
        return prestamo;
    }
    

    
    //SETTERS

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "\n Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", Fecha=" + fecha + ", unidadesDisponibles=" + unidadesDisponibles + ", prestamo="
                + prestamo + "]";
    }



    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }









    


    


    
}
