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
public class estudiante_aprueba {
    public static void main(String[] args) {

        try { // aqui va el programa

            float n1 = 50;
            int n2 = 63;
            short n3 = 9;
            byte n4 = 5;
            long n5 = 306;

            float nfinal = 0;

            nfinal = (n1 + n2 + n3 + n4 + n5) / 5;

            JOptionPane.showMessageDialog(null, "su resultado es: " + nfinal);

        } catch (Exception error) {

            System.out.println("Ocurrió un error en el programa");
            System.out.println(error.getMessage());

        }
    }

}
