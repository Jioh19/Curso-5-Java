
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera cafetera = new Cafetera(1000, 0);
		System.out.println(cafetera);
		cafetera.llenarCafetera();
		System.out.println(cafetera);
		boolean tazaLlena = cafetera.servirTaza(400);
		System.out.println(cafetera);
		System.out.println(tazaLlena);
		cafetera.vaciarCafetera();
		System.out.println(cafetera);
		boolean lleno = cafetera.agregarCafe(1500);
		System.out.println(cafetera);
		System.out.println(lleno);

		System.out.println();
	}

}
