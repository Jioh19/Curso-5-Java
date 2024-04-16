import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Listas {

	public static void main(String[] args) {
		List<Integer> listaLigada = new LinkedList<>();
		List<Integer> listaArreglo = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int num = new Random().nextInt(1000);
			listaLigada.add(num);
			listaArreglo.add(num);
		}
		
		System.out.println(listaLigada.toString());
		System.out.println(listaArreglo.toString());
		
		listaLigada.sort(null);
		System.out.println(listaLigada.toString());

		listaArreglo.sort((a, b) -> {
			return b - a;
		});
		System.out.println(listaArreglo.toString());
	}

}
