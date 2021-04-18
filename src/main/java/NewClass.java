
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
public class NewClass {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            int valordelcarro=0, decada=0;
            double impuestos1=0, impuestos2=0;
            
            Scanner myObj = new Scanner (System.in);
            System.out.println("por favor ingrese el avaluo del vehiculo");
            valordelcarro = myObj.nextInt();
            
            System.out.println("por favor ingrese el modelo del vehiculo");
            decada = myObj.nextInt();
            
            if (decada == 70){
               
                impuestos1 = valordelcarro * 0.0376;
                impuestos2 = valordelcarro * 0.00876;
                
                
                System.out.println("el avaluo del carro es: " + valordelcarro);
                System.out.println("el impuesto de su rodamiento es de: " + impuestos1);
                System.out.println("el impuesto de su seguro es de: " + impuestos2);
                System.out.println("el total a pagar los impuestos es de: " + (impuestos1 + impuestos2));
                
                        }
              
                
            
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}

