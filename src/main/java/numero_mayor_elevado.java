
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
public class numero_mayor_elevado {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            String texto ="" ;
               
                int n1 ,n2 ;
                
                texto = JOptionPane.showInputDialog("Introduzca el primer número: ");
                n1 = (int) Long.parseLong(texto);
                
                texto = JOptionPane.showInputDialog("Introduzca el segundo número: ");
                n2 = (int) Long.parseLong(texto);
                
                int cuadrado =  (int) Math.pow(n1, 2);
                int cubo = (int) Math.pow(n1,3);
                int cuadrado2 = (int) Math.pow(n2, 2);
                int cubo2 = (int) Math.pow(n2, 3);
                
                
                if (n1 == n2)
                JOptionPane.showMessageDialog(null,"Introduzca numeros diferentes");
                else
                    
                    if (n1 > n2){
                        JOptionPane.showMessageDialog(null,"El numero mayor es: " + n1);
                        JOptionPane.showMessageDialog(null,"El numero elevado al cuadrado  es: " + cuadrado);
                        JOptionPane.showMessageDialog(null,"El numero elevado al cubo es: " + cubo);
                }
               
                
                else
                    {
                    JOptionPane.showMessageDialog(null,"El numero mayor es: " + n2);
                    JOptionPane.showMessageDialog(null,"El numero elevado al cuadrado es: " + cuadrado2);
                    JOptionPane.showMessageDialog(null,"El numero elevado al cubo es: " + cubo2);
                    }
                
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
