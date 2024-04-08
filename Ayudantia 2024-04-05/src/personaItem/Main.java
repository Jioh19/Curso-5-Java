package personaItem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Juan", 100, 4, 10000);
		Item pala = new Item("Pala", 3, 3000);
		Item botella = new Item("Botella con agua", 5, 5000);
		Item espada = new Item("Espada", 2, 3000);
		persona.agregarItem(pala);
		persona.agregarItem(botella);
		persona.agregarItem(espada);
		
		System.out.println(persona);
		System.out.printf("La persona lleva un total de %d kilos\n", persona.getPesoTotal());
		System.out.printf("La persona lleva un total de %d ml\n", persona.getVolumenTotal());
	}

}
