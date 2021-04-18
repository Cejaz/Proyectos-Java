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
public class nota_cuantitativa {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
           String nota;
           float nota_4 = 0, definitiva = 0;
            
            nota = JOptionPane.showInputDialog("Por favor indique si su nota es E, B, R, M o D").toUpperCase();
            
            switch (nota) {
                case "E" : nota_4 = 5 ;
                break;
                
                case "B" : nota_4 = 4;
                break;
                
                case "R" : nota_4 = 3;
                break;
                
                case "M" : nota_4 = 2;
                break;
                
                case "D" : nota_4 = 1;
                break;
              
            
            }
              
           definitiva = (3*0.25f) + (5*0.25f) + (2*.025f) + (nota_4*0.25f);
  
          
          JOptionPane.showMessageDialog(null,"El valor de su nota cuantitativa es: "  + nota_4 +  " y la nota definitiva es: " + definitiva);             
        }
       
         catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }  
    }
}
