
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
public class temperatura_grados {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            float C ;
            float F;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese la temperatura en grados centigrados");
            C = scanner.nextInt();
            
            F=32+(9*C/5);
            
            System.out.println(C + " C" + " es igual a " + F + " F");
            
            
        } catch (Exception ex) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(ex.getMessage());
            
        }        
    }
 
    
}
    
     
   
        
        
            
  
