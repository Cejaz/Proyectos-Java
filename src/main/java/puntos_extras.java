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
public class puntos_extras {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            short dado_1, dado_2,dado_3;
            
            dado_1 = Short.parseShort(JOptionPane.showInputDialog("Por favor ingrese el valor del primer dado"));
            
            dado_2 = Short.parseShort(JOptionPane.showInputDialog("Por favor ingrese el valor del segundo dado"));
             
            dado_3 = Short.parseShort(JOptionPane.showInputDialog("Por favor ingrese el valor del tercer dado"));
            
            if  
                (dado_1 == dado_2 && dado_2 == dado_3 && dado_1 == dado_3)
                JOptionPane.showMessageDialog(null,"Obtuviste 1000 puntos extras");
                
            else if
                (dado_1 == dado_2 || dado_2 == dado_3 || dado_1 == dado_3)
                    JOptionPane.showMessageDialog(null,"Obtuviste 500 puntos extras");
            else if
                (dado_1 != dado_2 && dado_2 != dado_3 && dado_1 != dado_3)
                    JOptionPane.showMessageDialog(null,"No obtuviste puntos extras");
                    
                    
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
