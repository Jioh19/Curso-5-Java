package Donantes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa edad");
		int edad = lector.nextInt();
		System.out.println("Ingresa peso");
		float peso = lector.nextFloat();
		if(edad>=18 && edad <=65 && peso >= 50) {
			System.out.println("Puede donar!");
		} else {
			System.out.println("No puede donar!");
		}
		lector.close();
	}

}
