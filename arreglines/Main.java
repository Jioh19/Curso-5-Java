import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el valor del radio");

    Double radio = scanner.nextDouble();

    Double volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

    System.out.println("El volumen de la esfera es de: " + Math.round(volumen));

    Tren tren = new Tren(10);
    System.out.println(tren.toString());
    scanner.close();
  }

}
