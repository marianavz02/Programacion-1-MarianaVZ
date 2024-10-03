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
    Bibliotecario bibliotecario= new Bibliotecario("Juan", "419235677", "3145789029", "juanbiblioteca@gmail", 1000000, 2);
    Estudiante estudiante = new Estudiante("lina", "41789876", "3168836739", "lina@gmail");



    //Crear libros
    Libro libro= new Libro("1", "123", "Laura", "Magia", "Independiente","2022-04-02", 12, 0);


    //Agregar Bibliotecario y Estudiante a la biblioteca
    biblioteca.agregarBibliotecario(bibliotecario);
    biblioteca.agregarEstudiante(estudiante);
    biblioteca.agregarLibro(libro);


    //Crear prestamo
    Prestamo prestamo= new Prestamo(estudiante,bibliotecario,"2024-05-02");


    //Adicionar libro al prestamo
    prestamo.adicionarLibro(libro);




  



    //Mostrar mensajes 
    Biblioteca.mostrarMensaje(biblioteca.toString());
    Estudiante.mostrarMensaje(estudiante.toString());
    Reporte.mostrarMensaje(reporte.toString);
    Prestamo.mostrarMensaje(prestamo.toString());
    Libro.mostrarMensaje(libro.toString());
    Bibliotecario.mostrarMensaje(bibliotecario.toString());




        //Consultar libro por titulo
        String tituloBuscado = "Libro de Java";
        int cantidadPrestamos = biblioteca.consultarPrestamosPorTitulo(tituloBuscado);
        System.out.println("El libro '" + tituloBuscado + "' ha sido prestado " + cantidadPrestamos + " veces.");








}


}