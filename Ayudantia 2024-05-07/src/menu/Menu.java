package menu;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import principal.Login;

public class Menu {
	public static void getMenu(List<Cliente> clientes) {
		var menu ="""
				********************************************
				**    Bienvenido al AlkeBanco             **
				********************************************
				** 1- Login                               **
				** 2- Salir                               **
				********************************************""";
		
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		System.out.print("** ");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			Cliente cliente = Login.login(clientes);
			System.out.println(cliente);
			break;
		case 2:
			System.out.println("**Gracias por usar el AlkeBanco**");
			break;
		default:
			System.out.println("Ingrese opcion válida");
			break;
		}
		
	}
}
