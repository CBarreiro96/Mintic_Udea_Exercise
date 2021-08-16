package RetoVehiculos;

public class Taxi extends Vehiculo{
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;
    private boolean identificador = false;

    //Constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor);
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }

    //metodos
    public void reiniciarTaximetro(){
        setDistanciaRecorrida(0);
    }
    public void presionarBotonPanico(){
        setEnMarcha(false);
        setSegurosActivados(false);
        identificador = true;
        dejarPasajero();
        identificador = false;
    }

    @Override
    public void dejarPasajero(){

        if (isEnMarcha() == false && getnPasajeros() > 0 && isSegurosActivados()==false){
            System.out.println("Emtro");
            setnPasajeros(getnPasajeros()-1);
            System.out.println("Identificador" + identificador);
            if (identificador){
                setCantidadDinero(0);
            } else {
                setCantidadDinero(calcularPasaje());
            }
            System.out.println("Distancia Recorrida"+ distanciaRecorrida);
            reiniciarTaximetro();
            System.out.println("Distancia Recorrida"+ distanciaRecorrida);
        }

    }
    public void recogerPasajero(){
        if (!isEnMarcha() && (getnPasajeros() < getnMaximoPasajeros())) {
            setnPasajeros(getnPasajeros()+1);
            System.out.println("entroaSW");
            System.out.println("Distancia RecorridaRP"+ distanciaRecorrida);
        }
    }
    public void gestionarSeguros(){
        if (!isEnMarcha() && isSegurosActivados()){
            setSegurosActivados(false);
        }else {
            setSegurosActivados(true);
        }
        System.out.println("Distancia RecorridaGS"+ distanciaRecorrida);

    }


    public double calcularPasaje(){
        double Precio = 3000 + (2300*distanciaRecorrida);
        return Precio;
    }
    @Override
    public void moverDerecha(double d){
        if (isEnMarcha()){
            setLocalizacionX(getLocalizacionX() + d);
            if (getnPasajeros() > 0){
                distanciaRecorrida += d;
            }
        }

    }
    @Override
    public void moverIzquierda(double d){
        if (isEnMarcha()){
            setLocalizacionX(getLocalizacionX()-d);
            if (getnPasajeros() > 0){
                distanciaRecorrida += d;
            }
        }

    }
    @Override
    public void  moverAbajo(double d){
        if (isEnMarcha()){
            setLocalizacionY(getLocalizacionY()-d);
            if (getnPasajeros() > 0){
                distanciaRecorrida += d;
            }
        }

    }
    @Override
    public void moverArriba(double d){
        if (isEnMarcha()){
            setLocalizacionY(getLocalizacionY()+d);
            if (getnPasajeros() > 0){
                distanciaRecorrida += d;
            }
        }

    }
    @Override
    public void gestionarMarcha(){
        if (isEnMarcha()==false && segurosActivados==true){
            setEnMarcha(true);
        }else if(identificador){
            setEnMarcha(false);
        }else {
            setEnMarcha(false);
        }
        System.out.println("Distancia RecorridaGM"+ distanciaRecorrida);
    }
}
