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
public class postre_gratis_switch {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            String texto ="" ;
            int plato_1=1,plato_2=2,plato_3=3;
            short respuestausuario;
           
            texto = JOptionPane.showInputDialog("Por favor ingrese el numero del plato que desee");
            respuestausuario = (short)  Long.parseLong(texto);
           
            if (respuestausuario == plato_1)
                JOptionPane.showMessageDialog(null,"Tienes un postre Gratis");
            else
                if (respuestausuario == plato_2)
                JOptionPane.showMessageDialog(null,"Tienes una bebida Gratis");
            else
                if (respuestausuario == plato_3)
                JOptionPane.showMessageDialog(null,"Tienes un postre y una bebida gratis");
         
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    
}
