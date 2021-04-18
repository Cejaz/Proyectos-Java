
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* ALGORITMO

DEFINIMOS VARIABLES
String respuesta;

    INICIO 

    respuesta = escribir("por favor escriba la categoria a la que pertenece");

    switch (respuesta)
case "A" -> escribir(null,"La edad para esta categoria es hasta los 25 años : \n"
                        + "La cuota que debe pagar mensual es de: 256.000 \n"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
                
                
                case "B" -> escribir(null,"la edad para esta categoria es para personas mayores a 25 años hasta 45 años : \n"
                        + "La cuota que debe pagar mensual es de: 323.500"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
                        
                case "C" -> escribir(null,"La edad para esta categoria es  para las personas mayores de 45 años: \n"
                        + "La cuota que debe pagar mensual es de: $414200: \n"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
        
                default -> escribir(null,"Por favor seleccione la categoria correcta");
            }

             FIN
 *
 * @author sebas
 */
public class ExamenFinal {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
            String respuesta;
            
             respuesta = JOptionPane.showInputDialog("Por Favor escriba la categoria a la que: \n"
            + "A\n"
            + "B\n"
            + "C").toUpperCase();
             
             switch (respuesta){
                case "A" -> JOptionPane.showMessageDialog(null,"La edad para esta categoria es hasta los 25 años : \n"
                        + "La cuota que debe pagar mensual es de: 256.000 \n"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
                
                
                case "B" -> JOptionPane.showMessageDialog(null,"la edad para esta categoria es para personas mayores a 25 años hasta 45 años : \n"
                        + "La cuota que debe pagar mensual es de: 323.500"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
                        
                case "C" -> JOptionPane.showMessageDialog(null,"La edad para esta categoria es  para las personas mayores de 45 años: \n"
                        + "La cuota que debe pagar mensual es de: $414200: \n"
                        + "El copago servicios tipo 1 es de: $22500. Los servicios son: Exámenes de laboratorio,terapias: \n"
                        + "El copago para servicios tipo 2 es de: $27800. Los servicios son: Urgencias, Medicina,General:\n"
                        + "El copago para servicios tipo 3 es de: $36700. Los servicios son: Especialistas,Hospitalización diaria");
        
                default -> JOptionPane.showMessageDialog(null,"Por favor seleccione la categoria correcta");
            }
             

            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
}
