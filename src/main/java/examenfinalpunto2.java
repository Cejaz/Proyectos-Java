
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**ALGORITMO
 *     INICIO 
 *DEFINIMOS LAS VARIABLES
 *  int articulos, articulos2, caja;
 * escribir ("ingrese el numero de arictulos);
 * 
      definimos la condicion
      * 
        if(articulos == 0 ){
          escribir("Por favor ingrese un numero distinto a 0");   
      }
      
      * definimos las operaciones
      caja = articulos/25;
      articulos2 = articulos%25;
        
        
      escribimos("El numero de articulos es de " + articulos + " el total de cajas es de " + caja + " y los articulos sin empacar fueron " + articulos2);  
          
        FIN
 *
 *
 * @author sebas
 */
public class examenfinalpunto2 {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
           int articulos, articulos2,caja;
       
        articulos = (int) Float.parseFloat(JOptionPane.showInputDialog("ingrese el numero de articulos"));
        
      
        if(articulos == 0 ){
          JOptionPane.showMessageDialog(null,"Por favor ingrese un numero distinto a 0");   
      }
      
      caja = articulos/25;
      articulos2 = articulos%25;
        
        
      JOptionPane.showMessageDialog(null,"El numero de articulos es de " + articulos + " el total de cajas es de " + caja + " y los articulos sin empacar fueron " + articulos2);  
          
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}

