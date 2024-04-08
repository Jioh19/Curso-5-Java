import java.util.ArrayList;

public class PizzaComposite extends Pizza{

  private ArrayList<Pizza> pizzas = new ArrayList<>(); 

  public PizzaComposite(String nombre, String descripcion) {
    super(nombre, 0, descripcion, false);
    pizzas = new ArrayList<>();
  }
  
  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }

  @Override
  public double getPrecio() {
    double precio = 0;
    for(Pizza pizza : pizzas) {
      if(precio < pizza.getPrecio()) {
        precio = pizza.getPrecio();
      }
    }


    return precio;
  }

  @Override
  public String toString() {
    return "{" +
      " pizzas='"+ this.getNombre() + " " + this.getPrecio()  + "\n"+ getPizzas() + "'" +
      "}";
  }

  public ArrayList<Pizza> getPizzas() {
    return pizzas;
  }

}
