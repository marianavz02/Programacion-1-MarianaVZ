package co.edu.uniquindio.poo;

public class Vertebrado extends Animal {
    
    private String tipo;
    private String tamaño;
    private String datosExtra;
    private String cuidados;

    //Conatructor 
    public Vertebrado(String nombre, int edad, String peso, String alimento, String sueño,
            String domesticoNoDomestico, String hogar, String nombreResponsable, String telefonoResponsable,
            String correoResponsable, String cedulaResponsable, String tipo, String tamaño, String datosExtra,
            String cuidados) {
        super(nombre, edad, peso, alimento, sueño, domesticoNoDomestico, hogar, nombreResponsable, telefonoResponsable,
                correoResponsable, cedulaResponsable);
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.datosExtra = datosExtra;
        this.cuidados = cuidados;

        assert !nombre.isBlank();
        assert !peso.isBlank();
        assert !domesticoNoDomestico.isBlank();
        assert !hogar.isBlank();
        assert !tipo.isBlank();
        
    }


    //getters
    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public String getCuidados() {
        return cuidados;
    }


    //setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }


    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }


    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }


    @Override
    public String toString() {
        return "\n\n Vertebrado\n [nombre=" + nombre + "\n edad=" + edad + "\n tipo=" + tipo + "\n peso=" + peso + "\n tamaño="
                + tamaño + "\n alimento=" + alimento + "\n datosExtra=" + datosExtra + "\n sueño=" + sueño + "\n cuidados="
                + cuidados + "\n domesticoNoDomestico=" + domesticoNoDomestico + "\n hogar=" + hogar
                + "\n nombreResponsable=" + nombreResponsable + "\n telefonoResponsable=" + telefonoResponsable
                + "\n correoResponsable=" + correoResponsable + "\n cedulaResponsable=" + cedulaResponsable + "]";
    }

    
}
