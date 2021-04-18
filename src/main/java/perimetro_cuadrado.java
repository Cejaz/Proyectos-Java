
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
public class perimetro_cuadrado {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            Scanner scanner = new Scanner(System.in);
             
            int lado;
            
            System.out.println("Por favor ingrese el lado del cuadrado ");
            lado = scanner.nextInt();
           
            System.out.println("El perimetro del cuadrado es: " + lado * 4);
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
