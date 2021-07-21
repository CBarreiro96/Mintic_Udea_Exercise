public class Principal {
    public static void main(String[] args) {
        Estudiante diana = new Estudiante();
        diana.setNombre("Diana");
        diana.setAppelido("Aristizabal");
        diana.setEdad(19);
        diana.setCarrera("Ingenieria de Sistemas");
        System.out.println("El nombre del estudiante es: " + diana.getNombreCompleto());
        System.out.println("Carrera: " + diana.getCarrera());
    }
}
