package Primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa número para verificar si es primo");
        int num = lector.nextInt();
        boolean esPrimo = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println(esPrimo);
    }
}
