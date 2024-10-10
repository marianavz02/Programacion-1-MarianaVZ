package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        
        //crear
        Veterinaria veterinaria= new Veterinaria("Vetelrey", "Armenia", "7am - 7pm");
        Gato gato1=new Gato("gojo", 6, "6kg", "concentrado", "Regular", "Domestico","cra18", "Juan", "315255555", "Juan@mail", "41907777", "tigrado", "nada", "nada");
        Perro perro1=new Perro("loki", 1,"1kg", "concentrado", "Regular", "Domestico","cra19", "Gladis", "3146789345", "gladis@", "4256789987", "Beagle", "nada", "vacunas");
        Invertebrado invertebrado1=new Invertebrado("luna", 1,"1kg" , "insectos", "noaplics", "domestico", "conjunto aire", "Daniel", "31567899", "daniel@", "419087720", "araña", "mediana", "nada", "medicina");  
        Vertebrado vertebrado1=new Vertebrado("lucy", 1,"90kg" , "carne", "regular", "nodomestico", "reserva natural", "proteccion al animal", "3154382688", "preteccion@", "noAplica", "leon", "grande", "nada", "medicina");   
        

        
        //agregar
        veterinaria.agregarGato(gato1);
        veterinaria.agregarPerro(perro1);
        veterinaria.agregarInvertebrado(invertebrado1);
        veterinaria.agregarVertebrado(vertebrado1);




        Veterinaria.mostrarMensaje(veterinaria.toString());
    }
}
