package auto;

public class Auto {
	private String nombre;
	private double bateria;
	private double bateriaMetro;
	private double odometro;
	
	public Auto(String nombre, double bateria, double bateriaMetro, double odometro) {
		super();
		this.nombre = nombre;
		this.bateria = bateria;
		this.bateriaMetro = bateriaMetro;
		this.odometro = odometro;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void cargar(double carga) {
		bateria += carga;
		if(bateria > 100) {
			bateria = 100;
		}
	}
	
	public void avanzar(double carga) {
		if(bateria < carga) {
			odometro += bateria*bateriaMetro;
			bateria = 0;
		} else {
			odometro += carga*bateriaMetro;
			bateria -= carga;			
		}
	}
	
	public double maxDist() {
		return bateria*bateriaMetro + odometro;
	}

	

	@Override
	public String toString() {
		return "Auto [nombre=" + nombre + ", bateria=" + bateria + ", bateriaMetro=" + bateriaMetro + ", odometro="
				+ odometro + "]";
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	public double getBateriaMetro() {
		return bateriaMetro;
	}

	public void setBateriaMetro(double bateriaMetro) {
		this.bateriaMetro = bateriaMetro;
	}

	public double getOdometro() {
		return odometro;
	}

	public void setOdometro(double odometro) {
		this.odometro = odometro;
	}
	
	
}
