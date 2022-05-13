package classe;

public class Desafio {
	
	int a = 3;
	static int b = 4;

	public static void main(String[] args) {
		
		Desafio p = new Desafio(); // criar uma instancia para acessar a variavel fora do main	
		System.out.println(p.a);
		
		System.out.println(b); // a variavel sendo static não precisa instânciar 
		
	}

}
