
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
public class convertidor_cc_litros {
    
         public static void main (String [] args ) {
        
        try { //aqui va el programa
            
            Scanner scanner = new Scanner(System.in);
            
            float centimetros = 0;
            
           
            
            System.out.println("Ingrese la cantidad en cc");
            centimetros = scanner.nextInt();
            
            System.out.println("La cantidad en litros es " + centimetros * 1/1000);
    } 
     catch(Exception ex){ 

            System.out.println("Ocurrió un error en el programa"); 
            System.out.println(ex.getMessage());

        } 
    }
   
    
}
