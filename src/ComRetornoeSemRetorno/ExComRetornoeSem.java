package ComRetornoeSemRetorno;



public class ExComRetornoeSem {
    
  


    public static void main(String[] args) {
        Nome("Keila");
        Sobrenome("Simao");
        Cidade("Sao Paulo");
        Signo("Peixes");
        Musica("Samba");
        valor("300.00");
        procedimento("Cirurgico");
        meses("4");
        protese("silicone");
        esperado("positivo");
        



    }
    private static void esperado(String string) {
	}
	private static void protese(String string) {
	}
	private static void meses(String string) {
	}
	private static void procedimento(String string) {
	}
	private static void valor(String string) {
	}
	public static void Nome(String Nome){
        System.out.println(Nome);
    }
    public static void Sobrenome(String Sobrenome){
        System.out.println(Sobrenome);           
               
    }
    public static void Cidade(String Cidade){
        System.out.println(Cidade);    
    }
    public static void Signo(String Signo){
        System.out.println(Signo);    
    }    
    public static void Musica(String Musica){
        System.out.println(Musica); 
        
    }
               
    
    public static Double valorConsulta(Double valor){
        return valor;
    }
    public static String metodo(String procedimento){
        return procedimento;
    }
    public static int recuperacao(int meses){
        return meses;
    }
    public static String material(String protese){
        return protese;
    } 
    public static String resultado(String esperado){
        return esperado;
    }
}








