package cl.bootcamp.model;

public record Order(String customerNumber, 
					String productCode,
					String quantity,
					String date) {

}
