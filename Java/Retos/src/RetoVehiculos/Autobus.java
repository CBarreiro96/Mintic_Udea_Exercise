package RetoVehiculos;

public class Autobus extends Vehiculo{
    private boolean puertaAbierta = false;

    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }

    public Autobus(String nombreConductor) {
        super(nombreConductor);
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void recogerPasajero(int estrato){
        if (!isEnMarcha() && isPuertaAbierta() &&(getnPasajeros() < getnMaximoPasajeros())){
            setCantidadDinero(calcularPasaje(estrato));
            setnPasajeros(getnPasajeros() + 1);
        }
    }

    @Override
    public void gestionarMarcha(){
        if (!isEnMarcha() && !puertaAbierta){
            setEnMarcha(true);
        } else {
            setEnMarcha(false);
        }

    }
    public void gestionarPuerta(){
        if (!isEnMarcha() && !puertaAbierta){
            puertaAbierta = true;
        } else {
            puertaAbierta = false;
        }
    }

    public static double calcularPasaje(int estrato) {
        double Precio = 0;

        if (estrato >= 0 && estrato < 3) {
            Precio = 1500;
        } else if (estrato > 2 && estrato < 5) {
            Precio = 2600;
        } else if (estrato > 4 && estrato < 7) {
            Precio = 3000;
        }
        return Precio;
    }
}
