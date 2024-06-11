package cl.alke.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.alke.model.Producto;
import cl.alke.service.ProductoImpl;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sucursal, luego id producto");
		String ingreso = sc.nextLine();
		String[] resultado = ingreso.split(" ");
		int sucursal = Integer.parseInt(resultado[0]);
		int producto = Integer.valueOf(resultado[1]);
		
		System.out.println("sucursal: " + sucursal);
		System.out.println("prducto: " + producto);
		
		Producto p1 = new Producto(1, 8, "Mesa" , 40);
		Producto p2 = new Producto(1, 10, "Silla" , 10);
		ProductoImpl pi1 = new ProductoImpl(p1);
		ProductoImpl pi2 = new ProductoImpl(p2);
		
		
		List<ProductoImpl> productos = new ArrayList<>();
		productos.add(pi1);
		productos.add(pi2);
		
		for(ProductoImpl p: productos) {
			
			if(p.getProducto().getId() == producto) {
				System.out.println(p.hayStock());
			}
		}
		
	}
}
