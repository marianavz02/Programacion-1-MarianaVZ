package co.edu.uniquindio.poo;



public class Deportivo extends Vehiculo{
    private int caballosFuerza;
    private double tiempo100k;
    private int cambiosDeportivo;
    public Deportivo(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado,
            Transmision transmision, Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo,
            int caballosFuerza, double tiempo100k, int cambiosDeportivo) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);
        this.caballosFuerza = caballosFuerza;
        this.tiempo100k = tiempo100k;
        this.cambiosDeportivo = cambiosDeportivo;
    }
    public int getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public double getTiempo100k() {
        return tiempo100k;
    }
    public void setTiempo100k(double tiempo100k) {
        this.tiempo100k = tiempo100k;
    }
    public int getCambiosDeportivo() {
        return cambiosDeportivo;
    }
    public void setCambiosDeportivo(int cambiosDeportivo) {
        this.cambiosDeportivo = cambiosDeportivo;
    }
    @Override
    public String toString() {
        return "Deportivo [maticula=" + maticula + ", caballosFuerza=" + caballosFuerza + "\n marca=" + marca
                + ", tiempo100k=" + tiempo100k + ", modelo=" + modelo + ", año=" + año + "\n cambiosDeportivo="
                + cambiosDeportivo + ", nuevoUsado=" + nuevoUsado + ", transmision=" + transmision + "\n combustible="
                + combustible + ", velocidadMax=" + velocidadMax + ", numPasajeros=" + numPasajeros + "\n numPuertas="
                + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "\n camaraReversa=" + camaraReversa
                + ", crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + ", abs=" + abs + "\n sensorColision="
                + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado + "\n asistentePermanencia="
                + asistentePermanencia + ", precioVehiculo=" + precioVehiculo + "]";
    } 

    



    

}
