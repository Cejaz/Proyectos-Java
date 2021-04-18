
import java.util.Scanner;

public class convertidor_velocidad {

  public static void main(String[] args) {

    try { // aqui va el programa
      Scanner scanner = new Scanner(System.in);

      float velocidad;

      System.out.println("Ingrese velocidad en Km/h");
      velocidad = scanner.nextInt();

      System.out.println("La velocidad en m/s es " + velocidad * 1000 / 3600 + "m/s");

    } catch (Exception ex) {

      System.out.println("Ocurrió un error en el programa");
      System.out.println(ex.getMessage());

    }
  }

}
