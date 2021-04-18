
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class dolares_pesos {
    
    public static void main (String [] args ) {
        
        try { //aqui va el programa
            
            String texto = "";
            DecimalFormat formatea = new DecimalFormat ("###,###.###");
            
            double  cantidad_pesos =  3687.51;
            double  cantidad_dolares ;
           
            texto = JOptionPane.showInputDialog("Por favor ingrese el valor en dolares");
            cantidad_dolares = Long.parseLong(texto);
             
            JOptionPane.showMessageDialog(null,"La cantidad convertidad de dolares a pesos es: "
                    + formatea.format ( cantidad_pesos * cantidad_dolares ));
            
             } 
        catch(Exception ex){ 

            System.out.println("Ocurrió un error en el programa"); 
            System.out.println(ex.getMessage());

        } 
    }
   
    
}
        
    

