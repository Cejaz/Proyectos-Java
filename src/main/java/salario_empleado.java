/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class salario_empleado {
    public static void main(String[] args) {
        try {
            
            Scanner dato_teclado = new Scanner(System.in);
            
            DecimalFormat formatea = new DecimalFormat("###,###.##");
            
            String nombre_Empleado = "";
            
            int horas;
            double salario;
            double bruto; 
            double descuento = 0;

            System.out.println("Digite el nombre");
            nombre_Empleado = dato_teclado.nextLine();

            System.out.println("Digite el numero de horas");
            horas = dato_teclado.nextInt();

                if (horas < 172 || horas > 200) {
                System.out.println("El numero de horas digitado esta fuera de rango");
            } else {
                System.out.println("Digite el valor de las horas ");
                salario = dato_teclado.nextDouble();

                bruto = horas * salario;

                if (bruto > 2100000) {
                    descuento = bruto * 0.06;
                }
                
                System.out.println("Nombre: " + nombre_Empleado);
                System.out.println("Valor horas: " + formatea.format(salario));
                System.out.println("Horas trabajadas: " + horas);
                System.out.println("Salario en bruto: " + formatea.format(bruto));
                System.out.println("Descuento: " + formatea.format(descuento));
                System.out.println("Salario Neto: " + formatea.format(bruto - descuento));
            }
        } catch (Exception error) {

            System.out.println("Ocurrió un error en el programa");
            System.out.println(error.getMessage());
        }
        }
    }
