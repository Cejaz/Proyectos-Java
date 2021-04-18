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
public class mayor_a_menor {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            int n1, n2,n3;
            
            n1 = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero "));
            n2 = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero "));        
            n3=  (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer numero "));
            
            
      if(n1>n2 && n2>n3)
           JOptionPane.showMessageDialog(null, n1+", "+n2+", "+n3);
            else if(n1>n3 && n3>n2)
                JOptionPane.showMessageDialog(null,n1+", "+n3+", "+n2);
                else if(n2>n1 && n1>n3)
                   JOptionPane.showMessageDialog(null,n2+", "+n1+", "+n3);
                    else if(n2>n3 && n3>n1)
                      JOptionPane.showMessageDialog(null,n2+", "+n3+", "+n1);
                         else if(n3>n1 && n1>n2)
                            JOptionPane.showMessageDialog(null,n3+", "+n1+", "+n2);
                            else if(n3>n2 && n2>n1)
                                JOptionPane.showMessageDialog(null,n3+", "+n2+", "+n1);
                     
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
