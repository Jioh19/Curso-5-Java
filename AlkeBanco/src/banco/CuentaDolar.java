package banco;

public class CuentaDolar extends Cuenta implements Conversor{
	
	private double maxDeposito;
	private double depositoActual;

	public CuentaDolar() {
		super(Moneda.USD);
		this.maxDeposito = 50000;
		this.depositoActual = 0;
	}
	
	@Override
	public boolean depositar(double deposito) {
		if(maxDeposito < (depositoActual+deposito)) {
			return false;
		}
		saldo += deposito;
		depositoActual += deposito;
		return true;
	}

	@Override
	public boolean retirar(double retiro) {
		if(saldo < retiro*1.02) {
			return false;
		}
		saldo -= retiro*1.02;
		return true;
	}

	@Override
	public double convertir() {
		
		return saldo * 950;
	}
	
	@Override
	public String toString() {
		//*****************************************************
		return String.format("**%15s%-10s%10s%12.2f  **\n", "Numero Cta:", 
				Integer.toString(numero), "Saldo:", saldo)+
				String.format("**%15s%-10s%10s%12.2f  **\n", "Moneda:", 
						moneda, "Saldo:", this.convertir());
	}

}
