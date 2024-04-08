import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta miCuenta = new Cuenta(123456, "Juan Oh", 0);
		System.out.println(miCuenta);
		
		miCuenta.depositar(69420);
		System.out.println(miCuenta);
	}

}
