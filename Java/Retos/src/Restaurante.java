import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Pedido> pedidos= new ArrayList<>();
    private Pedido pedidoSeleccionado;

    // Getter and setter


    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    public Pedido getPedidoSeleccionado() {
        return pedidoSeleccionado;
    }

    public void setPedidoSeleccionado(Pedido pedidoSeleccionado) {
        this.pedidoSeleccionado = pedidoSeleccionado;
    }

    //Metodods
    public void buscar(String nPedido){
        for (Pedido pedido : this.pedidos){
            if (pedido.getnPedido().equalsIgnoreCase(nPedido)){
                setPedidoSeleccionado(pedido);
            }
        }

    }

    public void agregarPedidoLista(Pedido p){
        buscar(p.getnPedido());
        if (getPedidoSeleccionado() == null){
            pedidos.add(p);
        }
        setPedidoSeleccionado(null);
    }

    public void eliminarPedido(String ID){
        buscar(ID);
        if (getPedidoSeleccionado() != null){
            pedidos.remove(getPedidoSeleccionado());
        }
        setPedidoSeleccionado(null);
    }
     public double calcularGanancias(){
        double costoTodosPedidos = 0.0;

        for (Pedido pedido : this.pedidos){
            costoTodosPedidos += pedido.getCostoPedido();
        }
        return costoTodosPedidos;
     }

     public double promedioGananciasTotales(){
        return calcularGanancias()/pedidos.size();
     }
     public double desviacionEstandarGananciasTotales(){
        double total = 0.0;

        for (Pedido pedido : this.pedidos){
            total += Math.pow(pedido.getCostoPedido()-promedioGananciasTotales(),2);
        }
        return Math.sqrt((1/(double)this.pedidos.size()) * total);
     }

     public double retornarCostoPedido(String ID){
        double costoPedido = 0.0;
        buscar(ID);
        if (getPedidoSeleccionado() != null){
            costoPedido = getPedidoSeleccionado().getCostoPedido();
        }
        setPedidoSeleccionado(null);
        return costoPedido;
     }

}
