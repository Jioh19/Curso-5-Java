package cl.alke.service;

import cl.alke.model.Producto;

public class ProductoImpl implements IStock{
	private Producto producto;

	public ProductoImpl(Producto producto) {
		super();
		this.producto = producto;
	}

	@Override
	public String hayStock() {
		if(producto.getStock() < 13) {
			return "ALERTA!!!, stock del producto bajo";
		} else {
			return "Nivel de stock suficiente";
		}
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}
