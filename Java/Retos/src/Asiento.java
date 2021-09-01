public abstract class Asiento {
    private char tipo;
    private String ID;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncendida = false;
    private boolean luzAsistenciaEncendida = false;
    private boolean aireAcondicionadoEncendido = false;

    //Constructor
    public Asiento(String ID, char tipo) {
        this.tipo = tipo;
        this.ID = ID;
    }


    //Metodos

    public void gestionarAireAcondicionado(){
        if (!isAireAcondicionadoEncendido()){
            setAireAcondicionadoEncendido(true);
        } else {
            setAireAcondicionadoEncendido(false);
        }
    }
    public void gestionarPantalla(){
        if (!isPantallaEncendida()){
            setPantallaEncendida(true);
        } else {
            setPantallaEncendida(false);
        }
    }
    public void gestionarLuzLectura(){
        if (!isLuzLecturaEncendida()){
            setLuzLecturaEncendida(true);
        } else {
            setLuzLecturaEncendida(false);
        }
    }
    public void gestionarLuzAsistencia(){
        if (!isLuzAsistenciaEncendida()){
            setLuzAsistenciaEncendida(true);
        } else {
            setLuzAsistenciaEncendida(false);
        }

    }
    public void aumentarInclinacion(double d){
        double suma = getInclinacionSilla() + d;
        if (suma < 136){
            setInclinacionSilla(getInclinacionSilla() + d);
        }

    }
    public void disminuirInclinacion(double d){
        double resta = getInclinacionSilla() - d;
        if (resta > 0){
            setInclinacionSilla(getInclinacionSilla() - d);
        }
    }

    public abstract String imprimirMenuPantalla();



    //Getter and setter

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public char getTipo() {
        return tipo;
    }

    public String getID() {
        return ID;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
}

