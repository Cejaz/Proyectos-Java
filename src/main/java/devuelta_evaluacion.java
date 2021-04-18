
import java.text.DecimalFormat;
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
public class devuelta_evaluacion {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            
            DecimalFormat formatea = new DecimalFormat ("###,###.###");
            
            double cuenta;
            double total;
            double iva;
            double pago;
            double devuelta;
            
            Scanner scanner = new Scanner (System.in);
            
             System.out.println("Ingrese por favor el valor de la cuenta");
             cuenta = (short) scanner.nextInt();
             
             
             iva = cuenta / 100*19;
             total = iva + cuenta;
             
    
             System.out.println("El valor total a pagar es: " + formatea.format (total));
             
             System.out.println("Ingrese por favor el dinero con el cual pagara: ");
             pago = (short) scanner.nextInt();
             
             devuelta = pago - total;
             
            System.out.println("El valor total a devolver es; " + formatea.format (devuelta));
   
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
