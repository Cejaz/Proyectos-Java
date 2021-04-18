
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
public class punto_ecuacion_evaluacion {
    public static void main(String[] args) {
        
        try { //aqui va el programa
         
            Scanner scanner = new Scanner(System.in); 
            
            short x ;
            int y ;
            
   
              System.out.println("Por favor ingrese el valor de X: ");
               x = (short) scanner.nextInt();
               
               y = (int) (float) (6*Math.pow(x,2)+7*x-15);
               
               
               System.out.println("El resultado es: " + y);
           
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
     
    
    
    
   
    
    
            
    
    
}
