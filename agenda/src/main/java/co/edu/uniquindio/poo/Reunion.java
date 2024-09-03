package co.edu.uniquindio.poo;

import java.util.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private LocalTime hora;
    private List<Contacto> asistentes;

    //constructor
    public Reunion(String descripcion, Date fecha, LocalTime Hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        this.asistentes= new ArrayList<>();
    }

    //getters
    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }


    //setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reunion \n[descripcion=" + descripcion + "\nfecha=" + fecha + "\nhora=" + hora + "\nasistentes="
                + asistentes + "]";
    }

    public void agregarAsistente(Contacto contacto) {
        asistentes.add(contacto);
    }

    public void eliminarAsistente(Contacto contacto) {
        asistentes.remove(contacto);
    }

}
