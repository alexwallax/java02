package classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
	
		AreaCirc a2 = new AreaCirc(5);	
		
		System.out.println(a1.area());	
		System.out.println(a2.area());
		
		System.out.println(AreaCirc.PI); // imprimindo o valor PI da variavel PI do arquivo AreaCirc.Test.java
		System.out.println(Math.PI); // imprimindo o valor PI direto da versão do java 
	} 

}
