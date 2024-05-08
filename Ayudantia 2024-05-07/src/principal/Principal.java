package principal;

import java.util.List;
import java.util.Stack;

import menu.Menu;
import model.Cliente;
import model.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan", 123456789, "qwerty");
		Cliente cliente2 = new Cliente("Gabriel", 987654321, "asdf");
		Cuenta cuenta1 = new Cuenta(123456);
		Cuenta cuenta2 = new Cuenta(987654);
		
		List<Cliente> clientes = new Stack<>();
		cliente1.getCuentas().add(cuenta1);
		cliente2.getCuentas().add(cuenta2);
		clientes.add(cliente1);
		clientes.add(cliente2);

		cuenta1.depositar(500000);
		cuenta2.depositar(1000000);
		
		Menu.getMenu(clientes);
	}

}
