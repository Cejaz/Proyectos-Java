
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
public class convertir_horas {
    public static void main(String[] args) {
        
        try { //aqui va el programa
            
           float dias;
           float horas;
           float minutos;
           float segundos;
           float segundos_dias;
           float segundos_horas;
           float segundos_minutos;
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("Por favor ingrese los dias");
           dias = scanner.nextInt();
           
           System.out.println("Por favor ingrese las horas");
           horas = scanner.nextInt();
           
           System.out.println("Por favor ingrese los minutos");
           minutos = scanner.nextInt();
           
           System.out.println("Por favor ingrese los segundos " );
           segundos = scanner.nextInt();
            
           segundos_dias = dias * 86400;
           segundos_horas = horas * 3600;
           segundos_minutos = minutos * 60;
           
           System.out.println("El numero de dias en segundos es " + segundos_dias );
           System.out.println("El numero de horas en segundos es " + segundos_horas);
           System.out.println("El numero de horas en segundos es " + segundos_minutos);
           
        } catch (Exception ex) {            
            
            System.out.println("Ocurrió un error en el programa");            
            System.out.println(ex.getMessage());
            
        }        
    }
    
}
