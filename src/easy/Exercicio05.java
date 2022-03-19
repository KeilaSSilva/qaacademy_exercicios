package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int numero1,numero2,numero3;
        double  soma,subtracao,multiplicacao,media;
        
        String numero1Digitado = JOptionPane.showInputDialog("Digite o numero 1");
        String numero2Digitado = JOptionPane.showInputDialog("Digite o numero 2");
        String numero3Digitado = JOptionPane.showInputDialog("Digite o numero 3");

        numero1 = Integer. parseInt (numero1Digitado);
        numero2 = Integer. parseInt (numero2Digitado);
        numero3 = Integer. parseInt (numero3Digitado);
        
        soma = numero1+numero2+numero3;
        subtracao = numero1-numero2-numero3;
        multiplicacao = numero1*numero2*numero3;
        media = (soma)/3;

        System.out.println("O resultado da soma:"+soma);
        System.out.println("O resultado da subtração:"+subtracao);
        System.out.println("O resultado da mulplicação:"+multiplicacao);
        System.out.println("O resultado da média:"+media);
    }
}
