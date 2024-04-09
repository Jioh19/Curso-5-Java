import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(123456789, "Juan", "Oh", "Mi casa");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero de cuenta");
		int cuenta = scanner.nextInt();
		//System.out.println("Ingresa el titular de la cuenta");
		String titular = cliente.getNombre();
		System.out.println("Ingresa el saldo inicial");
		double saldo = scanner.nextDouble();
		Cuenta cuentaPesos = new CuentaCorriente(cuenta, saldo, titular, cliente, 12345.00);
		Cuenta cuentaDolares = new CuentaUSD(5555, 1000, "Juan Dolares", cliente);
		
		
		cliente.getCuentas().add(cuentaPesos);
		
		ArrayList<Cuenta> cuentas = cliente.getCuentas();
		cuentas.add(cuentaDolares);
		
		
		double balance = cliente.getCuentas().get(0).getBalance();
		ArrayList<Cuenta> cuentas1 = cliente.getCuentas();
		Cuenta cuenta1 = cuentas1.get(0);
		// Js cuentas1[0]
		double balance1 = cuenta1.getBalance();
		
		System.out.println(balance);
		
		System.out.println("****************************************************************");
		System.out.println("El nombre del usuario es: " 
		+cliente.getNombre() + " " + cliente.getApellido());
		System.out.println("El numero de la cuenta es: " + cliente.getCuentas());
		
		//System.out.println(cuenta.saldo);
		//System.out.println(cuentaB.getNumeroCuenta() +" " + cuentaB.getTitular() +" "+ cuentaB.getSaldo());
		//System.out.println(cuenta.numeroCuenta);
		//System.out.println(cuentaB);
		
//		System.out.println(cuentaPesos + "\n"+ cuentaDolares);
//		cuentaDolares.retiro(900);
//		System.out.println(cuentaDolares);
//		scanner.close();
//		
		FormaDePago pago1 = new Moneda();
		FormaDePago pago2 = new TarjetaDeCredito();
		
		ArrayList<FormaDePago> pagos = new ArrayList<>();
		pagos.add(pago1);
		pagos.add(pago2);
		
		for(FormaDePago pago : pagos) {
			pago.realizarPago();
		}

		scanner.close();
	}

}
