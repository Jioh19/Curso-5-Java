package banco;

import java.util.List;
import java.util.Scanner;

public class Menu {
	static String bienvenida = """
			*****************************************************
			**          Bienvenido al Alke Banco               **
			*****************************************************""";

	static String menu = """
			*****************************************************
			** 1- Depositar                                    **
			** 2- Retirar                                      **
			** 0- Salir                                        **
			*****************************************************""";
	
	public static void printMenu(List<Cuenta> cuentas) {
		System.out.println(bienvenida);
		System.out.println(menu);
		execMenu(cuentas);
	}
	
	public static void execMenu(List<Cuenta> cuentas) {
		
		Scanner sc = new Scanner(System.in);
		int comando = sc.nextInt();
		
		switch(comando) {
		case 1:
			System.out.println("Ingrese cuenta origen");
			int origen = sc.nextInt();
			System.out.println("Ingrese el monto");
			double monto = sc.nextDouble();
			cuentas.get(origen).depositar(monto);
			printMenu(cuentas);
			break;
		case 2: 
			System.out.println("Has seleccionado retirar");
			printMenu(cuentas);
			break;
		case 0:
			System.out.println("Has seleccionado salir");
		}
		
	}
}
