
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa a tu numero");

        int num = scanner.nextInt();
        /* Si el num divisible por 3, imprime "Fizz"
           Si el num es divisible por 5, imprime "Buzz"
           Si el num es divisible por 15, imprime "FizzBuzz"
        */
        for (int i = 0; i <= num; i++) {

            if(i %15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i %5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            scanner.close();
        }
    }
}
