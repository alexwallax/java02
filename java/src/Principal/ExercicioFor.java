package Principal;

public class ExercicioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1;i <= 5; i++) {
			System.out.println(valor); 
			valor += "#";
		}
		
		System.out.println("\n");
		
		
		
		// fazendo o mesmo la�o sem usar valor num�rico
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
		
		

	}

}
 