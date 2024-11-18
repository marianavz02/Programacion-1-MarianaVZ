package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String cedula, String email, String telefono, TipoCliente tipoCliente) {
        super(nombre, cedula, email, telefono);
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", tipoCliente=" + tipoCliente + ", cedula=" + cedula + ", email=" + email
                + ", telefono=" + telefono + "]";
    }

}
