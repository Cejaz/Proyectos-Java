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
public class postre_gratis {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            String respuestausuario;
           
            respuestausuario = JOptionPane.showInputDialog("Por favor ingrese el numero del plato que desee: 1 , 2 o 3");
            
           
            switch (respuestausuario){
                case "1" -> JOptionPane.showMessageDialog(null,"Usted recibe un postre gratis");
                case "2" -> JOptionPane.showMessageDialog(null,"Usted recibe una bebida gratis");
                case "3" -> JOptionPane.showMessageDialog(null,"Usted recibe un postre y una bebida gratis");
                default -> JOptionPane.showMessageDialog(null,"Por favor seleccione el numero del plato correcto");
            }
         
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
