package service;

import java.util.HashMap;
import java.util.Map;

import model.Cliente;

public class ServiceCliente {
	
	private Map<Integer, Cliente> clientes;

	public ServiceCliente() {
		clientes = new HashMap<Integer, Cliente>();
	}
	
	public String crearCliente(Cliente cliente) {
		if(cliente == null) {
			return "Creación fallida";
		}
		
		clientes.put(cliente.getId(), cliente);
		return "Cliente creado";
	}
	
	public String actualizarCliente(Cliente cliente) {
		if(cliente == null) {
			return "Actualización fallida";
		}
		
		clientes.put(cliente.getId(), cliente);
		return "Cliente actualizado";
	}
}
