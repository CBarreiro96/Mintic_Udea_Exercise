public class Estudiante {
    private String documento;
    private String nombre;
    private String appelido;
    private int edad;
    private String carrera;
    private int[] notas = new int[5];
    private int asistencias;
    private int contadorNotas;

    public Estudiante(String documento, String nombre, String appelido) {
        this.documento = documento;
        this.nombre = nombre;
        this.appelido = appelido;
    }

    public void asistirAClase(){
        this.asistencias++;
    }

    public void agregarNota(int nota){
        this.notas[contadorNotas] = nota;
        if (contadorNotas < 5)
            contadorNotas++;
    }

    public String getDocumento() {
        return documento;
    }

    //Set es el responsable de que no se altere la información
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
}
