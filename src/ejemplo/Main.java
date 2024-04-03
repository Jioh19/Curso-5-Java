package ejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creamos un objeto con su constructor vacio
		Libro libro = new Libro();
		
		// creamos la funcion para retornar el valores
		libro = libro.crearLibro();
		
		// para mostrar los datos por pantalla
		// definimos o creamos el metodo 
		
		System.out.print(libro.toString());
		
	}
}

