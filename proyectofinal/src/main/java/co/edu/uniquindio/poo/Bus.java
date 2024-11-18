package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int numEjes;
    private int numSalidasEmergencia;
    public Bus(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado, Transmision transmision,
            Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas, boolean aireAcondicionado,
            boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo, int numEjes,
            int numSalidasEmergencia) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
    }
    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }
    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
    }
    @Override
    public String toString() {
        return "Bus [maticula=" + maticula + ", numEjes=" + numEjes + ", marca=" + marca + "\n numSalidasEmergencia="
                + numSalidasEmergencia +  " modelo=" + modelo + ", año=" + año + "\n nuevoUsado=" + nuevoUsado
                + ", transmision=" + transmision + ", combustible=" + combustible + "\n velocidadMax=" + velocidadMax
                + ", numPasajeros=" + numPasajeros + ", numPuertas=" + numPuertas + "\n aireAcondicionado="
                + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", crucero=" + crucero + "\n numBolsasAire="
                + numBolsasAire + ", abs=" + abs + ", sensorColision=" + sensorColision + "\n sensorTraficoCruzado="
                + sensorTraficoCruzado + ", asistentePermanencia=" + asistentePermanencia + "\n precioVehiculo="
                + precioVehiculo + "]";
    }

    

    

}
