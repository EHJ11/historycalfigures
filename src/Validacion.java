import javax.swing.*;

public class Validacion {

    public static int pedirEntero(String mensaje, int min, int max) {
        int valor;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (Exception e) {
                valor = -1;
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public static String pedirTexto(String mensaje) {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(mensaje);
        } while (entrada == null || entrada.isBlank());
        return entrada;
    }
}
