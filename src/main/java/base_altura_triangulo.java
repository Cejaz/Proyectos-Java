
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
public class base_altura_triangulo {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            Scanner scanner = new Scanner(System.in);
            
            int base,altura;
            
            System.out.println("Por favor ingrese la base");
            base = scanner.nextInt();
            
            System.out.println("Por favor ingrese la altura");
            altura = scanner.nextInt();
            
            System.out.println("El aerea del triangulo rectagulo es: " + (base*altura)/2);
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
