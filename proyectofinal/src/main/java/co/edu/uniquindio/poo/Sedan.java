package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo{

    private double capacidadMaletero;

    public Sedan(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado, Transmision transmision,
            Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas, boolean aireAcondicionado,
            boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo, double capacidadMaletero) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.capacidadMaletero = capacidadMaletero;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Sedan [maticula=" + maticula + ", capacidadMaletero=" + capacidadMaletero + "\n marca=" + marca
                + ", modelo=" + modelo + ", año=" + año + ", nuevoUsado=" + nuevoUsado + "\n transmision=" + transmision
                + ", combustible=" + combustible + ", velocidadMax=" + velocidadMax + "\n numPasajeros=" + numPasajeros
                + ", numPuertas=" + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "\n camaraReversa="
                + camaraReversa + ", crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + "\n abs=" + abs
                + ", sensorColision=" + sensorColision + "\n sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistentePermanencia=" + asistentePermanencia + "\n precioVehiculo=" + precioVehiculo + "]";
    }

    

    
    
}
