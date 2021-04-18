/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class volumen_cilindro {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in); 
        
        try { //aqui va el programa
            int radio,altura;
            
            System.out.println("Por favor ingrese el radio");
            radio = scanner.nextInt();
            
            System.out.println("Por favor ingrese la altura");
            altura = scanner.nextInt();
            
           System.out.println("El volumen del cilindro es: " + (Math.PI * radio * radio * altura));
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
