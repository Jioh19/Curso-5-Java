package principal;

import java.nio.file.AccessDeniedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Cliente;

public class Login {
	public static Cliente login(List<Cliente> clientes) {
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.printf("**%25s               **\n", "Ingrese el ID");
			System.out.print("** ");
			int id = sc.nextInt();
			System.out.printf("**%25s               **\n","Ingrese la password");
			System.out.print("** ");
			String pass = sc.next();
			
			Cliente cliente = null;
			
			for(Cliente c : clientes) {
				if(c.getId() == id) {
					if(pass.equals(c.getPassword())) {
						cliente = c;
					}
				}
			}
			if(cliente == null) {
				throw new AccessDeniedException("Id o password incorrectos");
			}
			return cliente;
		} catch(InputMismatchException | AccessDeniedException e) {
			System.err.println(e.getMessage());
			return login(clientes);
		} catch (Exception e) {
			System.out.println("Error desconocido");
			return null;
		} finally {
			sc.close();
		}

	}

}
