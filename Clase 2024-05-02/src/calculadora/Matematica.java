package calculadora;

public class Matematica {
	
	Calculadora calculadora = new Calculadora();
	public int sumarRestar(String command, int num1, int num2) {
		if(command.equals("Sumar")) {
			return calculadora.sumar(num1, num2);
		} else {
			return calculadora.restar(num1, num2);
		}
	}
}
