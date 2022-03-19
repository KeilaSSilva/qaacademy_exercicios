package Medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        
    

    double i = 1, anterior=1, numeroDigitado;
    String numeroStg=JOptionPane.showInputDialog ("Digite um numero");
    numeroDigitado= Double.parseDouble(numeroStg);

           
    while(i<=5){
    
    if(numeroDigitado < anterior || i==1){
    anterior = numeroDigitado;
    }
    i++;
}
     System.out.println("O menor digitado é: "+anterior);
    }
}
