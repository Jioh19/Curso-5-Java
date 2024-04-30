package banco;

public class Banco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Juan", "Oh", "123456789", "987654321");
		Cuenta cuentaAhorro = new CuentaAhorro();
		Cuenta cuentaVista = new CuentaVista();
		
		cliente.addCuenta(cuentaAhorro);
		cliente.addCuenta(cuentaVista);
		
		cuentaAhorro.depositar(200000);
		cuentaVista.depositar(69420);
		
		
		String bienvenida = """
				*****************************************************
				**          Bienvenido al Alke Banco               **
				*****************************************************""";
		
		String menu = """
				*****************************************************
				** 1- Depositar                                    **
				** 2- Retirar                                      **
				** 0- Salir                                        **
				*****************************************************""";
		System.out.println(bienvenida);
		System.out.println(menu);
		System.out.println(cliente);
	}

}
