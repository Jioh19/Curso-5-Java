import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero total");
        int total = lector.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero a agregar");
            suma += lector.nextInt();
        } while (suma < total);
        System.out.println("Se ha alcanzado el máximo");
    }
}