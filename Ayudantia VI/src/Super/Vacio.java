package Super;

public class Vacio implements Estado {

	@Override
	public void agregar() {
		System.out.println("Producto agregado");
	}

	@Override
	public void cancelar() throws CarritoException {
		throw new CarritoException("El carrito ya esta vacío");
	}

	@Override
	public void volver() throws CarritoException {
		throw new CarritoException("El carrito ya esta vacío");
		
	}

	@Override
	public void siguiente() throws CarritoException {
		throw new CarritoException("No puede seguir con el carrito vacío");
	}

	@Override
	public String toString() {
		return "Vacio ";
	}
	
	

}
