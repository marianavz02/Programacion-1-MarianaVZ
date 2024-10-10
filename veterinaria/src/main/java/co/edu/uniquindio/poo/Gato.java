package co.edu.uniquindio.poo;


public class Gato extends Animal {
    private String pelaje;
    private String datosExtra;
    private String cuidados;


    //constructor
    public Gato(String nombre, int edad, String peso, String alimento, String sueño, String domesticoNoDomestico,
            String hogar, String nombreResponsable, String telefonoResponsable, String correoResponsable,
            String cedulaResponsable, String pelaje, String datosExtra, String cuidados) {
        super(nombre, edad, peso, alimento, sueño, domesticoNoDomestico, hogar, nombreResponsable, telefonoResponsable,
                correoResponsable, cedulaResponsable);
        this.pelaje = pelaje;
        this.datosExtra = datosExtra;
        this.cuidados = cuidados;


        assert !nombre.isBlank();
        assert !peso.isBlank();
        assert !domesticoNoDomestico.isBlank();
        assert !hogar.isBlank();
        assert !pelaje.isBlank();
    }


    //getters
    public String getPelaje() {
        return pelaje;
    }


    public String getDatosExtra() {
        return datosExtra;
    }


    public String getCuidados() {
        return cuidados;
    }


    //setters
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }


    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    @Override
    public String toString() {
        return "\n\nGato\n [nombre=" + nombre + "\n pelaje=" + pelaje + "\n edad=" + edad + "\n datosExtra=" + datosExtra
                + "\n peso=" + peso + "\n cuidados=" + cuidados + "\n alimento=" + alimento + "\n sueño=" + sueño
                + "\n domesticoNoDomestico=" + domesticoNoDomestico + "\n hogar=" + hogar + "\n nombreResponsable="
                + nombreResponsable + "\n telefonoResponsable=" + telefonoResponsable + "\n correoResponsable="
                + correoResponsable + "\n cedulaResponsable=" + cedulaResponsable + "]\n";
    }

    
    
    

    
    
}
