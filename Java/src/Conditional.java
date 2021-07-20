import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nota: ");

        float nota = leer.nextFloat();
        System.out.println("Ingrese la asistencia: ");

        int asistencia = leer.nextInt();

        if (nota > 3.5 && asistencia > 6) {
            System.out.println("ganada");
        } else {
            System.out.println("perdida");
        }

    }
}
