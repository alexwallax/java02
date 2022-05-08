package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415; // valor da variavel pertence a classe e nao a instância
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	} 
	
	double area() {
		return PI *  Math.pow(raio, 2) ; //pi * raio ao quadrado/ ou pi * raio * raio 
	}

}
