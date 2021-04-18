
import javax.swing.JOptionPane;

public class mayor_de_tres_numeros {
    public static void main(String[] args) {

        try { // aqui va el programa

            String texto = "";

            short n1, n2, n3;

            texto = JOptionPane.showInputDialog("Introduzca primer número: ");
            n1 = (short) Long.parseLong(texto);

            texto = JOptionPane.showInputDialog("Introduzca segundo número: ");
            n2 = (short) Long.parseLong(texto);

            texto = JOptionPane.showInputDialog("Introduzca tercer número: ");
            n3 = (short) Long.parseLong(texto);

            if (n1 > n2) {
                if (n1 > n3) {
                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + n1);
                }

                else {
                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + n3);
                }
            } else if (n2 > n3) {
                JOptionPane.showMessageDialog(null, "El numero mayor es: " + n2);
            } else {
                JOptionPane.showMessageDialog(null, "El numero mayor es: " + n3);
            }

        } catch (Exception error) {

            System.out.println("Ocurrió un error en el programa");
            System.out.println(error.getMessage());

        }
    }

}
