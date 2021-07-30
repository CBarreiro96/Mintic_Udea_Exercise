package herencia.personas;

import herencia.vehiculos.Vehiculo;

public class Persona {
    protected String id;
    protected String nombre;
    protected String apellidos;
    protected Vehiculo vehiculo;

    public Persona(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String imprimirNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
