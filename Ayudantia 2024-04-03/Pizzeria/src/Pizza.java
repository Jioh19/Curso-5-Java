public class Pizza {
  private String nombre;
  private double precio;
  private String descripcion;
  private boolean premium;


  public Pizza(String nombre, double precio, String descripcion, boolean premium) {
    this.nombre = nombre;
    this.precio = precio;
    this.descripcion = descripcion;
    this.premium = premium;
  }

  public double getPrecio() {
    if(premium) {
      return precio*1.5;
    }
    return precio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public boolean isPremium() {
    return this.premium;
  }

  public boolean getPremium() {
    return this.premium;
  }

  public void setPremium(boolean premium) {
    this.premium = premium;
  }

  @Override
  public String toString() {
    return "{" +
      " nombre='" + getNombre() + "'" +
      ", precio='" + getPrecio() + "'" +
      ", descripcion='" + getDescripcion() + "'" +
      ", premium='" + isPremium() + "'" +
      "}";
  }


}
