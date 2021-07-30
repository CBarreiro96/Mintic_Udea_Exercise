package herencia.personas;

import herencia.vehiculos.Vehiculo;

import java.util.Date;

public class Empleado extends  Persona{
    protected String cargo;
    protected Date fechaingreso;


    public Empleado(String id, String nombre,String apellidos, String cargo, Date fechaingreso) {
        super(id,nombre,apellidos);
        this.cargo = cargo;
        this.fechaingreso = fechaingreso;
    }

    public Empleado(String id, String nombre, String apellido, Vehiculo vehiculo) {
        super(id,nombre,apellido);
        this.vehiculo = vehiculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
}
