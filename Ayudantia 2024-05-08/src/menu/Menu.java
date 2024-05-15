package menu;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import principal.Login;

public class Menu {
	static int intentos = 3;
	public static void getMenu(List<Cliente> clientes) {
		var menu ="""
				********************************************
				**    Bienvenido al AlkeBanco             **
				********************************************
				** 1- Login       
				** 3- Depositar                           **
				** 2- Salir                               **
				********************************************""";
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		System.out.print("** ");
		try {
			
			int option = sc.nextInt();
			
			switch(option) {
			case 1:
				Cliente cliente = Login.login(clientes);
				System.out.println(cliente);
				break;
			case 2:
				System.out.println("**Gracias por usar el AlkeBanco**");
				break;
			case 3:
				System.out.println("Ingrese el monto a depositar");
				double monto = sc.nextDouble();
				boolean resultado = ServiceCuenta.depositar(cuenta, monto);
				if(resultado) {
					System.out.println("Deposito exitoso");
				} else {
					System.out.println("Error en el deposito");
				}
				break;
			default:
				System.out.println("Ingrese opcion válida");
				break;
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			intentos--;
			if(intentos <= 0) {
				System.out.println("Superaste el limite de intentos");
			} else {
				getMenu(clientes);
				
			}
		}
		
	}
}
