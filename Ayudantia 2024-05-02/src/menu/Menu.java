package menu;

import java.util.Scanner;

import calculadora.Calculadora;

public class Menu {

	Calculadora calc = new Calculadora();
	boolean continuar = true;

	public void crearMenu() {

		while (continuar) {
			String menu = """
					********************************************************
					**      Bienvenidos a mi aplicación                   **
					********************************************************
					** 1- Sumar                                           **
					** 2- Restar                                          **
					** 3- Multiplicar                                     **
					** 4- Dividir                                         **
					** 5- Salir                                           **
					********************************************************""";
			System.out.println(menu);

			execMenu();
		}

	}

	public void execMenu() {

		Scanner lector = new Scanner(System.in);

		System.out.println("** Ingresa un comando                                 **");
		double resultado;
		int comando = lector.nextInt();
		if (comando == 1) {

			System.out.println("** Has seleccionado la suma                           **");

			double[] datos = ingresoDatos();

			resultado = calc.sumar(datos[0], datos[1]);

			System.out.println("El resultado de la suma es " + resultado);
		} else if (comando == 2) {
			System.out.println("** Has seleccionado la resta                          **");
			double[] datos = ingresoDatos();
			resultado = calc.restar(datos[0], datos[1]);

			System.out.println("El resultado de la resta es " + resultado);
		} else if (comando == 3) {
			System.out.println("** Has seleccionado la multiplicación                 **");
			double[] datos = ingresoDatos();
			resultado = calc.multiplicar(datos[0], datos[1]);

			System.out.println("El resultado de la multiplicación es " + resultado);
		} else if (comando == 4) {
			System.out.println("** Has seleccionado la división                       **");
			double[] datos = ingresoDatos();
			resultado = calc.dividir(datos[0], datos[1]);

			System.out.println("El resultado de la división es " + resultado);
		} else if (comando == 5) {
			System.out.println("** Has seleccionado salir del programa                **");
			continuar = false;
		} else {
			System.out.println("** Comando incorrecto                                 **");
		}

//		switch(comando) {
//		case 1: 
//			System.out.println("Has seleccionado la suma");
//			break;
//		case 2:
//			System.out.println("Has seleccionado la resta");
//			break;
//		case 3:
//			System.out.println("Has seleccionado la multiplicación");
//			break;
//		case 4: 
//			System.out.println("Has seleccionado la división");
//			break;
//		case 5:
//			System.out.println("Has seleccionado salir del programa");
//			break;
//		default:
//			System.out.println("Comando incorrecto");
//				
//		}

	}

	public double[] ingresoDatos() {
		Scanner lector = new Scanner(System.in);

		double[] datos = new double[2];
		System.out.println("** Ingresa el primer numero                           **");
		datos[0] = lector.nextDouble();
		System.out.println("** Ingresa el segundo numero                          **");
		datos[1] = lector.nextDouble();
		return datos;
	}
}
