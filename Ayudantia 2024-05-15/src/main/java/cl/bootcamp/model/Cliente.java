package cl.bootcamp.model;

public record Cliente(String customerNumber, 
					String customerName, 
					String country, 
					String city) implements Comparable<Cliente>{


	@Override
	public int compareTo(Cliente o) {
		return country.compareTo(o.country());
	}
	
	public int compararCiudad(Cliente o) {
		return city.compareTo(o.city());
	}

}
