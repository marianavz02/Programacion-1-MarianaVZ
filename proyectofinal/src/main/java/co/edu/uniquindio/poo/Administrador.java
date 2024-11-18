package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Administrador extends Persona{
    private String usuario;   // Nombre de usuario del administrador
    private String contrasena; // Contraseña para el acceso
    private String preguntaSeguridad;
    private String respuestaSeguridad;



    public Administrador(String nombre, String cedula, String email, String telefono, String usuario, String contrasena, String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, cedula, email, telefono);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }



    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }



    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }



    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

      // Métodos

        public void generarReporte(List<Transaccion> transacciones) {
        // Definir el formato de fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String inicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio (yyyy-MM-dd):");
        String fin = JOptionPane.showInputDialog("Ingrese la fecha de fin (yyyy-MM-dd):");


        // Convertir las fechas de inicio y fin a LocalDate
        LocalDate fechaInicio = LocalDate.parse(inicio, formatter);
        LocalDate fechaFin = LocalDate.parse(fin, formatter);

        // StringBuilder para construir el reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de transacciones del ").append(fechaInicio).append(" al ").append(fechaFin).append(":\n");

        // Filtrar las transacciones por fecha
        for (Transaccion transaccion : transacciones) {
            if ((transaccion.getFecha().isEqual(fechaInicio) || transaccion.getFecha().isAfter(fechaInicio)) &&
                (transaccion.getFecha().isEqual(fechaFin) || transaccion.getFecha().isBefore(fechaFin))) {
                reporte.append(transaccion).append("\n");
            }
        }

        // Mostrar el reporte usando JOptionPane
        if (reporte.length() > 0) {
            JOptionPane.showMessageDialog(null, reporte.toString(), "Reporte de Transacciones", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron transacciones en este rango de fechas.", "Reporte de Transacciones", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void recuperarContrasena() {
        // Mostrar la pregunta de seguridad
        String respuestaUsuario = JOptionPane.showInputDialog(null, "Pregunta de seguridad:\n" + preguntaSeguridad, 
                                                              "Recuperación de Contraseña", JOptionPane.QUESTION_MESSAGE);

        // Verificar la respuesta
        if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(respuestaSeguridad)) {
            JOptionPane.showMessageDialog(null, "Contraseña recuperada: " + contrasena, 
                                          "Recuperación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. No se pudo recuperar la contraseña.", 
                                          "Recuperación Fallida", JOptionPane.ERROR_MESSAGE);
        }
    }


        // Método para verificar acceso
        public boolean verificarAcceso() {
            // Solicitar usuario
            String usuarioIngresado = JOptionPane.showInputDialog(null, "Ingrese su usuario:", 
                                                                  "Acceso Administrador", JOptionPane.QUESTION_MESSAGE);
    
            // Si el usuario canceló la operación
            if (usuarioIngresado == null) {
                JOptionPane.showMessageDialog(null, "Acceso cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    
            // Solicitar contraseña
            String contrasenaIngresada = JOptionPane.showInputDialog(null, "Ingrese su contraseña:", 
                                                                     "Acceso Administrador", JOptionPane.QUESTION_MESSAGE);
    
            // Si el usuario canceló la operación
            if (contrasenaIngresada == null) {
                JOptionPane.showMessageDialog(null, "Acceso cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    
            // Verificar credenciales
            if (usuarioIngresado.equals(this.usuario) && contrasenaIngresada.equals(this.contrasena)) {
                JOptionPane.showMessageDialog(null, "Acceso concedido. Bienvenido, " + this.getNombre() + "!", 
                                              "Acceso Administrador", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Acceso denegado.", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }




    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", cédula='" + getCedula() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", teléfono='" + getTelefono() + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }


}
