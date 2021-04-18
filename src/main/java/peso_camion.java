
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class peso_camion {
    public static void main(String[] args) {
        
        try { //aqui va el programa
          Scanner scanner = new Scanner(System.in);
            double peso_total;
            double peso_carga;
            double peso_toneladas;
            double peso_camion;
            
            
            System.out.println("Ingrese el peso total del camion con carga");
            peso_total = scanner.nextInt();
            
            System.out.println("Ingrese el peso total del camion sin carga");
            peso_camion = scanner.nextInt();
            
            peso_carga = peso_total - peso_camion;
            peso_toneladas = peso_carga/1000;
            
            System.out.println("El peso de la carga en kg es: " + peso_carga);
            System.out.println("El peso de la carga en toneladas es: " + peso_toneladas);
            
        } catch (Exception ex) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(ex.getMessage());
            
        }        
    }
    
}
