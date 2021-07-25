import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double  total = 1;
        int count = 0;
        System.out.println("Ingrese el numero: ");
        int numero = leer.nextInt();
        System.out.println("Ingrese la potenca: ");
        int potencia = leer.nextInt();
        if  (potencia < 10){
            if (potencia == 0){
                total = 1;
            } else {
                if (potencia < 0){
                    count = 1;
                    potencia = potencia * -1;
                }
                for (int i = 1; i <= potencia; i++){
                    total = total * numero;
                }
                if (count != 1) {
                    System.out.println("Resultado: " + total);
                } else {
                    total = (double)1/total;
                    System.out.println(total);
                }
            }

        } else {
            System.out.println("Potencia no soportada");
        }

    }
}
