package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        

    //Crear la biblioteca
    Biblioteca biblioteca = new Biblioteca("Biblioteca1");
    


    //Crear bibliotecario y estudiante 
    Bibliotecario bibliotecario= new Bibliotecario("Juan", "419022788", "3152776389", "Juanbiblio@gmail", false, false);
    Estudiante estudiante = new Estudiante("lina", "41789876", "3168836739", "lina@gmail");



    //Crear libros
    Libro libro1= new Libro("1", "123", "Laura", "Magia", "Independiente","2022-04-02", 12, 0);





    //Crear prestamo
    Prestamo prestamo1= new Prestamo(estudiante, bibliotecario, "Febrero");


    //Adicionar libro al prestamo
    boolean libroAñadido = prestamo1.adicionarLibro(libro1);
    if (libroAñadido) {
        System.out.println("El libro '" + libro1.getTitulo() + "' ha sido añadido al préstamo.");
    } else {
        System.out.println("No se pudo añadir el libro al préstamo.");
    }
  

      //Agregar Bibliotecario y Estudiante
      biblioteca.agregarBibliotecario(bibliotecario);
      biblioteca.agregarEstudiante(estudiante);
      biblioteca.agregarLibro(libro1);
      biblioteca.agregarPrestamo(prestamo1);
      bibliotecario.agregarPrestamo(prestamo1);
      estudiante.agregarPrestamo(prestamo1);






    //Mostrar mensajes 
    Biblioteca.mostrarMensaje(biblioteca.toString());

        // Consultar préstamos por título
        int prestamosHechos = biblioteca.consultarPrestamosPorTitulo("Magia");
        System.out.println("Cantidad de préstamos hechos de Magia: " + prestamosHechos);
    }

}


