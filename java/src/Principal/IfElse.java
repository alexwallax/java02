package Principal;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor); // Tranfomando o valor recebido em um inteiro
		
		if(numero % 2 == 0) {
			System.out.println("N�mero par!");
		} else { 
			System.out.println("N�mero �mpar!");
		}

	}

}