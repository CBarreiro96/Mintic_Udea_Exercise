public class SIMCard {
    private String empresaTelefonia = "HI";
    private Double saldo = 0.0;
    private String numeroTelefono;
    private boolean celularApagado = true;
    private boolean modoAvionActivado = false;
    private boolean datosActivados = false;
    private int saldoDatos = 0;

    public SIMCard(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    public void comprarDatos(int cantidadGB){
        int costo = 0;
        if (cantidadGB > 0 && cantidadGB < 11){
            costo = cantidadGB * 3000;
        } else if (cantidadGB < 31){
            costo = (10 * 3000) + ((cantidadGB - 10) * 2500);
        } else {
            costo = (20 * 3000) + ((cantidadGB -20) *1500);
        }
        if (saldo > costo){
            saldo -= costo;
            saldoDatos += costo;
        }
        System.out.println();
    }

    public void consumirDatos(int cantidadGB){
        if (!celularApagado && cantidadGB > 0 && saldoDatos > cantidadGB){
            saldoDatos -= cantidadGB;
        }
    }

    public void llamar(int segundosGastados){
        int costo = 0;
        if (celularApagado){
            if (segundosGastados > 0 && segundosGastados < 60){
                costo = segundosGastados;
            } else if (segundosGastados > 60){
                costo = (60) + ((segundosGastados - 60) * (1/2));
            }
        }
        saldo -= costo;
    }

    public void recargarSaldo (double cantidadSaldo){
        if (cantidadSaldo > 0){
            saldo += cantidadSaldo;
        }
    }

    public void gestionarEncendidoCelular(){
        celularApagado = !celularApagado;
        if (celularApagado){
            datosActivados = false;
            modoAvionActivado = false;
        }
    }

    public void gestionarModoAvion(){
        if (!celularApagado){
            modoAvionActivado = !modoAvionActivado;
            if (!modoAvionActivado){
                datosActivados = false;
            }
        }
    }
    public  void gestionarDatos(){
        if (!celularApagado){
                datosActivados = !datosActivados;
        }

    }
}
