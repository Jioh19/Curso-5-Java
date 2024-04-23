package Super;

public class Pagando implements Estado{

	@Override
	public void agregar() throws CarritoException {
		throw new CarritoException("No se pueden agregar productos");
		
	}

	@Override
	public void cancelar() throws CarritoException {
		System.out.println("Carrito cancelado");
		
	}

	@Override
	public void volver() throws CarritoException {
		System.out.println("De vuelta a comprar");
		
	}

	@Override
	public void siguiente() throws CarritoException {
		System.out.println("Pago efectuado, carrito cerrado");
		
	}

	@Override
	public String toString() {
		return "Pagando ";
	}
	
	

}
