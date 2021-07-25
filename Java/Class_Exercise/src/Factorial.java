import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero = reader.nextInt();
        int factorial = 1;
        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
