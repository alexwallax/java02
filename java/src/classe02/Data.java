package classe02;

public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	Data() { 
		dia = 1;
		mes = 1;
		ano = 1970;
	} 
	
	public Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	public String obterData() {
		return String.format("%d/%d/%d\n\n", dia, mes, ano);
	}
	
	
}
