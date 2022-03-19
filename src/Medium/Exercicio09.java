package Medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        String vetorAlunos[];
        int [] vetorNumeroAlunos;
        int i=0;
        vetorAlunos= new String [5];
        vetorNumeroAlunos = new int [5];


 
    while (i<=4){
        vetorAlunos[i]= JOptionPane.showInputDialog("Digite um nome");
        String vetorNumeroAlunosStg= JOptionPane.showInputDialog("Digite identificação");
        vetorNumeroAlunos[i] = Integer.parseInt(vetorNumeroAlunosStg);
        i++;
    }

    i=0; //Reset do valor da variável

    
    while (i<=4){
        System.out.println(vetorAlunos[i]);
        System.out.println(vetorNumeroAlunos[i]);
    }

    }
}
