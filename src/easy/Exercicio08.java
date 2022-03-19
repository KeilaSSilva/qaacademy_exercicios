package easy;

import javax.swing.JOptionPane;

public class Exercicio08 {
public static void main (String[]args) {
    double salario, IR= 0;
    String salarioStg = JOptionPane.showInputDialog("Digitar valor do salario");
    salario = Double.parseDouble(salarioStg);

    if (salario >0 && salario <=1903.98){
        System.out.println("Isento de Imposto de Renda");
    }
      
    if (salario >= 1903.98 && salario <= 2826.65){
        IR = ((salario * 0.075)- 142.80);   
    }

    if (salario >= 2826.66 && salario <= 3751.05){
        IR = ((salario * 0.15) - 354.80);
    }

    if (salario >=3751.06 && salario <= 4664.68){
        IR = ((salario * 0.225) - 636.13);
    }
    if (salario > 4664.69){
        IR = ((salario * 0.275) - 869.36);
    }

    System.out.println(" Salario Bruto"+ salario);
    System.out.println("Salario Liquido"+ (salario - IR));
    System.out.println("Imposto a pagar" + IR);
}

    
}
