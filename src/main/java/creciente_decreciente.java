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
public class creciente_decreciente {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            int n1, n2, n3;
            
            n1 = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero "));
            n2 = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero "));        
            n3=  (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer numero "));
            
        if (n1<n2 && n2<n3)
             JOptionPane.showMessageDialog(null,"Los numeros estan introducidos en orden creciente");
          else
             JOptionPane.showMessageDialog(null,"Lo numeros esta introducidos en orden decreciente");
                  
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
