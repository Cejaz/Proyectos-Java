

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
public class ventas_comision {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            String texto = "";
            float comision = 0;
            float ventas = 0;
            float porcentaje = 0.0325f;
            
             texto = JOptionPane.showInputDialog("Por favor ingrese el total de ventas");
             ventas = Long.parseLong(texto);
            
            comision = ventas * porcentaje;
                      
            JOptionPane.showMessageDialog(null,"El valor de las comisiones ganadas fue de: " + comision);
    
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
