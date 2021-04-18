
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
public class cara_dado {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            short valor_cara=0;
            
            
            valor_cara = Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de la cara del dado"));
            
            switch(valor_cara){
                 case 1: JOptionPane.showMessageDialog(null,"cayo en 1");
                break;
                 case 2: JOptionPane.showMessageDialog(null,"cayo en 2");
                break;
                 case 3: JOptionPane.showMessageDialog(null,"cayo en 3");
                break;
                 case 4: JOptionPane.showMessageDialog(null,"cayo en 4");
                break;
                 case 5: JOptionPane.showMessageDialog(null,"cayo en 5");
                break;
                 case 6: JOptionPane.showMessageDialog(null,"cayo en 5");
                break;
                 default : JOptionPane.showMessageDialog(null,"inivalido");
                 break;
            }
            
               
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
