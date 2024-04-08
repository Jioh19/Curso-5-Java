package mayor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingresa tu edad");
		Scanner lector = new Scanner(System.in);
		int edad = lector.nextInt();
		if(edad >= 18) {
			System.out.println("Eres mayor de edad!!");
		} else {
			System.out.println("Eres menor de edad!!!");
		}
	}

}
