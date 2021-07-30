package herencia.personas;

public class Clientes extends Persona {
    private int noPedidos;
    private String clasificacion;

    public Clientes(String id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
    }

    public void solicitarDomicilio(){
        noPedidos++;
        resolverClasificacionCliente();
    }

    public void resolverClasificacionCliente() {
        if(this.noPedidos <= 2){
            this.clasificacion = "Cliente Bronce";
        } else if (this.noPedidos <= 5){
            this.clasificacion = "Cliente Plata";
        }else{
            this.clasificacion = "Cliente Oro";
        }
    }

    public int getNoPedidos() {
        return noPedidos;
    }

    public void setNoPedidos(int noPedidos) {
        this.noPedidos = noPedidos;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    @Override
    public String imprimirNombre() {
        return nombre + " " + apellidos;
    }

}
