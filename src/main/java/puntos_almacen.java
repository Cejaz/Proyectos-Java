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
public class puntos_almacen {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            String nombre;
            float puntos;
    
            nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre");
            
            puntos = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese sus puntos"));
            
            if (puntos ==10.000)
                JOptionPane.showMessageDialog(null, nombre + " Felidades Obtuviste una gorra");
            else if  (puntos == 20.000)
                JOptionPane.showMessageDialog(null,nombre + " Felidades Obtuviste un morral");
            else if (puntos == 30.000)
                JOptionPane.showMessageDialog(null,nombre + " Felidades Obtuviste una camiseta");
            else if (puntos == 40.000)
                JOptionPane.showMessageDialog(null,nombre + " Felidades Obtuviste una sudadera");
            else if (puntos == 50.000)
                JOptionPane.showMessageDialog(null,nombre + " Felidades Obtuviste unos tennis");
               
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
