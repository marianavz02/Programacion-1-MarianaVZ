package co.edu.uniquindio.poo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.Grupo.Categoria;


public class Agenda{
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    public Agenda() {
        contactos = new ArrayList<>();
        grupos = new ArrayList<>();
        reuniones = new ArrayList<>();
    }

    public void mostrarMenu() {
        String[] opciones = {"Gestionar Contactos", "Gestionar Grupos", "Gestionar Reuniones", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Agenda de Contactos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> gestionarContactos();
                case 1 -> gestionarGrupos();
                case 2 -> gestionarReuniones();
            }
        } while (opcion != 3);
    }

    private void gestionarContactos() {
        String[] opciones = {"Agregar Contacto", "Modificar Contacto", "Eliminar Contacto", "Listar Contactos", "Volver"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestionar Contactos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> agregarContacto();
                case 1 -> modificarContacto();
                case 2 -> eliminarContacto();
                case 3 -> listarContactos();
            }
        } while (opcion != 4);
    }



    private void agregarContacto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String alias = JOptionPane.showInputDialog("Ingrese el alias:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
        String email = JOptionPane.showInputDialog("Ingrese el email:");

        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);
        contactos.add(contacto);

        if (existeContacto(contacto)) {
            JOptionPane.showMessageDialog(null, "El contacto ya existe.");
        } else {
            contactos.add(contacto);
            JOptionPane.showMessageDialog(null, "Contacto agregado con éxito.");
        }
    } 
    
    private boolean existeContacto(Contacto contacto) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(contacto.getNombre()) && c.getTelefono().equals(contacto.getTelefono())) {
                return true;
            }
        }
        return false;
    }
    


    private void modificarContacto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a modificar:");
        Contacto contacto = buscarContactoPorNombre(nombre);

        if (contacto != null) {
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", contacto.getNombre());
            String nuevoAlias = JOptionPane.showInputDialog("Ingrese el nuevo alias:", contacto.getAlias());
            String nuevaDireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección:", contacto.getDireccion());
            String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:", contacto.getTelefono());
            String nuevoEmail = JOptionPane.showInputDialog("Ingrese el nuevo email:", contacto.getEmail());

            contacto.setNombre(nuevoNombre);
            contacto.setAlias(nuevoAlias);
            contacto.setDireccion(nuevaDireccion);
            contacto.setTelefono(nuevoTelefono);
            contacto.setEmail(nuevoEmail);

            JOptionPane.showMessageDialog(null, "Contacto modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
        }
    }

    private void eliminarContacto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar:");
        Contacto contacto = buscarContactoPorNombre(nombre);

        if (contacto != null) {
            contactos.remove(contacto);
            JOptionPane.showMessageDialog(null, "Contacto eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
        }
    }

    private void listarContactos() {
        StringBuilder lista = new StringBuilder("Lista de Contactos:\n");
        for (Contacto contacto : contactos) {
            lista.append(contacto).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private Contacto buscarContactoPorNombre(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    private void gestionarGrupos() {
        String[] opciones = {"Agregar Grupo", "Agregar Contacto a Grupo", "Eliminar Contacto de Grupo", "Listar Grupos", "Volver"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestionar Grupos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> agregarGrupo();
                case 1 -> agregarContactoAGrupo();
                case 2 -> eliminarContactoDeGrupo();
                case 3 -> listarGrupos();
            }
        } while (opcion != 4);
    }

    private void agregarGrupo() {
        String nombreGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo:");
        String[] categorias = {"OFICINA", "FIESTA", "AMIGOS", "FAMILIA"};
        String categoriaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la categoría",
                "Categoría", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);

        Grupo.Categoria categoria = Grupo.Categoria.valueOf(categoriaSeleccionada);
        Grupo grupo = new Grupo(nombreGrupo, categoria, contactos);
        grupos.add(grupo);

        JOptionPane.showMessageDialog(null, "Grupo creado con éxito.");
    }


        private void agregarContactoAGrupo() {
        // Solicitar el nombre del grupo
        String nombreGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo:");
        Grupo grupo = buscarGrupoPorNombre(nombreGrupo);

        if (grupo != null) {
            // Solicitar los nombres de los contactos separados por comas
            String contactosInput = JOptionPane.showInputDialog("Ingrese los nombres de los contactos separados por comas:");

            // Validar la entrada
            if (contactosInput != null && !contactosInput.trim().isEmpty()) {
                List<String> nombresContactos = Arrays.asList(contactosInput.split("\\s*,\\s*"));

                if (nombresContactos.size() >= 5) {
                    // Buscar y agregar los contactos al grupo
                    for (String nombreContacto : nombresContactos) {
                        Contacto contacto = buscarContactoPorNombre(nombreContacto.trim());
                        if (contacto != null) {
                            grupo.agregarContacto(contacto);
                        } else {
                            JOptionPane.showMessageDialog(null, "Contacto \"" + nombreContacto + "\" no encontrado.");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Contactos agregados al grupo con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar al menos 5 contactos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresaron contactos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Grupo no encontrado.");
        }
    }



    private void eliminarContactoDeGrupo() {
        String nombreGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo:");
        Grupo grupo = buscarGrupoPorNombre(nombreGrupo);

        if (grupo != null) {
            String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar:");
            Contacto contacto = buscarContactoPorNombre(nombreContacto);

            if (contacto != null) {
                grupo.eliminarContacto(contacto);
            } else {
                JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Grupo no encontrado.");
        }
    }


    private void listarGrupos() {
        StringBuilder lista = new StringBuilder("Lista de Grupos:\n");
        for (Grupo grupo : grupos) {
            lista.append(grupo).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private Grupo buscarGrupoPorNombre(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombreGrupo().equalsIgnoreCase(nombre)) {
                return grupo;
            }
        }
        return null;
    }

    private void gestionarReuniones() {
        String[] opciones = {"Crear Reunión", "Agregar Asistente", "Eliminar Asistente", "Listar Reuniones", "Volver"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestionar Reuniones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> crearReunion();
                case 1 -> agregarAsistente();
                case 2 -> eliminarAsistente();
                case 3 -> listarReuniones();
            }
        } while (opcion != 4);
    }

    private Date parseFecha(String fechaStr) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false);
        try {
            return formatoFecha.parse(fechaStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use dd/MM/yyyy.");
            return new Date();
        }
    }

    private void crearReunion() {
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la reunión:");
        String fechaStr = JOptionPane.showInputDialog("Ingrese la fecha de la reunión (dd/MM/yyyy):");
        Date fecha = parseFecha(fechaStr);
        String horaStr = JOptionPane.showInputDialog("Ingrese la hora de la reunión (HH:MM):");
        LocalTime hora = LocalTime.parse(horaStr);

        Reunion reunion = new Reunion(descripcion, fecha, hora);
        reuniones.add(reunion);

        JOptionPane.showMessageDialog(null, "Reunión creada con éxito.");
    }

    private void agregarAsistente() {
        String descripcionReunion = JOptionPane.showInputDialog("Ingrese la descripción de la reunión:");
        Reunion reunion = buscarReunionPorDescripcion(descripcionReunion);

        if (reunion != null) {
            String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto a agregar:");
            Contacto contacto = buscarContactoPorNombre(nombreContacto);

            if (contacto != null) {
                reunion.agregarAsistente(contacto);
                JOptionPane.showMessageDialog(null, "Asistente agregado a la reunión.");
            } else {
                JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Reunión no encontrada.");
        }
    }

    private void eliminarAsistente() {
        String descripcionReunion = JOptionPane.showInputDialog("Ingrese la descripción de la reunión:");
        Reunion reunion = buscarReunionPorDescripcion(descripcionReunion);

        if (reunion != null) {
            String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar:");
            Contacto contacto = buscarContactoPorNombre(nombreContacto);

            if (contacto != null) {
                reunion.eliminarAsistente(contacto);
                JOptionPane.showMessageDialog(null, "Asistente eliminado de la reunión.");
            } else {
                JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Reunión no encontrada.");
        }
    }

    private void listarReuniones() {
        StringBuilder lista = new StringBuilder("Lista de Reuniones:\n");
        for (Reunion reunion : reuniones) {
            lista.append(reunion).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private Reunion buscarReunionPorDescripcion(String descripcion) {
        for (Reunion reunion : reuniones) {
            if (reunion.getDescripcion().equalsIgnoreCase(descripcion)) {
                return reunion;
            }
        }
        return null;
    }
}







