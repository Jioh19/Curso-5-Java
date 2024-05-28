package cl.bootcamp.java.service;

public class MultiplicadorService {

	private final int multiplicador;
	
	public  MultiplicadorService(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	public int multiplicar(int valor) {
		return valor * multiplicador;
	}
	
	public void init() {
		System.out.println("Llamando al método init del bean");
	}
	
	public void destroy() {
		System.out.println("Llamando al método destroy del bean");
	}

	/**
	 * Ciclo de vide de un bean
	 * 
	 * 1. @Configuration, @Bean
	 * 2. Registrar en el contenedor de Spring
	 * 3. Bean es inyectado en dependencia
	 * 4. Se llama al método init del bean
	 * 5. Métodos listos del bean para utilizarse
	 * 6. Cuando se temrina la ejecución de la aplicación, se destruye el bean y se llama al método destroy()
	 * */
}
