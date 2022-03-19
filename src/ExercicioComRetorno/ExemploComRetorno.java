package ExercicioComRetorno;

public class ExemploComRetorno {

    public static void main(String[] args) {
        String primeiroMetodo = verificarAprovacao();
        System.out.println(primeiroMetodo);
        String segundoMetodo = verificarFalta();
        System.out.println(segundoMetodo);
        String terceiroMetodo = verificarExame();
        System.out.println(terceiroMetodo);
        String quartoMetodo = verificarNome();
        System.out.println(quartoMetodo);
        String quintoMetodo = verificarChamada();
        System.out.println(quintoMetodo);

    }

    public static String verificarAprovacao() {
        int nota = 10;
        if (nota >= 5) {
            return "Aprovado" + (nota);

        } else {
            return "Reprovado";
        }

    }

    public static String verificarFalta() {
        int falta = 20;
        if (falta >= 20) {
            return "Aprovado" + (falta);

        } else {
            return "Reprovado";
        }
    }

    public static String verificarExame() {
        return "Exame";
    }



    public static String verificarNome() {
        return "nomeAluno";
    }

public static String verificarChamada(){
    return "numeroChamada";
}

}
