package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public String peso;
    public String alimento;
    public String sueño;
    public String domesticoNoDomestico;
    public String hogar;
    public String nombreResponsable;
    public String telefonoResponsable;
    public String correoResponsable;
    public String cedulaResponsable;


    //constructor
    public Animal(String nombre, int edad, String peso, String alimento, String sueño, String domesticoNoDomestico,
            String hogar, String nombreResponsable, String telefonoResponsable, String correoResponsable,
            String cedulaResponsable) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.alimento = alimento;
        this.sueño = sueño;
        this.domesticoNoDomestico = domesticoNoDomestico;
        this.hogar = hogar;
        this.nombreResponsable = nombreResponsable;
        this.telefonoResponsable = telefonoResponsable;
        this.correoResponsable = correoResponsable;
        this.cedulaResponsable = cedulaResponsable;


        assert !nombre.isBlank();
        assert !peso.isBlank();
        assert !domesticoNoDomestico.isBlank();
        assert !hogar.isBlank();
    }


    //getters
    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public String getPeso() {
        return peso;
    }


    public String getAlimento() {
        return alimento;
    }


    public String getSueño() {
        return sueño;
    }


    public String getDomesticoNoDomestico() {
        return domesticoNoDomestico;
    }


    public String getHogar() {
        return hogar;
    }


    public String getNombreResponsable() {
        return nombreResponsable;
    }


    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }


    public String getCorreoResponsable() {
        return correoResponsable;
    }


    public String getCedulaResponsable() {
        return cedulaResponsable;
    }



    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setSueño(String sueño) {
        this.sueño = sueño;
    }

    public void setDomesticoNoDomestico(String domesticoNoDomestico) {
        this.domesticoNoDomestico = domesticoNoDomestico;
    }

    public void setHogar(String hogar) {
        this.hogar = hogar;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public void setCorreoResponsable(String correoResponsable) {
        this.correoResponsable = correoResponsable;
    }

    public void setCedulaResponsable(String cedulaResponsable) {
        this.cedulaResponsable = cedulaResponsable;
    }
    
    

    


    
}
