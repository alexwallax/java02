package Principal;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			String valor = "";
			
			while(!valor.equalsIgnoreCase("sair")) {
				System.out.print("Digite algo: "); 
				valor = entrada.nextLine();
			}
		 
		entrada.close();

	}
 
}
