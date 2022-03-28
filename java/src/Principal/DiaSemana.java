package Principal;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// domingo -> 1
		// segunda -> 2
		// terça   -> 3
		// quarta  -> 4
		// quinta  -> 5
		// sexta   -> 6
		// sabado  -> 7
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String dia = entrada.next(); 
		
		if ("domingo".equals(dia.toLowerCase())) { // comparando uma string com uma variavel - esta convertendo o valor recebido pela variavel dia e coloca toda em minusculas
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("segunda")) { // comparando uma variavel com uma string - o IgnoreCase Iginora letras minusculas e maiusculas
			System.out.println("2");
		} else if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {  
			System.out.println("3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("6"); 
		} else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) { 
			System.out.println("7");
		} else { 
			System.out.println("Dia inválido!");
		}
		 
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
	}

}
