

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
public class nota_para_ganar {
    public static void main(String[] args) {
        
        try { //aqui va el programa
             String texto = "";
    
            double nota1 = 0;
            double nota2 = 0;
            double nota3 = 0;
            double nota4 = 0;
            
            double por1 = 0;
            double por2 = 0;
            double por3 = 0;
            double por4 = 0;
            double por5 = 0;
    
            double nota0 ;
            double necesita;
            
            texto = JOptionPane.showInputDialog("ingrese el primer porcentaje");
            por1 = Long.parseLong(texto);
            
            texto = JOptionPane.showInputDialog("Ingrese el segundo porcentaje");
            por2 =  Long.parseLong(texto);
            
            texto = JOptionPane.showInputDialog("ingrese el tercer porcentaje");
            por3 = Long.parseLong(texto);
            
            texto = JOptionPane.showInputDialog("ingrese el cuarto porcentaje");
            por4 = Long.parseLong(texto);
            
            texto = JOptionPane.showInputDialog("Ingrese el quinto porcentaje");
            por5 = Long.parseLong(texto);
             
             texto = JOptionPane.showInputDialog("ingrese la primera nota");
             nota1 = Long.parseLong(texto);
             texto = JOptionPane.showInputDialog("ingrese la segunda nota");
             nota2 = Long.parseLong(texto);
             texto = JOptionPane.showInputDialog("ingrese la terce nota");
             nota3 = Long.parseLong(texto);
             texto = JOptionPane.showInputDialog("ingrese la cuarta nota");
             nota4 = Long.parseLong(texto);
             
             nota0 = (por1/100) * nota1 + (por2/100)* nota2 + (por3/100) * nota3 + (por4/100) * nota4;
             necesita = (3 - nota0)/(por5/100);
 
            
            
            JOptionPane.showMessageDialog(null,"Para poder ganar debe sacar: " + necesita + " en la ultima nota " );
            
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
