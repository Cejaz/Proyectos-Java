
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
public class menu_desplegable {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            int opcion=0; 
            String respuesta="";
           
            respuesta = JOptionPane.showInputDialog("Por Favor seleccione una opcion: \n"
            + "1.- Premio Mayor\n"
            + "2.- Premio Seco\n"
            + "3.- Premio de Consolidacion");
            opcion=Integer.parseInt(respuesta);
            
            if (opcion == 1)
                JOptionPane.showMessageDialog(null,"usted" );  
            
            
            
            
            
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
