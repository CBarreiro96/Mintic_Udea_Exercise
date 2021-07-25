import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number to make the factorial: ");
        long number = reader.nextLong();
        long factorial = 1;
        if (number < 0){
            number *= -1;
        }
        while (number > 0){
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }
}
