package co.edu.uniquindio.poo;

public class Vehiculo {

    public String maticula;
    public String marca;
    public String modelo;
    public int año;
    public NuevoUsado nuevoUsado;
    public Transmision transmision;
    public Combustible combustible;
    public int velocidadMax;
    public int numPasajeros;
    public int numPuertas;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public boolean crucero;
    public int numBolsasAire;
    public boolean abs;
    public boolean sensorColision;
    public boolean sensorTraficoCruzado;
    public boolean asistentePermanencia;
    public int precioVehiculo;


    public Vehiculo(String maticula, String marca, String modelo, int año, NuevoUsado nuevoUsado,
            Transmision transmision, Combustible combustible, int velocidadMax, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraReversa, boolean crucero, int numBolsasAire, boolean abs,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentePermanencia, int precioVehiculo) {
        this.maticula = maticula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.nuevoUsado = nuevoUsado;
        this.transmision = transmision;
        this.combustible = combustible;
        this.velocidadMax = velocidadMax;
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.crucero = crucero;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanencia = asistentePermanencia;
        this.precioVehiculo = precioVehiculo;
    }


    public String getMaticula() {
        return maticula;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public int getAño() {
        return año;
    }


    public NuevoUsado getNuevoUsado() {
        return nuevoUsado;
    }


    public Transmision getTransmision() {
        return transmision;
    }


    public Combustible getCombustible() {
        return combustible;
    }


    public int getVelocidadMax() {
        return velocidadMax;
    }


    public int getNumPasajeros() {
        return numPasajeros;
    }


    public int getNumPuertas() {
        return numPuertas;
    }


    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }


    public boolean isCamaraReversa() {
        return camaraReversa;
    }


    public boolean isCrucero() {
        return crucero;
    }


    public int getNumBolsasAire() {
        return numBolsasAire;
    }


    public boolean isAbs() {
        return abs;
    }


    public boolean isSensorColision() {
        return sensorColision;
    }


    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }


    public boolean isAsistentePermanencia() {
        return asistentePermanencia;
    }


    public int getPrecioVehiculo() {
        return precioVehiculo;
    }



//setters
    public void setMaticula(String maticula) {
        this.maticula = maticula;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setAño(int año) {
        this.año = año;
    }


    public void setNuevoUsado(NuevoUsado nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }


    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }


    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }


    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }


    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }


    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }


    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }


    public void setCrucero(boolean crucero) {
        this.crucero = crucero;
    }


    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }


    public void setAbs(boolean abs) {
        this.abs = abs;
    }


    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }


    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }


    public void setAsistentePermanencia(boolean asistentePermanencia) {
        this.asistentePermanencia = asistentePermanencia;
    }


    public void setPrecioVehiculo(int precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }


    


    
    
}
