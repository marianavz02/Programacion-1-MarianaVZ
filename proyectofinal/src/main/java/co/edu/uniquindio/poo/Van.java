package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    public Van(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado,
            Transmision transmision, Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo) {
        super(maticula, marca, modelo, año, nuevoUsado, transmision, combustible, velocidadMax, numPasajeros,
                numPuertas, aireAcondicionado, camaraReversa, crucero, numBolsasAire, abs, sensorColision,
                sensorTraficoCruzado, asistentePermanencia, precioVehiculo);

}

@Override
public String toString() {
    return "Van [maticula=" + maticula +  "\n marca=" + marca
            + ", modelo=" + modelo + ", año=" + año + ", nuevoUsado=" + nuevoUsado + "\n transmision=" + transmision
            + ", combustible=" + combustible + ", velocidadMax=" + velocidadMax + "\n numPasajeros=" + numPasajeros
            + ", numPuertas=" + numPuertas + ", aireAcondicionado=" + aireAcondicionado + "\n camaraReversa="
            + camaraReversa + ", crucero=" + crucero + ", numBolsasAire=" + numBolsasAire + "\n abs=" + abs
            + ", sensorColision=" + sensorColision + "\n sensorTraficoCruzado=" + sensorTraficoCruzado
            + ", asistentePermanencia=" + asistentePermanencia + "\n precioVehiculo=" + precioVehiculo + "]";
}
}
