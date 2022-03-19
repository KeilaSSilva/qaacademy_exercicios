package easy;

import javax.swing.JOptionPane;

public class Exercicio010 {
public static void main(String[] args) {
    double valorInvestimento, taxaJuros = 0.05, valorJuros=0, valorTotal;
    int i = 1;
    String valorInvestmentoStg = JOptionPane.showInputDialog("Digite um valor de investimento");
    valorInvestimento = Double.parseDouble(valorInvestmentoStg);
    
    while ( i<=10) {
        valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
        i = i + 1; //i++
    }

    valorTotal = valorJuros + valorInvestimento;

    System.out.println("Você Investiu:" + valorInvestimento);
    System.out.println("Rendeu:" + valorJuros + "de Juros");
    System.out.println("O valor total:"+ valorTotal);
}
}



    
