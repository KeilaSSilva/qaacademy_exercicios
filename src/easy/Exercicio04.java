package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero"));
        
        System.out.println("O resultado:"+numero*2);
       

    }
}
