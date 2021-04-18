
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
public class string {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            String  texto = "";
            int tamano = 0;
            char caracter = 0;
            
            texto = JOptionPane.showInputDialog("Por Favor ingrese un string:" );
            
            tamano = texto.length(); // el metodo length me dice el tamaño del string
            JOptionPane.showMessageDialog(null,"el tamaño del string es: " + tamano);
            
            
            // muestre en un mensaje en que posicion esta el primer y ultimo caracter
            JOptionPane.showMessageDialog(null,"La primera posicion es: 0:  " + " la ultima posicion es: " + (tamano-1));
            
            
            // quiero extraer de un string una letra en la posicion 10
            // para evitar algun error debemos saber si el string tiene tamaño 10
            if (tamano >= 11){
                caracter  = texto.charAt(10);
                JOptionPane.showMessageDialog(null,"el caracter el la posicion 10 es : " + caracter);
            }
            else JOptionPane.showMessageDialog(null,"el string no tiene posicion 10");
            
            // para saber a que codigo de la tabla ascii pertencer simplemente se hace un cast al char para convertirlo 
            // entero
            JOptionPane.showMessageDialog(null,"el caracter equivale a la tabla ascii al numero " + (int)caracter);
            
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa" + error);            
            
        }        
    }
}
