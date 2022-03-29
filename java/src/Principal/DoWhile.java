package Principal;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			String texto = "";
		
			do {
				System.out.println("Digite alguma palavra: ");
				System.out.println("Quer sair? digite sim ");
				texto = entrada.nextLine();
			} while (!texto.equalsIgnoreCase("sim")); 
		
		
			System.out.println("Obrigado!");
		entrada.close();

	}

}
