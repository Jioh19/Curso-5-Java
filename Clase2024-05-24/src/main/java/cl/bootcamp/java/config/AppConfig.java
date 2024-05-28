package cl.bootcamp.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.bootcamp.java.service.MultiplicadorService;

@Configuration
public class AppConfig {

	@Bean(name="multiplicadorService", initMethod="init", destroyMethod="destroy")
	MultiplicadorService multiplicador() {
		return new MultiplicadorService(5);
	}
	
}
