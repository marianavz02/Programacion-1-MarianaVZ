package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {

    private int cilindraje;
    private int cambios;
    public Moto(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado, Transmision transmision,
            Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas, boolean aireAcondicionado,
            boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo, int cilindraje,
            int cambios) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.cilindraje = cilindraje;
        this.cambios = cambios;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
    @Override
    public String toString() {
        return "Moto [maticula=" + maticula + ", cilindraje=" + cilindraje + ", marca=" + marca + "\n cambios=" + cambios
                + ", modelo=" + modelo + ", año=" + año + ", nuevoUsado=" + nuevoUsado + "\n transmision=" + transmision
                + ", combustible=" + combustible + ", velocidadMax=" + velocidadMax + "\n numPasajeros=" + numPasajeros
                + ", numPuertas=" + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "\n camaraReversa="
                + camaraReversa + ", crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + "\n abs=" + abs
                + ", sensorColision=" + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + "\n asistentePermanencia=" + asistentePermanencia + ", precioVehiculo=" + precioVehiculo + "]";
    }


    

    
    
}
