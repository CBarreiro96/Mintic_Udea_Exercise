public class Principal {
    public static void main(String[] args) {
        //Estudiante diana = new Estudiante();
        //diana.setNombre("Diana");
        //diana.setAppelido("Aristizabal");
        //diana.setEdad(19);
        //diana.setCarrera("Ingenieria de Sistemas");

        Estudiante diana = new Estudiante("12345","diana","Aristizabal");
        System.out.println("El nombre del estudiante es: " + diana.getNombreCompleto());
        System.out.println("Asistencias: " + diana.getAsistencias());
        diana.asistirAClase();
        System.out.println("Asistencias: " + diana.getAsistencias());
        //System.out.println("Carrera: " + diana.getCarrera());
    }
}
