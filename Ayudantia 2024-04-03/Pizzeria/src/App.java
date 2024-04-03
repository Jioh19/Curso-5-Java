public class App {
    public static void main(String[] args) throws Exception {
        Pizza napolitana = new Pizza("Napolitana", 8000, "Rica pizza napolitana", false);
        Pizza estaciones = new Pizza("Estaciones", 14000, "Exquisita pizza Estaciones", true);
        Pizza hawaiana = new Pizza("Hawaina", 10000, "Pizza Hawaiana generica", false);

        // System.out.println(napolitana);
        // System.out.println(estaciones);
        // System.out.println(hawaiana);
        PizzaComposite pizzas = new PizzaComposite("Mitad y mitad", "Deliciosa pizza mitad y mitad");
        pizzas.addPizza(napolitana);
        pizzas.addPizza(estaciones);
        System.out.println(pizzas);
    }
}
