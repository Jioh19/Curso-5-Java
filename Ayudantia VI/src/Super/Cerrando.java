package Super;

public class Cerrando implements Estado{

	@Override
	public void agregar() throws CarritoException {
		throw new CarritoException("No se pueden agregar productos");
		
	}

	@Override
	public void cancelar() throws CarritoException {
		throw new CarritoException("No se puede cancelar");
		
	}

	@Override
	public void volver() throws CarritoException {
		throw new CarritoException("No se puede volver");
		
	}

	@Override
	public void siguiente() throws CarritoException {
		System.out.println("Se ha vaciado el carrito");
		
	}

	@Override
	public String toString() {
		return "Cerrando ";
	}
	
	

}
