package personas;


import vehiculos.Vehiculo;

import java.util.Date;

public class Socio extends Empleado{

    private int acciones;

    public Socio(String id, String nombre, String apellido, Vehiculo vehiculo, int acciones) {
        super(id, nombre, apellido, vehiculo);
        this.acciones = acciones;
    }


    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
}
