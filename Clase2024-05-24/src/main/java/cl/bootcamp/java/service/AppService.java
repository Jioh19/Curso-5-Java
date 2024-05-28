package cl.bootcamp.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component //@Component es anotacion padre de @Service
public class AppService {
	
	@Autowired
	@Qualifier("multiplicadorService")
	private MultiplicadorService multiplicadorService;

//	public AppService(MultiplicadorService multiplicadorService) {
//		this.multiplicadorService = multiplicadorService;
//	}
	
	public int calcular(int valor) {
		return multiplicadorService.multiplicar(valor);
	}
}
