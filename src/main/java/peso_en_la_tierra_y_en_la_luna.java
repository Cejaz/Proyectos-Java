
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
public class peso_en_la_tierra_y_en_la_luna {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            Scanner scanner = new Scanner(System.in);
            
            double peso_en_la_tierra = 0;
            double peso_en_la_luna = 0;
            
            Scanner myObj = new Scanner(System.in);
            System.out.println("INGRESE SU PESO EN LA TIERRA");
            
            String peso_en_la_tierra_srt = myObj.nextLine();
            peso_en_la_tierra = Integer.parseInt(peso_en_la_tierra_srt);
            
            peso_en_la_luna = (peso_en_la_tierra / 9.81 * 1.622);
            System.out.println("Su peso en la luna es: " + peso_en_la_luna);
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
