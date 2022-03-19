package Medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal, i =1;
        String investimentoDigitado = JOptionPane.showInputDialog("Digite valor do investimento");
        valorInvestimento=Double.parseDouble(investimentoDigitado);
        valorTotal = valorInvestimento;

        while (i <=10){
            valorTotal = ((valorTotal*taxaJuros) +valorTotal);
            i=i+1; //i++
        }

        valorJuros = valorTotal - valorInvestimento;

        System.out.println("Você investiu:" + valorInvestimento);
        System.out.println("Rendeu :" + valorJuros + "de Juros");
        System.out.println("O Valor total será :" + valorTotal);
    }
    
}

