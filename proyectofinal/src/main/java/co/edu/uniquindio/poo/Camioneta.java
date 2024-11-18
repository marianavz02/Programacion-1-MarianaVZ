package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo{
    private String traccion;

    public Camioneta(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado,
            Transmision transmision, Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo,
            String traccion) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "Camioneta [maticula=" + maticula + ", traccion=" + traccion + ", marca=" + marca + "\n modelo=" + modelo
                + ", año=" + año + ", nuevoUsado=" + nuevoUsado + ", transmision=" + transmision + "\n combustible="
                + combustible + ", velocidadMax=" + velocidadMax + ", numPasajeros=" + numPasajeros + "\n numPuertas="
                + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "\n camaraReversa=" + camaraReversa
                + ", crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + ", abs=" + abs + "\n sensorColision="
                + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado + "\n asistentePermanencia="
                + asistentePermanencia + ", precioVehiculo=" + precioVehiculo + "]";
    }
    
    

}
