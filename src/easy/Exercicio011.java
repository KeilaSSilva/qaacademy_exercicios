package easy;

import javax.swing.JOptionPane;

public class Exercicio011 {
    public static void main(String[] args) {
        int numeroDigitado, i = 1, soma;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        soma = numeroDigitado;

        while (i<=10) {
            soma=soma+2;
            System.out.println(soma);
            i++; 
            
        }

    }
    
}
