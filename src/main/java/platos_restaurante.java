
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class platos_restaurante {
    public static void main(String[] args) {
      
      try { //aqui va el programa
          
            short opcion = 0;
            String Entrada = "", plato_fuerte = "", bebida = "";
            Scanner Teclado = new Scanner (System.in);  
            
          
          System.out.println("Ingrese opcion entrada: 1.ceviche, 2.crema, 3.patacon");
            opcion = Teclado.nextShort();
            
           switch (opcion){
              case 1:
                  Entrada = ("Ceviche");
                  break;
              case 2:
                  Entrada = ("Crema");
                  break;
              case 3:
                  Entrada = ("Patacon");
                  break;
              default:
                  Entrada = ("Error");
                  break;
                  
          }
         
          System.out.println("ingrese opcion plato fuerte: 1.pollo, 2.carne, 3.pescado");
           opcion = Teclado.nextShort();
           
           switch (opcion){
              case 1:
                  plato_fuerte = ("Pollo");
                  break;
              case 2:
                  plato_fuerte = ("Carne");
                  break;
              case 3:
                  plato_fuerte = ("Pescado");
                  break;
              default:
                  plato_fuerte = ("Error");
                  break;
                  
          }
          
         System.out.println("ingrese opcion bebida: 1.Cerveza, 2.Jugo, 3.Gaseosa");
          opcion = Teclado.nextShort();
          
          switch (opcion){
              case 1:
                  bebida =("Cerveza");
                  break;
              case 2:
                  bebida =("Jugo");
                  break;
              case 3:
                  bebida =("Gaseosa");
                  break;
              default:
                  bebida =("Error");
                  break;
                  
          }
          
          
            System.out.println("La persona escogio:" + Entrada + " " + plato_fuerte + " " + bebida);
            
        } catch (Exception error) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(error.getMessage());
            
        }        
    }
    }

