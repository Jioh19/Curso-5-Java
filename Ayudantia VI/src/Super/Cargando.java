package Super;

public class Cargando implements Estado {

	@Override
	public void agregar() throws CarritoException {
		System.out.println("Producto agregado");

	}

	@Override
	public void cancelar() throws CarritoException {
		System.out.println("Carrito cancelado");

	}

	@Override
	public void volver() throws CarritoException {
		System.out.println("De vuelta a vacío");

	}

	@Override
	public void siguiente() throws CarritoException {
		System.out.println("Cambio a modo de pago");

	}

	@Override
	public String toString() {
		return "Cargando ";
	}
	
	

}
