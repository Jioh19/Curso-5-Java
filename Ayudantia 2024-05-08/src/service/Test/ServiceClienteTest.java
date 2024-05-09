package service.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import model.Cliente;
import service.ServiceCliente;

class ServiceClienteTest {
	
	ServiceCliente serviceCliente = new ServiceCliente();
	Cliente cliente = new Cliente("Juan", 123456, "987654");

	@Test
	void testCrearCliente() {
		var resultado = serviceCliente.crearCliente(cliente);
		assertEquals(resultado, "Cliente creado");
	}

	@Test
	void testActualizarCliente() {
		var resultado = serviceCliente.actualizarCliente(cliente);
		assertEquals(resultado, "Cliente actualizado");
	}
	
	@Test 
	void testCrearClienteFallido() {
		var resultado = serviceCliente.crearCliente(null);
		assertEquals(resultado, "Creación fallida");
	}
	
	@Test 
	void testActualizarClienteFallido() {
		var resultado = serviceCliente.actualizarCliente(null);
		assertEquals(resultado, "Actualización fallida");
	}

}
