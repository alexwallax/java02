package Principal;

import java.util.Scanner;

public class Prog01 {

	// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10 & num % 2 == 0) {
			System.out.println("Número entre 0 e 10 e é par = " + num);
		} else {
			System.out.println("Número não entre 0 e 10 e não é par = " + num);
		}
		 
		entrada.close();

	}

}
