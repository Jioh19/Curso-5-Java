package cl.bootcamp.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.service.UsuarioService;

@SpringBootApplication
public class AyudantiaSpringApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(AyudantiaSpringApplication.class, args);

	}

}
