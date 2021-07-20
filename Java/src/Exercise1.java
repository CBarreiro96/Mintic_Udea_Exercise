import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int number;
        int suma = 0;
        do {
            System.out.println("Ingresa el numero: ");
            number = leer.nextInt();
            suma += number;
        }
        while( number != 0);
        System.out.println("La suma es: " + suma);
    }
}
