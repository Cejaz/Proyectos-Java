
import java.awt.HeadlessException;
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
public class caja_registradora {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            long base=0,total_retiros=0,total_recaudos=0, saldo_caja = 0;
             String texto = "";
             
             
             texto = JOptionPane.showInputDialog("Ingrese la base de la caja");
             base = Long.parseLong(texto);
             
             total_recaudos = Long.parseLong(JOptionPane.showInputDialog("Ingrese el total de recadusos"));
             total_retiros = Long.parseLong(JOptionPane.showInputDialog("Ingrese el total de retiros"));
             
             saldo_caja = base + total_recaudos - total_retiros;
             
             JOptionPane.showMessageDialog(null,"El saldo final es " + saldo_caja);
             
             
             
        } catch (HeadlessException | NumberFormatException error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
 
}
