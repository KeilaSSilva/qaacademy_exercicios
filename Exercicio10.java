package Medium;

public class Exercicio10 {
    public static void main(String[] args) {
        int elemento = 3;
        int [] fibonacci;
        fibonacci = new int [elemento];
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i< elemento) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[1 - 2];
            i++;
            
        }
    i = 0;
    while (i< elemento) {
    System.out.println("Termo: "+(i+1)+" - Valor: "+fibonacci[i]);
    i++;
    }
    }
}//fim
