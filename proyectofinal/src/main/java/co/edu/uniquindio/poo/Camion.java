package co.edu.uniquindio.poo;

public class Camion extends Vehiculo{

    TipoCamion tipoCamion;
    private String capacidadCarga;
    private boolean frenosAire;
    private int numEjesCamion;
    public Camion(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado, Transmision transmision,
            Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas, boolean aireAcondicionado,
            boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs, boolean sensorColision,
            boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo, TipoCamion tipoCamion,
            String capacidadCarga, boolean frenosAire, int numEjesCamion) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        this.numEjesCamion = numEjesCamion;
    }
    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    public String getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public boolean isFrenosAire() {
        return frenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }
    public int getNumEjesCamion() {
        return numEjesCamion;
    }
    public void setNumEjesCamion(int numEjesCamion) {
        this.numEjesCamion = numEjesCamion;
    }
    @Override
    public String toString() {
        return "Camion [maticula=" + maticula + ", tipoCamion=" + tipoCamion + ", marca=" + marca + "\n capacidadCarga="
                + capacidadCarga + ", modelo=" + modelo + ", año=" + año + ", frenosAire=" + frenosAire
                + "\n nuevoUsado=" + nuevoUsado + ", numEjesCamion=" + numEjesCamion + ", transmision=" + transmision
                + "\n combustible=" + combustible + ", velocidadMax=" + velocidadMax + ", numPasajeros=" + numPasajeros
                + "\n numPuertas=" + numPuertas + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa="
                + camaraReversa + "\n crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + ", abs=" + abs
                + "\n sensorColision=" + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + "\n asistentePermanencia=" + asistentePermanencia + ", precioVehiculo=" + precioVehiculo
                + "]";
    }

    

    


    
}
