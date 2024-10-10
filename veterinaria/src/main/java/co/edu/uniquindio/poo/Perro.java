package co.edu.uniquindio.poo;

public class Perro extends Animal {

    private String raza;
    private String datosExtra;
    private String cuidados;

    //constructor
    public Perro(String nombre, int edad, String peso, String alimento, String sueño, String domesticoNoDomestico,
            String hogar, String nombreResponsable, String telefonoResponsable, String correoResponsable,
            String cedulaResponsable, String raza, String datosExtra, String cuidados) {
        super(nombre, edad, peso, alimento, sueño, domesticoNoDomestico, hogar, nombreResponsable, telefonoResponsable,
                correoResponsable, cedulaResponsable);
        this.raza = raza;
        this.datosExtra = datosExtra;
        this.cuidados = cuidados;

        assert !nombre.isBlank();
        assert !peso.isBlank();
        assert !domesticoNoDomestico.isBlank();
        assert !hogar.isBlank();
        assert !raza.isBlank();


    }

    
    //getters
    public String getRaza() {
        return raza;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public String getCuidados() {
        return cuidados;
    }


    //setters
    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    @Override
    public String toString() {
        return "\n\nPerro\n [nombre=" + nombre + "\n raza=" + raza + "\n edad=" + edad + "\n datosExtra=" + datosExtra
                + "\n peso=" + peso + "\n alimento=" + alimento + "\n cuidados=" + cuidados + "\n sueño=" + sueño
                + "\n domesticoNoDomestico=" + domesticoNoDomestico + "\n hogar=" + hogar + "\n nombreResponsable="
                + nombreResponsable + "\n telefonoResponsable=" + telefonoResponsable + "\n correoResponsable="
                + correoResponsable + "\n cedulaResponsable=" + cedulaResponsable + "]\n";
    }

    
    
    

    
    
}
