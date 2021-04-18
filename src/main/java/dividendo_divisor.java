/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class dividendo_divisor {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            String texto = "";
            int dividendo,divisor;

            texto = JOptionPane.showInputDialog("Introduzca el dividendo: ");
            dividendo = (int) Long.parseLong(texto);
		
            texto = JOptionPane.showInputDialog("Introduzca el divisor");
            divisor = (int) Long.parseLong(texto);
            
            if (divisor == 0)
                JOptionPane.showMessageDialog(null,"No se puede dividir por 0");
            else
                
                if (dividendo%divisor == 0)
                    JOptionPane.showMessageDialog(null," La division es exacta . El cociente es:  " + 
                            (dividendo/divisor));
                else
                    JOptionPane.showMessageDialog(null," La division NO es exacta. El cociente es: " + 
                            (dividendo / divisor)+ " y el Resto es : " + (dividendo%divisor));
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
