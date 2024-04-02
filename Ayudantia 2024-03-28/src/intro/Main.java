package intro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int miEntero = 69;
		Double miDouble = 420.69;
		String miString = "Este es mi cadena de texto";
		System.out.println("El valor de miEntero es: " + miEntero);
		System.out.println("El valor de miDouble es: " + miDouble);
		System.out.println("El valor de miString es: " + miString);
		
		System.out.println("Numero de Euler " + Math.E);
		System.out.println("Numero Pi " + Math.PI);

		Scanner lector = new Scanner(System.in);
		//while (miEntero != 0) {
		//for(int i = 0; i < 789789; i++) {
		for(; miEntero !=0; ) {
			System.out.println("Ingresa tu edad");
			miEntero = lector.nextInt();
			/*
			 * System.out.println("El numero ingresado es: " + miEntero);
			 * System.out.println("Ingresa un nuevo numero de tipo flotante"); miDouble =
			 * lector.nextDouble(); System.out.println("El numero ingresado es :" +
			 * miDouble); lector.nextLine(); System.out.println("Ingresa un nuevo string");
			 * miString = lector.nextLine(); System.out.println("El string ingresado es :" +
			 * miString); if(miEntero < 18) {
			 * System.out.println("Eres menor de edad, fuera!!!!!"); } else if(miEntero >
			 * 35) { System.out.println("Eres demasiado viejo, fuera!!!!!"); } else {
			 * System.out.println("Estas en el rango de edad, bienvenido!!!"); }
			 */

			switch (miEntero) {
			case 18:
				System.out.println("Tienes justo 18 años");
				break;
			case 17:
				System.out.println("Tienes solo 17 años, fuera!!!");
				break;
			case 19:
			case 20:
			case 21:
			case 22:
				System.out.println("Califican para la promo");
				break;
			case 23:
				System.out.println("No califican para la promo");
				break;
			default:
				System.out.println("Edad random");
				break;
			}
			
		}
		System.out.println("Ha terminado el ciclo");
	}

}
