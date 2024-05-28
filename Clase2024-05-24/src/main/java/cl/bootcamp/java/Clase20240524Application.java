package cl.bootcamp.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.bootcamp.java.service.AppService;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Clase20240524Application {
	
	@Autowired
	private AppService appService;
	
//	public Clase20240524Application(AppService appService) {
//		this.appService = appService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(Clase20240524Application.class, args);
	}
	
	@PostConstruct
	public void ejemplo() {
		System.out.println("Llamando al bean con el resultado: " + appService.calcular(20));
	}

}
