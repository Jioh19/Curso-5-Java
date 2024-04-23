package Super;

public class Super {

	public static void main(String[] args) {
		Carrito carrito = new Carrito();
		System.out.println(carrito);
		
		Producto carne = new Producto("Carne", 7000);
		Producto queso = new Producto("Queso", 9500);
		Producto pan = new Producto("Pan", 1500);
		
		carrito.agregar(carne);
		carrito.agregar(queso);
		carrito.agregar(pan);
		System.out.println(carrito);
		
		carrito.cancelar();
		carrito.agregar(carne);
		carrito.agregar(queso);
		carrito.agregar(pan);
		carrito.siguiente();
		System.out.println(carrito);
		carrito.siguiente();
		System.out.println(carrito);
		carrito.volver();
		System.out.println(carrito);
	}

}
