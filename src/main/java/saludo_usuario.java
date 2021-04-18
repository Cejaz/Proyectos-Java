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
public class saludo_usuario{
    
    
    public static void main (String [] args ) {
        
        try {
             Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE SU NOMBRE");
        
        String nombreusuario = scanner.next();
        
        System.out.println("Hola " + nombreusuario);
    } 
     catch(Exception ex){ 

            System.out.println("Ocurrió un error en el programa"); 
            System.out.println(ex.getMessage());

        } 
    }
}
