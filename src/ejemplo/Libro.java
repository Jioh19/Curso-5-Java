package ejemplo;

import java.util.Scanner;

public class Libro {

	/*
	 * @author Elena Poblete
	 * Atributos
	 * Declaracion de atributos
	 * @int isbn
	 * @String titulo
	 * @String autor
	 * @int numeroPaginas
	 */
	
	public int isbn;
	public String titulo;
	public String autor;
	public int numeroPaginas;
	
	//Constructor con parametros 
	public Libro(int isbn,String titulo,String autor,int numeroPaginas ) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		
	}
	//constructor sin parametros
	public Libro() {
		
	}
	
	public Libro crearLibro(){
		//Metodo para cargar los datos
		Scanner Ingrese = new Scanner(System.in).useDelimiter("\r\n");
		
		System.out.println("Ingrese isbn");	
		isbn = Ingrese.nextInt();
		
		System.out.println("Ingrese titulo");	
		titulo = Ingrese.next();
		
		System.out.println("Ingrese autor");	
		autor = Ingrese.next();
		
		System.out.println("Ingrese numeroPaginas");	
		numeroPaginas = Ingrese.nextInt();
		
		//Crear y guardar el constructor del ojeto 
		
		Libro libro = new Libro(isbn,titulo,autor,numeroPaginas); 
		
		Ingrese.close();
		
		// retornar el objeto creado con todos los datos 
		return libro;
		
	}
	
	public String toString() {
		return "Libro [isbn= "+isbn+", titulo= "+titulo+" , "
				+ "autor= "+autor+" numeroPaginas= "+numeroPaginas+"]";
	}
	
	
	
}