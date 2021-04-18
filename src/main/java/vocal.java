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
public class vocal {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            char vocal;
            
            vocal = JOptionPane.showInputDialog("por favor ingrese un caracter").charAt(0);
            
            if
                (vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u'
                    ||vocal=='A'||vocal=='E'||vocal=='I'||vocal=='O'||vocal=='U')
                    JOptionPane.showMessageDialog(null,"la letra ingresada es una vocal");
            
            else
                JOptionPane.showMessageDialog(null,"la letra ingresada no es una vocal");  
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
