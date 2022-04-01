package Principal;

public class Switch {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Tekki Yodan");
		case "laranja":
			System.out.println("Sei o Tekki Sandan");
		case "vermelha":
			System.out.println("Sei o Tekki Nidan");
		case "amarela":
			System.out.println("Sei o Tekki Shodan"); 
			break;
			default:
				System.out.println("Não sei de nada");
		}
		
		System.out.println("Fim");

	}

}
