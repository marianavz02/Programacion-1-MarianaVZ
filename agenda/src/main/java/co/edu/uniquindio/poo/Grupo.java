package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    public enum Categoria{OFICINA, FIESTA, AMIGOS, FAMILIA};

    private String nombreGrupo;
    private Categoria categoria;
    private List<Contacto> contactos;



    public Grupo(String nombreGrupo, Categoria categoria, List<Contacto> contactos) {
        this.nombreGrupo = nombreGrupo;
        this.categoria = categoria;
        this.contactos= new ArrayList<>();
        
    }



    public String getNombreGrupo() {
        return nombreGrupo;
    }



    public Categoria getCategoria() {
        return categoria;
    }



    public List<Contacto> getContactos() {
        return contactos;
    }



    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }



    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public void agregarContacto(Contacto contacto) {
        
            contactos.add(contacto);
        }    

        
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }



    @Override
    public String toString() {
        return "Grupo \n[nombreGrupo=" + nombreGrupo + "\ncategoria=" + categoria + "\ncontactos=" + contactos + "]";
    }


    
    


    
}
