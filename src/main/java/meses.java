
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
public class meses {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de mes"));
            
            
            if (mes >= 1 && mes <=12){
                
                switch (mes){
                    
                    case 1 -> JOptionPane.showMessageDialog(null,"El mes es enero y tiene 31 dias");
                    case 2 -> JOptionPane.showMessageDialog(null,"El mes es febrero y tiene 29 dias");
                    case 3 -> JOptionPane.showMessageDialog(null,"El mes es marzo y tiene 31 dias");
                    case 4 -> JOptionPane.showMessageDialog(null,"El mes es abril y tiene 30 dias");
                    case 5 -> JOptionPane.showMessageDialog(null,"El mes es mayo y tiene 31 dias");
                    case 6 -> JOptionPane.showMessageDialog(null,"El mes es junio y tiene 30 dias");
                    case 7 -> JOptionPane.showMessageDialog(null,"El mes es julio y tiene 31 dias");
                    case 8 -> JOptionPane.showMessageDialog(null,"El mes es agosto y tiene 31 dias");
                    case 9 -> JOptionPane.showMessageDialog(null,"El mes es septiembre y tiene 30 dias");
                    case 10 -> JOptionPane.showMessageDialog(null,"El mes es octubre y tiene 31 dias");
                    case 11 -> JOptionPane.showMessageDialog(null,"El mes es noviembre y tiene 30 dias");
                    case 12 -> JOptionPane.showMessageDialog(null,"El mes es diciembre y tiene 31 dias");
                    default -> JOptionPane.showMessageDialog(null,"Por favor introduzca el numero del mes indicado");
                }
            }
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}

