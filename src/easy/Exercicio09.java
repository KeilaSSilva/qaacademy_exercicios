package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        int numero, i = 1;
        String numeroDigitado = JOptionPane.showInputDialog("Digite um numero");
        numero= Integer. parseInt(numeroDigitado);

        while (i <= 10) {
            System.out.println(numero *i);
            i = i + 1;
        }
    }
    
}
