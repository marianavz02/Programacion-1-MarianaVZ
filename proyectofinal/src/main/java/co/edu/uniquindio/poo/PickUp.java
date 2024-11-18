package co.edu.uniquindio.poo;


public class PickUp extends Vehiculo{

    private String traccionP;
    private String capacidadCargaCaja;
    

    public PickUp(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado, Transmision transmision,
            Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas, boolean aireAcondicionado,
            boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo, String traccionP,
            String capacidadCargaCaja) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.traccionP = traccionP;
        this.capacidadCargaCaja = capacidadCargaCaja;
    }
    
    public String getTraccionP() {
        return traccionP;
    }
    public void setTraccionP(String traccionP) {
        this.traccionP = traccionP;
    }
    public String getCapacidadCargaCaja() {
        return capacidadCargaCaja;
    }
    public void setCapacidadCargaCaja(String capacidadCargaCaja) {
        this.capacidadCargaCaja = capacidadCargaCaja;
    }

    @Override
    public String toString() {
        return "PickUp [maticula=" + maticula + ", traccionP=" + traccionP + "\n marca=" + marca
                + ", capacidadCargaCaja=" + capacidadCargaCaja + ", modelo=" + modelo + ", año=" + año + "\n nuevoUsado="
                + nuevoUsado + ", transmision=" + transmision + ", combustible=" + combustible + "\n velocidadMax="
                + velocidadMax + ", numPasajeros=" + numPasajeros + ", numPuertas=" + numPuertas
                + "\n aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + "\n crucero="
                + crucero + ", numBolsasAire=" + numBolsasAire + ", abs=" + abs + "\n sensorColision=" + sensorColision
                + ", sensorTraficoCruzado=" + sensorTraficoCruzado + "\n asistentePermanencia=" + asistentePermanencia
                + ", precioVehiculo=" + precioVehiculo + "]";
    }

    

    


}
